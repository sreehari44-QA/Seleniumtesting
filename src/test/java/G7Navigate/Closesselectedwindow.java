package G7Navigate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closesselectedwindow {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("url");
		
		driver.findElement(By.xpath(""));
		
		Set<String> webid=driver.getWindowHandles();
		
		for(String winid:webid)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
			
		if(title.equals(" "))
		{
			driver.close();//close the title equal window
		}
		}
		
		}

}
