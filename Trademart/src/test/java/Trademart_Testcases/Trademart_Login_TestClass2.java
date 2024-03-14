package Trademart_Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Trademart_Utilities.DataDriven_XL;
import Trademart_PageObject.Trademart_LoginPOM;

public class Trademart_Login_TestClass2 extends Trademart_Login_Base
{
	@Test(dataProvider="TestData")
	public void loginTest(String email,String password) throws InterruptedException, IOException
	{
		String path= System.getProperty("user.dir")+"\\ExcelSheets\\TestData.xlsx";
		Trademart_LoginPOM tlp= new Trademart_LoginPOM(driver);
		Thread.sleep(2000);
		tlp.clicklogin();
		log.info("Login of Trademart is clicked");
		Thread.sleep(2000);
		tlp.setemail(email);
		log.info("Email is entered");
		Thread.sleep(2000);
		tlp.setpassword(password);
		log.info("Password is entered");
		Thread.sleep(2000);
		tlp.clickloginbutton();
		log.info("Login is clicked");
		Thread.sleep(2000);
		String Exp_Result="User Dashboard Trademart";
		String Act_Result=driver.getTitle();
		
		if(Exp_Result.equals(Act_Result))
		{
			Assert.assertTrue(true);
			log.info("Test case is passed");
			for(int i=1;i<=3;i++) 
			   {
				   for(int j=2;j<=2;j++)
				   {
					   DataDriven_XL.setCellData(path, "Sheet1", i, j,"pass");
					   DataDriven_XL.fillGreenColor(path, "Sheet1", i, j);
				   }
			   }
		}
		else
		{
			log.info("Test case is failed");
			CaptureScreen(driver,"loginTest");
			log.info("Screenshot is taken");
			for(int i=1;i<=3;i++) 
			   {
				   for(int j=2;j<=2;j++)
				   {
					   DataDriven_XL.setCellData(path, "Sheet1", i, j,"fail");
					   DataDriven_XL.fillRedColor(path, "Sheet1", i, j);
				   }
			   }
            driver.navigate().refresh();
			Assert.assertTrue(false);
		}
	}
	@DataProvider(name="TestData")
	String [][] getdata() throws IOException
	{
		String path= System.getProperty("user.dir")+"\\ExcelSheets\\TestData.xlsx";
		int rownum=DataDriven_XL.getRowCount(path, "Sheet1");
		int colcount=DataDriven_XL.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		 
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++) 
			{
				logindata[i-1][j]=DataDriven_XL.getCellData(path,"Sheet1",i,j);//1 0
			}
		}
		return logindata;
	}

}
