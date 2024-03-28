package Trademart_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Trademart_SearchPOM 
{
   public static WebDriver driver;
   public Trademart_SearchPOM (WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//select[@id='by']")
   WebElement searchdropdown;
   public void clicksearchdropdown()
   {
	   searchdropdown.click();
	   Select sc=new Select(searchdropdown);
	   sc.selectByVisibleText("Search Products");
   }
   @FindBy(xpath="//input[@id='q']")
   WebElement search;
   public void entersearchtext()
   {
	   search.sendKeys("Generator");
   }
   @FindBy(xpath="//i[@class='fa fa-search']")
   WebElement searchsymbol;
   public void clicksearchsymbol()
   {
	   searchsymbol.click();
   }
   @FindBy(xpath="//select[@id='psort']")
   WebElement sortby;
   public void clicksortby()
   {
	   sortby.click();
	   Select sc=new Select(sortby);
	   sc.selectByVisibleText("Price Low to high");
   }
//   @FindBy(xpath="//div[@id='headingOne']//a[1]")
//   WebElement pricerange;
//   public void clickpricerangefilter()
//   {
//	   pricerange.click();
//   }
   @FindBy(xpath="(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[1]")
   WebElement startslider;
   @FindBy(xpath="(//span[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]")
   WebElement endslider;
   public void setpriceslider()
   {
	   System.out.println(startslider.getLocation());
	   System.out.println(endslider.getLocation());
	   Actions ac=new Actions(driver);
	   ac.dragAndDropBy(startslider, 10,0).build().perform();
	   //ac.dragAndDropBy(endslider, -100,0).build().perform();
   }
   @FindBy(xpath="//select[@id='category']")
   WebElement selectcategory;
   public void clickselectcategory()
   {
	   selectcategory.click();
	   Select sc=new Select(selectcategory);
	   sc.selectByVisibleText("Electrical components");
   }
   @FindBy(xpath="//select[@id='subcategory']")
   WebElement selectsubcategory;
   public void clickselectsubcategory()
   {
	   selectsubcategory.click();
	   Select sc=new Select(selectsubcategory);
	   sc.selectByVisibleText("Generators");
   }
   @FindBy(xpath="//select[@id='countryid']")
   WebElement selectcountry;
   public void clickselectcountry()
   {
	   selectcountry.click();
	   Select sc=new Select(selectcountry);
	   sc.selectByVisibleText("India");
   }
   @FindBy(xpath="//select[@id='stateid']")
   WebElement selectstate;
   public void clickselectstate()
   {
	   selectstate.click();
	   Select sc=new Select(selectstate);
	   sc.selectByVisibleText("Andhra Pradesh");
   }
   @FindBy(xpath="//select[@id='cityid']")
   WebElement selectcity;
   public void clickselectcity()
   {
	   selectcity.click();
	   Select sc=new Select(selectcity);
	   sc.selectByVisibleText("Hyderabad");
   }
   @FindBy(xpath="//i[@class='fa fa-long-arrow-left']")
   WebElement resetfilter;
   public void clickresetfilter()
   {
	   resetfilter.click();
   }   
   @FindBy(xpath="(//div[@class='col-md-2 text-right col-lg-1 col-sm-4 col-xs-3']/a)[1]")
   WebElement favourites;
   public void clickfavourites()
   {
	   favourites.click();
   }
   @FindBy(xpath="//button[@id='dLabel']")
   WebElement profile;
   public void clickprofile()
   {
	   profile.click();
   }
   @FindBy(xpath="//ul[@class='dropdown-menu']/li[1]/a")
   WebElement myaccount;
   public void clickmyaccount()
   {
	   myaccount.click();
   }
   @FindBy(xpath="//ul[@class='dashboard-list']/li[5]/a")
   WebElement myfavouriteproducts;
   public void clickmyfavouriteproducts()
   {
	   myfavouriteproducts.click();
   }
   @FindBy(xpath="(//p[@class='margintop15']/a[1])[1]")
   WebElement sendmessage;
   public void clicksendmessage()
   {
	   sendmessage.click();
   }
   @FindBy(xpath="(//textarea[@id='description'])[2]")
   WebElement messagedescription;
   public void entermessagedescription()
   {
	   messagedescription.sendKeys("Product added to my favourites");
   }
   @FindBy(xpath="//button[@id='sendmessage']")
   WebElement send;
   public void clicksend()
   {
	   send.click();
   }
   @FindBy(xpath="//ul[@class='dropdown-menu']/li[4]/a")
   WebElement messages;
   public void clickmessages()
   {
	   messages.click();
   }
   @FindBy(xpath="//ul[@class='dashboard-list']/li[2]/a")
   WebElement sentitems;
   public void clicksentitems()
   {
	   sentitems.click();
   }
   @FindBy(xpath="(//a[@class='msg-linkgreen'])[1]")
   WebElement messagelink;
   public void clickmessagelink()
   {
	   messagelink.click();
   }	  
   @FindBy(xpath="//div[@class='site_logo']/a")
   WebElement logo;
   public void clicklogo()
   {
	   logo.click();
   }	
   @FindBy(xpath="//select[@id='by']")
   WebElement searchdropdown1;
   public void clicksearchdropdown1()
   {
	   searchdropdown1.click();
	   Select sc=new Select(searchdropdown1);
	   sc.selectByVisibleText("Search Sellers");
   }
   @FindBy(xpath="//input[@id='q']")
   WebElement search1;
   public void entersearchtext1()
   {
	   search.sendKeys("Seller Product");
   }
   @FindBy(xpath="//a[@id='cpt11']")
   WebElement contactsupplier;
   public void clickcontactsupplier()
   {
	   contactsupplier.click();
   }
   @FindBy(xpath="//select[@id='productId']")
   WebElement selectproductdropdown;
   public void clickselectproduct()
   {
	   selectproductdropdown.click();
	   Select sc=new Select(selectproductdropdown);
	   sc.selectByVisibleText("Macbook");
   }
   @FindBy(xpath="//input[@id='neededQty']")
   WebElement qtyneeded;
   public void enterqtyneeded()
   {
	   qtyneeded.sendKeys("2");
   }
   @FindBy(xpath="(//textarea[@id='description'])[1]")
   WebElement description;
   public void enterdescription()
   {
	   description.sendKeys("Hi, I added to favorite sellers");
   }
   @FindBy(xpath="//button[@id='sendEnquiry']	")
   WebElement sendseller;
   public void clicksendseller()
   {
	   sendseller.click();
   }
   @FindBy(xpath="//ul[@class='dashboard-list']/li[6]/a")
   WebElement myfavouritesellers;
   public void clickmyfavouritesellers()
   {
	   myfavouritesellers.click();
   }
   @FindBy(xpath="//select[@id='by']")
   WebElement searchdropdown2;
   public void clicksearchdropdown2()
   {
	   searchdropdown2.click();
	   Select sc=new Select(searchdropdown2);
	   sc.selectByVisibleText("Search Buying Requirements");
   }
}
