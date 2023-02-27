package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
        driver.get("https://courses.letskodeit.com/practice");
      WebElement d= driver.findElement(By.xpath("//*[@id='multiple-select-example']"));
      Select s=new Select(d);
//          s.isMultiple();
//       Select s=new Select(d);
//       s.selectByValue("apple");
//       s.selectByValue("orange");
//       s.selectByValue("peach");
//       Thread.sleep(5000);
////      s.deselectByValue("apple");
       for(int i=0;i<s.getOptions().size();i++)
       {
    	  s.selectByIndex(i) ;
       }
    	 // Thread.sleep(5000);
    	  s.deselectByIndex(1);
    	  driver.findElement(By.xpath("//*[@id='benzradio']")).click();  
    	  driver.findElement(By.xpath("//*[@id='bmwcheck']")).click();  
//    	  WebElement dd= driver.findElement(By.xpath("//*[@id=carselect']"));
//          Select s1=new Select(dd);
//          s1.deselectByValue("honda");
	

	
		
	}

}

