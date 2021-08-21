package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//div[@class='example'])[1]//img[1]")).click();
		String title="TestLeaf - Selenium Playground";
		String title1=driver.getTitle();
		
		if(title.equals(title1)) {
			System.out.println("In home page");
		}
		else {
			System.out.println("error");
		}
			driver.navigate().back();
			
			driver.findElement(By.xpath("(//div[@class='example'])[2]//img[1]")).click();
			System.out.println("it is broken image");
	}
}
