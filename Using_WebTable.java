package swdDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_WebTable
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//1. Identify all the rows Collection
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));

		//2. Iterate between each row
		for(int i=2;i<=rows.size();i++)
		{
			//3. Identify all the columns in every row
			List<WebElement> cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td"));			

			//4. Iterate between each column
			for(int j=1;j<=cols.size();j++)
			{
				//5. Fetch the cell data at the intersection or row and column
				WebElement cell=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"));

				System.out.print(cell.getText() + " || ");
			}
			System.out.println();
		}

	}

}
