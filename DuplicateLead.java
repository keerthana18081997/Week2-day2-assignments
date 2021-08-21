package Week2Assignmets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[3]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("@g");
		driver.findElement(By.xpath("(//button[@class=\"x-btn-text\"])[7]")).click();
        Thread.sleep(2000);
		String firstName = driver
				.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]/a")).getText();
		driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-firstName\"]/a")).click();
		driver.findElement(By.xpath("(//a[@class=\"subMenuButton\"])[1]")).click();
		String duplicateTitle = driver.getTitle();
		if (duplicateTitle.contains("Duplicate Lead"))
			System.out.println("it contains duplicate lead");
		else
			System.out.println("no duplicates lead");
		driver.findElement(By.className("smallSubmit")).click();
		String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (firstName.equals(duplicateLeadName))
			System.out.println("Original Lead Name is same");
		else
			System.out.println("Original Lead Name is not same");
		driver.close();

}
}