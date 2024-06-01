package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.HeaderMenu;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;
import com.luma.pageobjects.MyWishListPage;


public class TC_MyWishListPageTest extends BaseClass 
{

	@Test
	public void myWishListPageTest() throws IOException, InterruptedException
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
			
		HeaderMenu header=new HeaderMenu(driver);
		
			header.clickProfile();
			logger.info("Profile Menu is clicked");
			Thread.sleep(1000);
			
			header.clickMyWishList();
			logger.info("My Wishlist Page is opened");
			Thread.sleep(5000);
			
		MyWishListPage mywishlist=new MyWishListPage(driver);
			
			mywishlist.validateWishListProduct();
			logger.info("Wishlist Product is displayed");
			Thread.sleep(1000);
		
			mywishlist.clickRemoveWishListProduct();
			logger.info("Wishlist Product is removed");
			Thread.sleep(5000);
			
			if(driver.getTitle().equals("My Wish List"))
			{
				Assert.assertTrue(true);
				logger.info("My Wishlist Page Page Test is passed");
			}
			else
			{
				captureScreen(driver,"searchResultPageTest");
				Assert.assertTrue(false);
				logger.info("My Wishlist Page Test is failed");
			}				
	}
}
