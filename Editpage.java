package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("keerthanaravichandra@gmail.com");
		
		WebElement ass=driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/following::input"));
		ass.sendKeys("a");
		ass.sendKeys(Keys.TAB);
		
		String ab=driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println(ab);
		
		driver.findElement(By.xpath("(//div[@class='row'])[4]//input")).clear();
		
		boolean a=driver.findElement(By.xpath("(//div[@class='row'])[5]//input")).isEnabled()==false;
		if(a==false) {
			System.out.println("editable");
		}
		else {
			System.out.println("not editable");
		}
		
		
	          
}
}

