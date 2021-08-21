package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		String title="TestLeaf - Selenium Playground";
		String title1=driver.getTitle();
		
		if(title.equals(title1)) {
			System.out.println("In home page");
		}
		else {
			System.out.println("error");
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//div[@class='example'])[2]//a[1]")).click();
		String secondPage = "TestLeaf - Interact with Buttons";
		String page1 = driver.getTitle();
		
		if (secondPage.equals(page1)) {
			System.out.println("In Button Page");
		} else {
			System.out.println("Error");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//div[@class='example'])[3]//a[1]")).click();
		String thirdpage = "HTTP Status 404 – Not Found";
		String page2 = driver.getTitle();
		if (thirdpage.equals(page2)) {
			System.out.println("it is broken");
		} else {
			System.out.println("not broken");
		}
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//div[@class='example'])[4]//a[1]")).click();
		String fourthpage="TestLeaf - Selenium Playground";
		String page3=driver.getTitle();
		
		if(fourthpage.equals(page3)) {
			System.out.println("In home page");
		}
		else {
			System.out.println("error");
		}
		driver.navigate().back();
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]//a[1]")).click();
		int size = driver.findElements(By.tagName("a")).size();
		
		System.out.println("size=" + size);

}
}
