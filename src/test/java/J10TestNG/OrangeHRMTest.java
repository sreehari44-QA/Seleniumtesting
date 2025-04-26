package J10TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	WebDriver driver;
	
	@Test(priority=1)
	void testlogo()
	{
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	boolean string=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo:" +string);
	}
	@Test(priority=2)
	void testlogin()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	void closebrowser() {
		driver.findElement(By.cssSelector(".oxd-icon.bi-chevron-left"));
		//driver.close();
	}
}
