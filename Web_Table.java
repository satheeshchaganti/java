package swdDemos;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table
{

	public static void main(String[] args) 
	{
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.w3schools.com/html/html_tables.asp");
   List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
       for(int i=2;i<=rows.size();i++)
       {
            List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td"));
       for(int j=1;j<=cols.size();j++)
       {
    	     WebElement cell=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
    	     System.out.print(cell.getText()+"||");
       }
       System.out.println();
       }
	
       
       
       }

}

  