package Trademart_Testcases;

import org.testng.annotations.Test;

import Trademart_PageObject.Trademart_SignupPOM;

public class Trademart_Signup_TestClass extends Trademart_Login_Base
{

	@Test()
	public void Signup_TestClass() throws InterruptedException
	{
		Trademart_SignupPOM tsp=new Trademart_SignupPOM(driver);
		
		tsp.clicksignup();
		log.info("Signup is clicked");
		Thread.sleep(2000);
		tsp.enteruserinfo();
		log.info("user info is entered");
		Thread.sleep(2000);
		tsp.enterpassword();
		log.info("password is entered");
		Thread.sleep(2000);
		tsp.enterconfirmpassword();
		log.info("confirm password is entered");
		Thread.sleep(2000);
		tsp.selectcountry();
		log.info("country is selected");
		Thread.sleep(2000);
		tsp.selectstate();
		log.info("state is selected");
		Thread.sleep(2000);
		tsp.selectcity();
		log.info("city is selected");
		Thread.sleep(2000);
		tsp.selectradiobutton();
		log.info("Radio button is selected");
		Thread.sleep(2000);
		tsp.enterfirstname();
		log.info("Firstname is entered");
		Thread.sleep(2000);
		tsp.enterlastname();
		log.info("Lastname is entered");
		Thread.sleep(2000);
		tsp.entercompanyname();
		log.info("Company name is entered");
		Thread.sleep(2000);
		tsp.entercountrycode();
		log.info("Country code is entered");
		Thread.sleep(2000);
		tsp.entercontactno();
		log.info("Contact number is entered");
		Thread.sleep(2000);
		tsp.entertoframe();
		log.info("Entered into frame");
		Thread.sleep(2000);
		tsp.clickrecaptcha();
		log.info("Recaptcha is clicked");
		Thread.sleep(50000);
		tsp.clicksignupform();
		log.info("SignUp is clicked");
		Thread.sleep(2000);
	}
}
