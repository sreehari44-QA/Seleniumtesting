package B2Locators;

import org.openqa.selenium.chrome.ChromeDriver;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {
	public static void main(String[] arg){
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com");
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Sreehari");
		driver.findElement(By.id("loginpassword")).sendKeys("Password");
	}
}
