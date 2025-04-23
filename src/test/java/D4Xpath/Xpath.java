package D4Xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] aregs) {
		WebDriver driver= new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		//Absulete xpath(/), do not use for the attribute,traverse through the parent to root till the element prsent
		//Relative Xpath(//) worked with the attributes,jump to find the element by using attibute
		
		//manual
		// tagname[@attribute="value"]
		//*[@attribute="value"]
		//inner text- text()
		// //a[text()='desktops']
		// contain and start-with
		//div[contains(@placeholder,'ser')]
		//start-with(@placeholder,'ser')]
		//div[@id="  "]/a/img)
		
		
	}

}
