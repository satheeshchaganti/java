package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opening_Firefox 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.driver.chromeDriver"," C:\\Users\\sathe\\Downloads\\chromedriver_win32.zip");
		driver.manage().window().maximize();
		driver.get("http:\\ebay.com");
		//String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.id("gh-ac")).sendKeys("bestmobiles");
        driver.findElement(By.id("gh-btn")).click();
       // String url=driver.getCurrentUrl();
       // String title=driver.getTitle();
	}

}
