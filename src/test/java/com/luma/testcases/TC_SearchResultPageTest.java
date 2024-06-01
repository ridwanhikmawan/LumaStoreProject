package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.HeaderMenu;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;
import com.luma.pageobjects.SearchResultPage;


public class TC_SearchResultPageTest extends BaseClass 
{

	@Test
	public void searchResultPageTest() throws IOException, InterruptedException
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
		
			header.setSearch(product);
			logger.info("Product name is entered");
			Thread.sleep(1000);
			
			header.clickSearch();
			logger.info("Search Result Page is opened");
			Thread.sleep(5000);
		
		SearchResultPage searchresultpage=new SearchResultPage(driver);
		
			searchresultpage.validateListOfProduct();
			logger.info("List of Product is displayed");
			
			searchresultpage.validateProductImage();
			logger.info("Product Image is displayed");
			
			searchresultpage.validateProductName();
			logger.info("Product Name is displayed");
			
			searchresultpage.validateProductPrice();
			logger.info("Product Price is displayed");
			
			searchresultpage.clickProductSize1();
			logger.info("First Product Size is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickProductColor1();
			logger.info("First Product Color is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickAddToCart1();
			logger.info("First Add to Cart Button is clicked");
			Thread.sleep(1000);
			
			searchresultpage.clickProductSize2();
			logger.info("Second Product Size is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickProductColor2();
			logger.info("Second Product Color is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickAddToCart2();
			logger.info("Second Add to Cart Button is clicked");
			Thread.sleep(1000);
			
			searchresultpage.clickProductSize3();
			logger.info("Third Product Size is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickProductColor3();
			logger.info("Third Product Color is choosed");
			Thread.sleep(1000);
			
			searchresultpage.clickAddToCart3();
			logger.info("Third Add to Cart Button is clicked");
			Thread.sleep(1000);
			
		
			if(driver.getTitle().equals("Search results for: 'hero hoodie'"))
			{
				Assert.assertTrue(true);
				logger.info("Search Result Page Test is passed");
			}
			else
			{
				captureScreen(driver,"searchResultPageTest");
				Assert.assertTrue(false);
				logger.info("Search Result Page Test is failed");
			}				
	}
}
