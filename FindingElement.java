package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("http://ebay.com");
		String keycomb=Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.partialLinkText("Daily")).sendKeys(keycomb);
	      String title=driver.getTitle();
	      String Url=driver.getCurrentUrl();
	
	
	}

}
