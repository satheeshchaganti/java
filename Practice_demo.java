package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_demo 
{

	public static void main(String[] args) 
	{
     System.setProperty("werbdriver.chrome.driver","E:\\selenium software\\BrowserDriver109\\ChromeDriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http:\\ebay.com");
     String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
     driver.findElement(By.linkText("Daily Deals")).sendKeys(keycomb);
     String title=driver.getTitle();
     String Url=driver.getCurrentUrl();
     {
    	 System.out.println(Url+"==>"+title);
     }
     

	}

}
