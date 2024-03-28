package Trademart_Testcases;

import org.testng.annotations.Test;

import Trademart_PageObject.Trademart_SellerLoginPOM;
import Trademart_PageObject.Trademart_BuyerLoginPOM;
import Trademart_PageObject.Trademart_BuyerPOM;
import Trademart_PageObject.Trademart_ManageBuyingRequirementSeller_POM;


public class Trademart_ManageBuyingRequirementSeller_TestClass extends Trademart_SellerBase
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
		
		Trademart_ManageBuyingRequirementSeller_POM tmp=new Trademart_ManageBuyingRequirementSeller_POM(driver);
		tmp.clickmanagebuyreqseller();
		log.info("Manage Buying Requirement Seller is clicked");
		Thread.sleep(2000);
		tmp.clickfilterby();
		log.info("Filter By is clicked");
		Thread.sleep(2000);
		tmp.clickdate();
		log.info("Date is clicked");
		Thread.sleep(2000);
		tmp.selectstatus();
		log.info("Status dropdown is clicked and open status is selected");
		Thread.sleep(2000);
		tmp.clicksendmessagetobuyer();
		log.info("Send Message to Buyer is clicked");
		Thread.sleep(2000);
		tmp.entermessagedesc();
		log.info("Description of Message is entered");
		Thread.sleep(2000);
		tmp.clicksendmessagebutton();
		log.info("Send Message button is clicked");
		Thread.sleep(2000);
		tmp.clickprofile();
		log.info("Profile is clicked");
		Thread.sleep(2000);
		tmp.clickmessages();
		log.info("Messages is clicked");
		Thread.sleep(2000);
		tmp.clicksentitems();
		log.info("Send Items is clicked");
		Thread.sleep(2000);
		tmp.clickmessagelink();
		log.info("Messagelink is clicked");
		Thread.sleep(2000);
		tmp.clickprofile();
		log.info("Profile is clicked");
		Thread.sleep(2000);
		tmp.clicklogout();
		log.info("Logout is clicked");
		Thread.sleep(2000);
		tmp.clicklogin();
		log.info("Login is clicked");
		Thread.sleep(2000);
		tmp.setemail();
		log.info("Buyer email is entered");
		Thread.sleep(2000);
		tmp.setpassword();
		log.info("Buyer Password is entered");
		Thread.sleep(2000);
		tmp.clickloginbutton();
		log.info("Login is clicked");
		Thread.sleep(2000);
		tmp.clickprofile();
		log.info("Profile of Buyer is clicked");
		Thread.sleep(2000);
		tmp.clickmessages();
		log.info("Messages is clicked");
		Thread.sleep(2000);
		tmp.clickinbox();
		log.info("Inbox is clicked");
		Thread.sleep(2000);
		tmp.clickmessagelink();
		log.info("Messagelink is clicked");
		Thread.sleep(3000);
		
		
				
   }
}
