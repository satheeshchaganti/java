package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Playing_trending_songs 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http:\\google.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("best video songs online telgu  ");
        Actions a=new Actions(driver);
	     a.sendKeys(Keys.ENTER).perform();
	     driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[2]/div[2]/div[2]/div/div/video-voyager/div/div[1]/div[1]/a/div")).click();
	}

}
