package E5WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDMethods {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();

		Set<String> windowes=driver.getWindowHandles();
		System.out.println("Windoes:"+windowes);
		String parent=driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(parent);
		//driver.close();
		Thread.sleep(500);
		//driver.quit();

	}
}
