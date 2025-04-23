import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.findElement(By.className("inputtext")).sendKeys("sreehari");
		WebElement day1=driver.findElement(By.id("day"));
		Select dateselect= new Select(day1);
		Thread.sleep(200);
		dateselect.selectByIndex(15);
		
		WebElement mselect=driver.findElement(By.id("month"));
		Select monselect=new Select(mselect);
		Thread.sleep(200);
		monselect.selectByVisibleText("Jan");
		
		WebElement yselect=driver.findElement(By.id("year"));
		Select yeselect=new Select(yselect);
		Thread.sleep(200);
		yeselect.selectByValue("1987");
		
		WebElement gender=driver.findElement(By.className("_8esa"));
		Select mgender=new Select(gender);
		mgender.selectByIndex(1);
	}

}
