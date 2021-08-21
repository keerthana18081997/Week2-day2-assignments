package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dropdownIndex = driver.findElement(By.id("dropdown1"));
		Select Index= new Select(dropdownIndex);
		Index.selectByIndex(3);
		String a = Index.getFirstSelectedOption().getText();
		System.out.println("a" + a);
		
		WebElement dropdownText = driver.findElement(By.name("dropdown2"));
		Select text= new Select(dropdownText);
		text.selectByVisibleText("Selenium");
		String b = text.getFirstSelectedOption().getText();
		System.out.println("b" + b);
		
		WebElement dropdownValue = driver.findElement(By.id("dropdown3"));
		Select value= new Select(dropdownValue);
		value.selectByValue("2");
		String c = text.getFirstSelectedOption().getText();
		System.out.println("c" + c);
		
		WebElement dropdownOption = driver.findElement(By.className("dropdown"));
		Select option= new Select(dropdownOption);
		option.selectByVisibleText("Loadrunner");
		String d = option.getFirstSelectedOption().getText();
		System.out.println("d" + d);
		
		WebElement sendkey = driver.findElement(By.xpath("(//div[@class='example'][5])//select"));
		sendkey.sendKeys("Appium");
			
		
		WebElement dropdownProgram = driver.findElement(By.xpath("(//div[@class='example'][5])//select"));
		Select program= new Select(dropdownProgram);
		program.selectByVisibleText("Selenium");
		String e = text.getFirstSelectedOption().getText();
		System.out.println("e" + e);
	
	}
}
