package swdDemos;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Frames 
{
  public static void main(String[] args) throws InterruptedException
	{
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
   // driver.findElement(By.xpath("//*[@id='main']/div[3]/a")).click();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20) );
    //Thread.sleep(5000);
     driver.switchTo().frame("iframeResult");
     driver.findElement(By.xpath("/html/body/button")).click();
     String str=driver.switchTo().alert().getText();
     System.out.println(str);
     driver.switchTo().alert().accept();

	}

}
