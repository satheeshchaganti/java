package swdDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;

public class Using_Chrome_Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http:\\google.com");
	    // WebElement d=driver.findElement(By.id("gh-cat"));
	     //Select s=new Select(d);
	     // s.selectByIndex(6);
	     driver.findElement(By.name("q")).sendKeys("apple mobiles");
	  //   driver.findElement(By.name("btnK")).click();
	     
	     Actions a=new Actions(driver);
	     a.sendKeys(Keys.ENTER).perform();
	     
	}

}
