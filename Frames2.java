package swdDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
         driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
         driver.findElement(By.xpath("//*[@id='name']")).sendKeys("selenium WebDriver");
         driver.switchTo().frame("frm1");
     WebElement d= driver.findElement(By.xpath("//*[@id='selectnav1']"));
     Select dd =new Select(d);
     dd.selectByIndex(27);
     driver.switchTo().defaultContent();
     driver.switchTo().frame("frm2");
     driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Satheeesh");
     driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Chaganti");
     driver.findElement(By.xpath("//*[@id='malerb']")).click();
     driver.findElement(By.xpath("//*[@id='englishchbx']")).click();
     driver.findElement(By.xpath("//*[@id='hindichbx']")).click();
     driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Satishchaganti@gmail.com");
     driver.findElement(By.xpath("//*[@id='password']")).sendKeys("s@1234");
     driver.switchTo().defaultContent();
     driver.findElement(By.xpath("//*[@id='Label1']/div[2]/span[12]/a")).click();

	}
	
}
