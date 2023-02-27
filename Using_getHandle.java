package swdDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getHandle 
{

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("http://ebay.com");
	driver.navigate().to("http://amazon.in");
	driver.navigate().back();
	}

}
	