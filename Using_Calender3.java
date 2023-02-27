package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Calender3  {

	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month to select");
		String mon=sc.next();
		mon=mon.substring(0, 3);
		System.out.println("enter date to select");
		String date=sc.next();
		//System.setProperty("webdriver.chromedriver","C:\Users\sathe\Downloads\chromedriver_win32\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/redbus.in");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click();
		while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0, 3).equalsIgnoreCase(mon))
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
				if(cell.getText().equalsIgnoreCase(date))
				{
					cell.click();
					break;
				}
			}
		}
		driver.findElement(By.xpath("//*[@id='src']")).sendKeys("khammam");
		 Actions a=new Actions(driver);
         a.sendKeys(Keys.ENTER).perform();

		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("hyderabad");
		Actions b=new Actions(driver);
        b.sendKeys(Keys.ENTER).perform();



	}
}