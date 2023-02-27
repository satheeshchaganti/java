package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		WebElement ddIcon=driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span/span"));
		Actions a=new Actions(driver);
		a.moveToElement(ddIcon).perform();	//moving mouse to dropdown icon
		
		driver.findElement(By.xpath("//*[@id='nav-al-wishlist']/a[5]/span")).click();

	}

}
