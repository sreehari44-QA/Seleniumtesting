package E5WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conditional {
	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-blink-features=AutomationControlled");
    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
    options.setExperimentalOption("useAutomationExtension", false);
    options.addArguments("start-maximized");
    options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/110.0.5481.77 Safari/537.36");
    
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("ico-register")).click();
	
	WebElement log=driver.findElement(By.className(""));
	System.out.println(log.isDisplayed());
	
	WebElement status=driver.findElement(By.className(""));
	System.out.println(status);
	
	}

}

