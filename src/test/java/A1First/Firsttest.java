package A1First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Firsttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Launch the Browser
		WebDriver driver=new ChromeDriver();
		//Open the URL
		driver.get("https://www.google.com/");
		String actualtext=driver.getTitle();
		if(actualtext.equals("Google"))
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

		System.out.println(driver.getTitle());

		driver.quit();
	}

}
