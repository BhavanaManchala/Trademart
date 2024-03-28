package Trademart_Testcases;

import org.testng.annotations.Test;

import Trademart_PageObject.Trademart_ManageGroupandPhotoBank_POM;
import Trademart_PageObject.Trademart_SellerLoginPOM;

public class Trademart_ManageGroupandPhotoBank_TestClass extends Trademart_SellerBase
{
	@Test()
	public void Trademart_ManageBuyingRequirementSeller() throws InterruptedException
	{
			Trademart_SellerLoginPOM tlp= new Trademart_SellerLoginPOM(driver);
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
			
			Trademart_ManageGroupandPhotoBank_POM tmp = new Trademart_ManageGroupandPhotoBank_POM(driver);
			Thread.sleep(2000);
			tmp.clickmanagegroup();
			log.info("Manage Group and Photo bank is clicked");
			Thread.sleep(2000);
			tmp.clickcreategroup();
			log.info("Create/Add Group is clicked");
			Thread.sleep(2000);
			tmp.setgroupname();
			log.info("Group name is entered");
			Thread.sleep(2000);
			tmp.clickuploadimage();
			log.info("Upload image is clicked");
			Thread.sleep(2000);
			tmp.clickchoosefile();
			log.info("choose file is clicked and image uploaded");
			Thread.sleep(2000);
			tmp.clickdone();
			log.info("Done is clicked");
			Thread.sleep(2000);
			tmp.clickcreate();
			log.info("Create is clicked");
			Thread.sleep(2000);
			tmp.clickmanagegroup();
			log.info("Manage Group and Photo bank is clicked");
			Thread.sleep(2000);
			tmp.scrollwindow();
			log.info("Window is Scrolled");
			Thread.sleep(2000);
			tmp.clickeditgroup();
			log.info("Edit group symbol is clicked");
			Thread.sleep(2000);
			tmp.clickrename();
			log.info("Rename is clicked");
			Thread.sleep(2000);
			tmp.enterrename();
			log.info("Another Name is Entered");
			Thread.sleep(2000);
			tmp.clickrenamenow();
			log.info("Rename now is clicked");
			Thread.sleep(2000);
			tmp.clickuploadnew();
			log.info("Uploadnew is clicked");
			Thread.sleep(2000);
			tmp.clickuploadimage();
			log.info("Upload image is clicked");
			Thread.sleep(2000);
			tmp.clickchoosefile1();
			log.info("choose file is clicked and image uploaded");
			Thread.sleep(2000);
			tmp.clickdone();
			log.info("Done is clicked");
			Thread.sleep(2000);
			tmp.clickuploadnow();
			log.info("Uploadnow is clicked");
			Thread.sleep(2000);
			tmp.clickmanagegroup();
			log.info("Manage Group and Photo bank is clicked");
			Thread.sleep(2000);
			tmp.scrollwindow();
			log.info("Window is Scrolled");
			Thread.sleep(2000);
			tmp.clickeditgroup();
			log.info("Edit group symbol is clicked");
			Thread.sleep(2000);
			tmp.clickselectallcheckbox();
			log.info("Select all checkbox is clicked");
			Thread.sleep(2000);
			tmp.clickdelete();
			log.info("Delete is clicked");
			Thread.sleep(2000);
			tmp.clickalert();
			log.info("Alert is clicked");
			Thread.sleep(2000);
			tmp.clickback();
			log.info("Back is clicked");
			Thread.sleep(2000);
			tmp.scrollwindow();
			log.info("Window is Scrolled");
			Thread.sleep(2000);
	}

}
