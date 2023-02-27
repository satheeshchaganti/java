 package swdDemos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Finding_Dropdown 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\ebay.com");

		WebElement d=driver.findElement(By.id("gh-cat"));
		Select s=new Select(d);
		s.selectByIndex(6);
		driver.findElement(By.id("gh-ac")).sendKeys("sony");
		driver.findElement(By.id("gh-btn")).click();
		WebElement e= driver.findElement(By.xpath("//*[@id='srp-river-results']/ul/li[1]/div/div[2]/a/div/span"));
		e.click();
		Thread.sleep(3000);
		Set<String>window=driver.getWindowHandles();
		Iterator<String> page=window.iterator();
		String window1=page.next();
		String window2=page.next();
		driver.switchTo().window(window2);

		JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id='TABS_SPR']/span")));

		driver.findElement(By.xpath("//*[@id='TABS_SPR']/span")).click();
		
	Reporter.log("the element is successfully opened",true);
	}

}

