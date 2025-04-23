package C3CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssseletor {
	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	//driver.get("https://www.demo.nopcommerce.com");
	driver.get("https://www.demoblaze.com/index.html");
	driver.manage().window().maximize();
	//tag id	tag#id
	//tag class	tag.classname
	//tag attribute tag[attribute="value"]
	driver.findElement(By.cssSelector("a[data-toggle=\'modal\']")).click();
	//tag class attribute tag.classname[attribute="value"]
	}

}
