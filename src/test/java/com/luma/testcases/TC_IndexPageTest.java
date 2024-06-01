package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.IndexPage;


public class TC_IndexPageTest extends BaseClass 
{

	@Test
	public void indexPageTest() throws IOException, InterruptedException
	{	
		driver.get(baseURL);
		logger.info("URL is opened");
		
		IndexPage indexpage=new IndexPage(driver);
		
			indexpage.validateLogo();
			logger.info("Logo is displayed");
			
			indexpage.validateSignInButton();
			logger.info("Sign In Button is displayed");
			
			indexpage.validateCreateAccountButton();
			logger.info("Create an Account Button is displayed");
			
			indexpage.validateSupportButton();
			logger.info("Support Button is displayed");
		
			if(driver.getTitle().equals("Home Page"))
			{
				Assert.assertTrue(true);
				logger.info("Index Page Test is passed");
			}
			else
			{
				captureScreen(driver,"indexPageTest");
				Assert.assertTrue(false);
				logger.info("Index Page test failed");
			}
	}
}
