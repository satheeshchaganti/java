package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Calender2
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month to select:");
		String mon=sc.next();
		mon=mon.substring(0,3);
		System.out.println("enter date to click");
		String date=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click(); 
		while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equalsIgnoreCase(mon))
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				WebElement satheesh=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
				if(satheesh.getText().equalsIgnoreCase(date))
				{
					satheesh.click();
					break;
				}

			}

		}

	}

}
