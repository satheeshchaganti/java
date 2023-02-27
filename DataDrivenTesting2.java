package swdDemos;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenTesting2 
{

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\sathe\\Downloads\\Book2.xlsx");
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
			File fSource= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String dt=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
			File fDest=new File("C:\\programs Screenshots\\TrailPic_" + dt + ".png");
			FileHandler.copy(fSource, fDest);
		
		}


	}

}
