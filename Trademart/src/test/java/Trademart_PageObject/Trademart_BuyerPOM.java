package Trademart_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trademart_BuyerPOM 
{
	public static WebDriver driver;
	public Trademart_BuyerPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@id='dLabel']")
	WebElement profile;
	public void clickprofile()
	{
		profile.click();
	}
	@FindBy(xpath="//ul[@class='dropdown-menu']/li[4]/a")
	WebElement messages;
	public void clickmessages()
    {
		messages.click();
	}
	@FindBy(xpath="//ul[@class='dashboard-list']/li[1]/a")
    WebElement inbox;
	public void clickinbox()
	{
		inbox.click();
	}
	@FindBy(xpath="(//a[@class='msg-linkgreen'])[1]")
	WebElement messagelink;
	public void clickmessagelink()
	{
		messagelink.click();
	}	
}
