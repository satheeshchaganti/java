package swdDemos;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting_withExcel 
{

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\sathe\\Downloads\\Book1.xlsx");
		XSSFSheet ws= wb.getSheet("Sheet1") ; 
		int rows=ws.getPhysicalNumberOfRows();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com");
		
		for(int i=1;i<rows;i++)
		{
			String cat=ws.getRow(i).getCell(0).getStringCellValue();
			String prod=ws.getRow(i).getCell(1).getStringCellValue();
					
			
			WebElement dd=driver.findElement(By.id("gh-cat"));
			Select s=new Select(dd);
			s.selectByVisibleText(cat);
			
			WebElement txt=driver.findElement(By.id("gh-ac"));
			txt.clear();
			txt.sendKeys(prod);
			
			driver.findElement(By.id("gh-btn")).click();
		}


	}

}
