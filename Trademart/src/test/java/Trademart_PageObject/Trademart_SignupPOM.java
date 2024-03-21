package Trademart_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Trademart_SignupPOM 
{
	public static WebDriver driver;
	public Trademart_SignupPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='login_signup']/a[2]")
	WebElement Signup;
	public void clicksignup()
	{
		Signup.click();
	}
	@FindBy(xpath="//input[@id='txt_email']")
	WebElement userinfo;
	public void enteruserinfo()
	{
	userinfo.sendKeys("bhavanareddy.manchala@gmail.com");
	}
	@FindBy(xpath="//input[@id='txt_password']")
	WebElement password;
	public void enterpassword()
	{
		password.sendKeys("1234567");
	}
	@FindBy(xpath="//input[@id='txt_cpassword']")
	WebElement cpassword;
	public void enterconfirmpassword()
	{
		cpassword.sendKeys("1234567");
	}
	@FindBy(xpath="//select[@id='country']")
	WebElement country;
	public void selectcountry()
	{
		country.click();
		Select sc=new Select(country);
		sc.selectByVisibleText("India");
	}
	@FindBy(xpath="//select[@id='state']")
	WebElement state;
	public void selectstate()
	{
		state.click();
		Select sc=new Select(state);
		sc.selectByVisibleText("Andhra Pradesh");
	}
	@FindBy(xpath="//select[@id='city']")
	WebElement city;
	public void selectcity()
	{
		city.click();
		Select sc=new Select(city);
		sc.selectByVisibleText("Hyderabad");
	}
	@FindBy(xpath="//input[@id='inlineCheckbox1']")
	WebElement radio;
	public void selectradiobutton()
	{
		radio.click();
	}
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstname;
	public void enterfirstname()
	{
		firstname.sendKeys("Bhavana");
	}
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastname;
	public void enterlastname()
	{
		lastname.sendKeys("Manchala");
	}
	@FindBy(xpath="//input[@id='companyName']")
	WebElement companyname;
	public void entercompanyname()
	{
		companyname.sendKeys("W3Softech");
	}
	@FindBy(xpath="//input[@id='countryCode']")
	WebElement countrycode;
	public void entercountrycode()
	{
		countrycode.sendKeys("91");
	}
	@FindBy(xpath="//input[@id='contactNo']")
	WebElement contactno;
	public void entercontactno()
	{
		contactno.sendKeys("9876543219");
	}
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	WebElement frame;
	public void entertoframe()
	{
		driver.switchTo().frame(frame);
	}
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement recaptcha;
	public void clickrecaptcha()
	{
		recaptcha.click();
		driver.switchTo().defaultContent();
	}
	@FindBy(xpath="//button[@id='submitAddForm']")
	WebElement signupform;
	public void clicksignupform()
	{
		signupform.click();
	}
}
