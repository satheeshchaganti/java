package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Runtime 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the category:");
		String cat=sc.nextLine();
		System.out.println("Enter the product:");
		String prod=sc.nextLine();
		boolean isExist=false;
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http:\\ebay.com");
	     WebElement d=driver.findElement(By.id("gh-cat"));
	    Select s=new Select(d);
	    List<WebElement> items=s.getOptions();
	    for(WebElement item:items)
	    {
	    	String webcat=item.getText();
	    	if(webcat.equalsIgnoreCase(cat))
	    	{
	    		isExist=true;
	    		s.selectByVisibleText(webcat);
	     driver.findElement(By.id("gh-ac")).sendKeys("prod");
	     driver.findElement(By.id("gh-btn")).click();
	     break;
	    	}
	    }
	    if(isExist==false)
	    {
	    	System.out.println("specified category is not available");
	    }
	}

}
