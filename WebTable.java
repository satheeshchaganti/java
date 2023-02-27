package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable 
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");

        driver.findElement( By.xpath("//*[@id='input']")).sendKeys("html tables");
       Actions a=new Actions(driver);
        a.sendKeys(Keys.ENTER).perform();
       // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
       // driver.findElement( By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3")).click();

	}

}
