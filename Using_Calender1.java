package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Calender1
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");
		driver.findElement(By.xpath("//*[@id='onward_cal']")).click(); 
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				WebElement satheesh=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+i+"]/td["+j+"]"));
				if(satheesh.getText().equalsIgnoreCase("12"))
				{
					satheesh.click();
					break;
				}

			}

		}
	}
}
