package Trademart_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trademart_SellerLoginPOM 
{
	public static WebDriver driver;
	public Trademart_SellerLoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='login_signup']/a[1]")
	WebElement Login;
    @FindBy(xpath="(//input[@type='email'])[2]")
    WebElement email;
    @FindBy(xpath="(//input[@type='password'])[1]")
	WebElement password;
    @FindBy(id="submitLogin")
    WebElement loginbutton;
    
    public void clicklogin()
    {
    	Login.click();
    }
    public void setemail(String emailid)
    {
    	email.sendKeys(emailid);
    }
    public void setpassword(String Password)
    {
    	password.sendKeys(Password);
    }
    public void clickloginbutton()
    {
    	loginbutton.click();
    }
}
