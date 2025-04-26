package B2Locators;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.MemberSubstitution.Current;
//import org.testng.annotations.Test;

public class Dropdown {

	public static void main(String[] arg) throws InterruptedException {
		WebDriver driver= new ChromeDriver();


		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("ApplWatch");
		//List<WebElement> all = driver.findElements(By.)
	//	driver.findElement(By.linkText("Kilos")).click();
				//Thread.sleep(30);
		//driver.navigate().to("https://www.flipkart.com/");
				//Thread.sleep(50);
			//	driver.findElement(By.linkText("Mobiles")).click();
	WebElement menu=driver.findElement(By.xpath("//img[@alt='Fashion']"));
	Actions action = new Actions(driver);
	action.moveToElement(menu).perform();
	//Thread.sleep(30);
	WebElement submenu =driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[2]/object[1]/a[2]"));
	Thread.sleep(50);
	submenu.click();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.navigate().forward();
	driver.close();
	
	}
}