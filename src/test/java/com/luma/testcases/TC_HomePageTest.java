package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.HomePage;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;


public class TC_HomePageTest extends BaseClass 
{

	@Test
	public void homePageTest() throws IOException, InterruptedException
	{	
		driver.get(baseURL);
		logger.info("URL is opened");
		
		IndexPage indexpage=new IndexPage(driver);
		
			indexpage.clickSignIn();
			logger.info("Sign In Button is clicked");
			logger.info("User is on Login Page");
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
			logger.info("User is loged In");
			Thread.sleep(5000);
		
		HomePage homepage=new HomePage(driver);
		
			homepage.validateWelcomeText();
			logger.info("Welcome Text is displayed");
			
			homepage.validateHeaderMenu();
			logger.info("Header Menu is displayed");
		
			if(driver.getTitle().equals("Home Page"))
			{
				Assert.assertTrue(true);
				logger.info("Home Page Test is passed");
			}
			else
			{
				captureScreen(driver,"indexPageTest");
				Assert.assertTrue(false);
				logger.info("Home Page test failed");
			}
	}
}
