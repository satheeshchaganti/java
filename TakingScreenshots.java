package swdDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class TakingScreenshots 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");

		File fSource= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dt=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		File fDest=new File("C:\\programs Screenshots\\amazonPic_" + dt + ".png");
		FileHandler.copy(fSource, fDest);

		Reporter.log("amazon screenshot succesfully captured...",true);
	}

}
