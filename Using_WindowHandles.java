package swdDemos;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_WindowHandles {


	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://ebay.com");
		String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
        driver.findElement(By.linkText("Daily Deals")).sendKeys(keycomb);
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        //String winId=driver.getWindowHandle();
        System.out.println(title);
        System.out.println(url);
        //System.out.println(winId);
        Set<String> winIds=driver.getWindowHandles();
        
        for(String id:winIds)
        {
        	//driver.switchTo().window(id);
        	System.out.println(id);
        }
        
        
        
	}

}
