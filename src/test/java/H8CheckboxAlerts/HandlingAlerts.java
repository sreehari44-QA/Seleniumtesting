package H8CheckboxAlerts;

//import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		//Normal alert with OK button
		/*driver.findElement(By.xpath("")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		myalert.accept();
		System.out.println(myalert.getText());
		myalert.dismiss();
		 */
		// 2) conformation alert ok & Cancel
		/* driver.findElement(By.xpath(" ")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept(); //close alert using OK button
		//driver.switchTo().alert().dismiss();//close alert using cancel button
	
		//3)Prompt alert -input box
		 */
		driver.findElement(By.xpath("   ")).click();
		Thread.sleep(5000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome");
		myalert.accept();
	}

}
