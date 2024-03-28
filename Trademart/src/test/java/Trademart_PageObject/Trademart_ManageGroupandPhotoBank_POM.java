package Trademart_PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trademart_ManageGroupandPhotoBank_POM 
{
	public static WebDriver driver;
	public Trademart_ManageGroupandPhotoBank_POM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//ul[@class='dashboard-list']/li[8]/a")
    WebElement managegroup;
	public void clickmanagegroup()
    {
		managegroup.click();
	}
	@FindBy(xpath="//div[@class='col-md-12 col-sm-12 col-xs-12 text-center']/a")
    WebElement creategroup;
	public void clickcreategroup()
    {
		creategroup.click();
	}
	@FindBy(xpath="//input[@id='txtGroup']")
    WebElement groupname;
	public void setgroupname()
    {
		groupname.sendKeys("Automation");
	}
	@FindBy(xpath="//div[@class='col-sm-10']/span[1]")
    WebElement uploadimage;
	public void clickuploadimage()
    {
		uploadimage.click();
	}
	@FindBy(xpath="//input[@id='avatarInput']")
    WebElement choosefile;
	public void clickchoosefile() throws InterruptedException
    {
		//choosefile.click();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();", choosefile);
	    Thread.sleep(2000);
		choosefile.sendKeys("C:\\Users\\Hp\\Downloads\\Automation.png");
	}
	@FindBy(xpath="(//button[@type='button'])[11]")
    WebElement done;
	public void clickdone()
    {
		done.click();
	}
	@FindBy(xpath="//button[@id='sbtGroup']")
    WebElement create;
	public void clickcreate()
    {
		create.click();
	}
	public void scrollwindow()
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		System.out.println("Scroll Bar Moved Successfully");
		System.out.println(jse.executeScript("return window.pageYOffset;"));
	}
	@FindBy(xpath="(//div[@class='col-md-2 text-right col-sm-2 col-xs-3']/a[1])[12]")
    WebElement editgroup;
	public void clickeditgroup()
    {
		editgroup.click();
	}
	@FindBy(xpath="//div[@class='col-md-9 pull-right col-sm-12 text-right top-links-hd']//a[2]")
    WebElement rename;
	public void clickrename()
    {
		rename.click();
	}
	@FindBy(xpath="//input[@id='txtGname']")
    WebElement setrename;
	public void enterrename()
    {
		rename.sendKeys("Automation Testing");
	}
	@FindBy(xpath="//button[@id='sbtRename']")
    WebElement renamenow;
	public void clickrenamenow()
    {
		renamenow.click();
	}
	@FindBy(xpath="//div[@class='col-md-9 pull-right col-sm-12 text-right top-links-hd']//a[5]")
    WebElement uploadnew;
	public void clickuploadnew()
    {
		uploadnew.click();
	}
	@FindBy(xpath="//input[@id='avatarInput']")
    WebElement choosefile1;
	public void clickchoosefile1() throws InterruptedException
    {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click();", choosefile1);
	    Thread.sleep(2000);
		choosefile1.sendKeys("C:\\Users\\Hp\\Downloads\\Automation1.png");
	}
	@FindBy(xpath="//button[@id='sbtNew']")
    WebElement uploadnow;
	public void clickuploadnow()
    {
		uploadnow.click();
	}
	@FindBy(xpath="//input[@id='checkAll']")
    WebElement selectall;
	public void clickselectallcheckbox()
    {
		selectall.click();
	}
	@FindBy(xpath="//div[@class='col-md-9 pull-right col-sm-12 text-right top-links-hd']//a[4]")
    WebElement delete;
	public void clickdelete()
    {
		delete.click();
	}	
	public void clickalert()
	{
		Alert a=driver.switchTo().alert();
		a.accept();
	}
	@FindBy(xpath="//div[@class='col-md-9 pull-right col-sm-12 text-right top-links-hd']//a[1]")
    WebElement back;
	public void clickback()
    {
		back.click();
	}	
}
