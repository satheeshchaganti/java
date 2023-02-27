 package swdDemos;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class usingcloseandquit 
{

	public static void main(String[] args) 
	{
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://ebay.com");
			//driver.navigate().to("http://amazon.in");
			//driver.navigate().back();
			String keycomb=Keys.chord(Keys.CONTROL ,Keys.RETURN);
			driver.findElement(By.linkText("Daily Deals")).sendKeys(keycomb);
			String	 title=driver.getTitle();
		    Set<String> winIds=driver.getWindowHandles();
				for(String Id: winIds)
			{
				driver.switchTo().window(Id);
				System.out.println(Id+"==>"+driver.getTitle());
			
			}	
	}
}
