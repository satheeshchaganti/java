package swdDemos;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Company to Search : ");
		String comp=sc.nextLine();
		String cntry=null;
		boolean isExist=false;
		
		System.setProperty("webdriver.chromedriver", "C:\\Users\\sathe\\Downloads\\chromedriver_win32");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//1. Identify all the rows Collection
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	
		for(int i=2;i<=rows.size();i++)
		{
			String webComp=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td")).getText();
			
			if(webComp.equalsIgnoreCase(comp))
			{
				isExist=true;
				cntry=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[3]")).getText();
				System.out.println("'" + comp +"' Company is available in the county : " + cntry);
				break;
			}
		}
		
		if(isExist==false)
		
			System.out.println("'" + comp +"' Company is NOT avaiable in the webtable...");

	}

}
