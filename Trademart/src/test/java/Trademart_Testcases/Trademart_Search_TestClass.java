package Trademart_Testcases;

import org.testng.annotations.Test;

import Trademart_PageObject.Trademart_SellerLoginPOM;
import Trademart_PageObject.Trademart_SearchPOM;

public class Trademart_Search_TestClass extends Trademart_SellerBase
{
	@Test()
	public void Trademart_Search() throws InterruptedException
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
		
		Trademart_SearchPOM tsp=new Trademart_SearchPOM(driver);
		tsp.clicksearchdropdown();
		log.info("Search dropdown is clicked");
		Thread.sleep(2000);
		tsp.clicksearchsymbol();
		log.info("Search symbol is clicked");
		Thread.sleep(2000);
		tsp.entersearchtext();
		log.info("Text is entered in search");
		Thread.sleep(2000);
		tsp.clicksearchsymbol();
		log.info("Search symbol is clicked");
		Thread.sleep(2000);
		tsp.clicksortby();
		log.info("Sortby dropdown is clicked and price low to high is selected");
		Thread.sleep(4000);
//		tsp.clickpricerangefilter();
//		log.info("Price range filter is clicked");
//		Thread.sleep(2000);
	    tsp.setpriceslider();
        log.info("Price slider is set");
        Thread.sleep(4000);
        tsp.clickselectcategory();
        log.info("select category dropdown is clicked and Electrical components is selected");
		Thread.sleep(2000);
        tsp.clickselectsubcategory();
        log.info("select subcategory dropdown is clicked and Generators is selected");
		Thread.sleep(2000);
		tsp.clickselectcountry();
		log.info("select country dropdown is clicked and India is selected");
		Thread.sleep(2000);
		tsp.clickselectstate();
		log.info("select state dropdown is clicked and AndhraPradesh is selected");
		Thread.sleep(2000);
		tsp.clickselectcity();
		log.info("select city dropdown is clicked and Hyderabad is selected");
		Thread.sleep(2000);
		tsp.clickresetfilter();
		log.info("Reset filter is clicked");
		Thread.sleep(4000);
		tsp.clickfavourites();
		log.info("Product added to favourite");
		Thread.sleep(4000);
		tsp.clickprofile();
		log.info("Profile is clicked");
		Thread.sleep(2000);
		tsp.clickmyaccount();
		log.info("My Account is clicked");
		Thread.sleep(2000);
		tsp.clickmyfavouriteproducts();
		log.info("My Favourite Products is clicked");
		Thread.sleep(2000);
		tsp.clicksearchsymbol();
		log.info("Search symbol is clicked");
		Thread.sleep(2000);
		tsp.clicksendmessage();
		log.info("Send Message is clicked");
		Thread.sleep(2000);
		tsp.entermessagedescription();
		log.info("Message description is entered");
		Thread.sleep(2000);
		tsp.clicksend();
		log.info("Send is clicked");
		Thread.sleep(2000);
		tsp.clickprofile();
		log.info("Profile is clicked");
		Thread.sleep(2000);
		tsp.clickmessages();
		log.info("Messages is clicked");
		Thread.sleep(2000);
		tsp.clicksentitems();
		log.info("Sent items is clicked");
		Thread.sleep(2000);
		tsp.clickmessagelink();
		log.info("Message link is clicked");
		Thread.sleep(2000);
		tsp.clicklogo();
		log.info("Logo is clicked");
		Thread.sleep(2000);
		tsp.clicksearchdropdown1();
		log.info("Search dropdown is clicked and Search sellers is selected");
		Thread.sleep(2000);
		tsp.clicksearchsymbol();
		log.info("Search Symbol is clicked");
		Thread.sleep(2000);
		tsp.entersearchtext1();
		log.info("Text is entered in search");
		Thread.sleep(2000);
		tsp.clickselectcategory();
		log.info("select category dropdown is clicked");
		Thread.sleep(2000);
//        tsp.clickselectsubcategory();
//        log.info("select subcategory dropdown is clicked");
//		Thread.sleep(2000);
		tsp.clickselectcountry();
		log.info("select country dropdown is clicked and India is selected");
		Thread.sleep(2000);
		tsp.clickselectstate();
		log.info("select state dropdown is clicked and AndhraPradesh is selected");
		Thread.sleep(2000);
		tsp.clickselectcity();
		log.info("select city dropdown is clicked and Hyderabad is selected");
		Thread.sleep(2000);
		tsp.clickresetfilter();
		log.info("Reset filter is clicked");
		Thread.sleep(4000);
		tsp.clickfavourites();
		log.info("Seller added to favourite");
		Thread.sleep(4000);
		tsp.clickcontactsupplier();
		log.info("contact suplier is clicked");
		Thread.sleep(2000);
		tsp.clickselectproduct();
		log.info("contact supplier is clicked");
		Thread.sleep(2000);
		tsp.enterqtyneeded();
		log.info("Quantity needed is entered");
		Thread.sleep(2000);
		tsp.enterdescription();
		log.info("Description is entered");
		Thread.sleep(2000);
		tsp.clicksendseller();
		log.info("Send is clicked");
		Thread.sleep(2000);
		tsp.clickprofile();
		log.info("Profile is clicked");
		Thread.sleep(2000);
		tsp.clickmyaccount();
		log.info("My Account is clicked");
		Thread.sleep(2000);
		tsp.clickmyfavouritesellers();
		log.info("My Favourite Sellers is clicked");
		Thread.sleep(2000);
		tsp.clicklogo();
		log.info("Logo is clicked");
		Thread.sleep(2000);
		tsp.clicksearchdropdown2();
		log.info("Search drop down is clicked and Search Buying Requirements is selected");
		Thread.sleep(2000);
		tsp.clicksearchsymbol();
		log.info("Search Symbol is clicked");
		Thread.sleep(2000);
	}
	
	

}
