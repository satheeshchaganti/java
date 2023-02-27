package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 class Opening_Browser 
{

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://ebay.com");
//driver.navigate().to("http://amazon.in");
//driver.navigate().back();
 String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
 driver.findElement(By.linkText("Daily Deals")).sendKeys(keycomb);
String title=driver.getTitle();
String Url=driver.getCurrentUrl();
System.out.println(Url+"==>"+title);
driver.close();
	
	
	

	
	}

	
		
	}


