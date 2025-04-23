package H8CheckboxAlerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] arg) throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("URL");
		driver.manage().window().maximize();
		
		//1)Select specific checkbox
		//driver.findElement(By.xpath(" ")).click();
		
		//2) Select all the checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath(" //input[@class='form-check-input"));
		
		/*for(int i=0;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}*/
		//enhansed forloop
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		//3) select last 3 checkboxes
		/*for(int i=5;i<checboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		// 4)select first 3 checkboxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		// 5)unselect checboxes if they are selected
		for(int i=0;i<3;i++) 
		{
			checkboxes.get(i).click();
		}
		Thread.sleep(5000);
		for(int i=0;i<checkboxes.size();i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
		}}
		
	}

}
