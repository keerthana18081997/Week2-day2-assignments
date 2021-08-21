package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[@id='first'])//label[1]")).click();
		
		boolean option1 = driver.findElement(By.xpath("(//div[@class='example'][2])//label[2]")).isSelected();
		boolean option2 = driver.findElement(By.xpath("(//div[@class='example'][2])//label[3]")).isSelected();
		if(option1=true) {
			System.out.println("Unchecked");
		}
		else if(option2=true) {
			System.out.println("checked");
		}
		else {
			System.out.println("non of the radion button is selected");
		}
		
		boolean opt1 = driver.findElement(By.xpath("(//div[@class='row'])[3]//input[2]")).isSelected();
		if(opt1==true) {
			System.out.println("age btwn 21-40");
		}
		else {
			driver.findElement(By.xpath("(//div[@class='row'])[3]//input[2]")).click();
			System.out.println("age btwn 21-40 option selected");
		}
}
}