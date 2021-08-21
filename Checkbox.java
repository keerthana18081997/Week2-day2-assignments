package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//input)[1]")).click();
		driver.findElement(By.xpath("(//input)[3]")).click();
		driver.findElement(By.xpath("(//input)[4]")).click();
		driver.findElement(By.xpath("(//input)[5]")).click();
		
		boolean no = driver.findElement(By.xpath("((//div[@class='example'][2])//div[1]")).isSelected();
		if(no==true) {
			System.out.println("checked");
		}
		else {
			System.out.println("unchecked");
		}
		
		WebElement opt1 = driver.findElement(By.xpath("(//div[@class='example'][3])//div[1]"));
		WebElement opt2 = driver.findElement(By.xpath("(//div[@class='example'][3])//div[2]"));
		if(opt1.isSelected()==true) {
			opt1.click();
			System.out.println("option deselected");
		}
		else if(opt2.isSelected()==true) {
			opt2.click();
			System.out.println("option deselected");
		}
		
	
	driver.findElement(By.xpath("(//div[@class='example'][4])//div[1]")).click();
	driver.findElement(By.xpath("(//div[@class='example'][4])//div[2]")).click();
	driver.findElement(By.xpath("(//div[@class='example'][4])//div[3]")).click();
	driver.findElement(By.xpath("(//div[@class='example'][4])//div[4]")).click();
	driver.findElement(By.xpath("(//div[@class='example'][4])//div[5]")).click();
	}

}