package B2Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleto {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		
		List<WebElement> select=driver.findElements(By.xpath("//div/span[contains(.,'selenium')]"));
		Thread.sleep(30);
		for(WebElement a : select) 
		{
			System.out.println(a.getText());	
		}
		//driver.close();
	}
}

