package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//button[1]")).click();
		String title="TestLeaf - Selenium Playground";
		String title1=driver.getTitle();
		
		if(title.equals(title1)) {
			System.out.println("In home page");
		}
		else {
			System.out.println("error");
		}
		driver.navigate().back();
		
		Point loc=driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		System.out.println("Location = "  + loc);
		
		String Color = driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color");
		System.out.println("color is " + Color);
		
		
		Dimension size = driver.findElement(By.xpath("//button[@id='size']")).getSize();
		System.out.println("size is" + size);
		
				

}
}
