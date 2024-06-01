package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;


public class TC_LoginPageTest extends BaseClass 
{

	@Test
	public void loginPageTest() throws IOException, InterruptedException
	{	
		driver.get(baseURL);
		logger.info("URL is opened");
		
		IndexPage indexpage=new IndexPage(driver);
			
			indexpage.clickSignIn();
			logger.info("Sign In Button is clicked");
			Thread.sleep(5000);
			
		LoginPage loginpage=new LoginPage(driver);
			
			loginpage.setEmail(email);
			logger.info("Email is entered");
			Thread.sleep(1000);
			
			loginpage.setPassword(password);
			logger.info("Password is entered");
			Thread.sleep(1000);
			
			loginpage.clickSignIn();
			logger.info("Sign In Button is clicked");
			Thread.sleep(5000);
		
			if(driver.getTitle().equals("Home Page"))
			{
			Assert.assertTrue(true);
			logger.info("User is loged In");
			logger.info("Login Page Test is passed");
			}
			else
			{
				captureScreen(driver,"loginPageTest");
				Assert.assertTrue(false);
				logger.info("Login Page test failed");
			}					
	}
}
