package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatContact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("keerthana");
	    driver.findElement(By.id("lastNameField")).sendKeys("ravichandran");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("keerthu");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("karthi");
        driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information and Technology");
        driver.findElement(By.id("createContactForm_description")).sendKeys("text");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("keerthanaravichandra@gmail.com");

		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option=new Select(state);
		option.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("important note");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	     String s=driver.getTitle();
		System.out.println("Title" +s);
}
}
