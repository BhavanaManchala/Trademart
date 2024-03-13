package Trademart_Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Trademart_Utilities.Trademart_LoginReadConfig;

public class Trademart_Login_Base 
{
	public static WebDriver driver;
	public static Logger log;
	Trademart_LoginReadConfig rc= new Trademart_LoginReadConfig();
	
	public String url=rc.openapplication();
	public String email=rc.emailid();
	public String password=rc.password();

	@BeforeClass
	@Parameters("browser")
	public void openapplication(String br)
	{
		if(br.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("Trademart Application is opened");
		
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\Log4j.properties") ;
	}
	
	@AfterClass()
	public void closeapplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
	
	public void CaptureScreen(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".png");
		FileHandler.copy(src,target);
	}
}
