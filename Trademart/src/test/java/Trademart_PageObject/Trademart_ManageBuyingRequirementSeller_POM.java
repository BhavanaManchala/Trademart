package Trademart_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Trademart_ManageBuyingRequirementSeller_POM 
{
	public static WebDriver driver;
	public Trademart_ManageBuyingRequirementSeller_POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ul[@class='dashboard-list']/li[3]/a")
    WebElement managebuyreqseller;
	public void clickmanagebuyreqseller()
    {
		managebuyreqseller.click();
	}
	@FindBy(xpath="//input[@id='lastDate']")
    WebElement filterby;
	public void clickfilterby()
    {
		filterby.click();
	}
	@FindBy(xpath="//table[@class=' table-condensed']/tbody/tr[6]/td[1]")
    WebElement selectdate;
	public void clickdate()
    {
		selectdate.click();
	}
	@FindBy(xpath="//select[@id='statusFilter']")
    WebElement status;
	public void selectstatus()
    {
		status.click();
		Select sc=new Select(status);
		sc.selectByVisibleText("Open");
	}
	@FindBy(xpath="(//a[@role='button'])[3]")
    WebElement sendmessagetobuyer;
	public void clicksendmessagetobuyer()
    {
		sendmessagetobuyer.click();
	}
	@FindBy(xpath="(//textarea[@data-id='23'])[1]")
    WebElement messagedesc;
	public void entermessagedesc()
    {
		messagedesc.sendKeys("Hi,I'm interested in buying this product");
	}
	@FindBy(xpath="(//button[@data-id='23'])[1]")
    WebElement sendmessage;
	public void clicksendmessagebutton()
    {
		sendmessage.click();
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
	@FindBy(xpath="//ul[@class='dropdown-menu']/li[5]/a")
	WebElement logout;
	public void clicklogout()
    {
		logout.click();
	}
	@FindBy(xpath="//div[@class='login_signup']/a[1]")
	WebElement Login;
	public void clicklogin()
    {
    	Login.click();
    }
    @FindBy(xpath="(//input[@type='email'])[2]")
    WebElement email;
    public void setemail()
    {
    	email.sendKeys("buyer.ncrypted@gmail.com");
    }
    @FindBy(xpath="(//input[@type='password'])[1]")
	WebElement password;
    public void setpassword()
    {
    	password.sendKeys("123456");
    }
    @FindBy(id="submitLogin")
    WebElement loginbutton;
    public void clickloginbutton()
    {
    	loginbutton.click();
    }
	@FindBy(xpath="//ul[@class='dashboard-list']/li[1]/a")
    WebElement inbox;
	public void clickinbox()
	{
		inbox.click();
	}
}
