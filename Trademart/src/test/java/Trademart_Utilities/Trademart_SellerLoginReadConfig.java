package Trademart_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Trademart_SellerLoginReadConfig 
{
	Properties pro;
	public Trademart_SellerLoginReadConfig()
	{
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\sellerlogin.properties");
		try
		{
		FileInputStream fis=new FileInputStream(f);
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
	    {
		 System.out.println(e.getMessage());
	    }
	}
	
	public String openapplication()
	{
		String url=pro.getProperty("URL");
		return url;
	}
	
	public String emailid()
	{
		String email=pro.getProperty("EmailAddress");
		return email;
	}
	
	public String password()
	{
		String password=pro.getProperty("Password");
		return password;
	}

}
