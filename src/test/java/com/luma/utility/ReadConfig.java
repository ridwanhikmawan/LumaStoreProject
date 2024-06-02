package com.luma.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("src/main/resources/Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getEmail()
	{
	String username=pro.getProperty("email");
	return username;
	}
	
	public String getPassword()
	{
	String password=pro.getProperty("password");
	return password;
	}
	
	public String getSearchProduct()
	{
	String product=pro.getProperty("product");
	return product;
	}
	
	public String getStreet()
	{
	String street=pro.getProperty("street");
	return street;
	}
	
	public String getCity()
	{
	String city=pro.getProperty("city");
	return city;
	}
	
	public String getPostCode()
	{
	String postcode=pro.getProperty("postcode");
	return postcode;
	}
	
	public String getPhoneNumber()
	{
	String phonenumber=pro.getProperty("phonenumber");
	return phonenumber;
	}
	
	public String getChromePath()
	{
	String chromepath=pro.getProperty("chromepath");
	return chromepath;
	}
	
	public String getIEPath()
	{
	String iepath=pro.getProperty("iepath");
	return iepath;
	}
	
	public String getFirefoxPath()
	{
	String firefoxpath=pro.getProperty("firefoxpath");
	return firefoxpath;
	}

	
}
