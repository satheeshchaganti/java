package swdDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Using_Links2
{

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter link to select:");
		String linktoselect=sc.nextLine();
		boolean isExist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:/ebay.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			//String weblink=link.getText();
			if(link.getText().equalsIgnoreCase(linktoselect))
			{
				isExist=true;
				driver.findElement(By.partialLinkText(link.getText())).click();
				break;
			}
		}
	   if(isExist==false)	
		{
			System.out.println("the link is not available in page......");
		}
//		File fsource=((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);
//		String dt=new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
//		File fDest=new File("C:\\programs Screenshots//ebayerror_"+dt+"_.png");
//		FileHandler.copy(fsource, fDest);
	}

}
