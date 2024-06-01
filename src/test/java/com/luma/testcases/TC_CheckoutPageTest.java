package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.CheckoutPage;
import com.luma.pageobjects.HeaderMenu;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;


public class TC_CheckoutPageTest extends BaseClass 
{

	@Test
	public void checkoutPageTest() throws IOException, InterruptedException
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
			Thread.sleep(10000);
			
		HeaderMenu header=new HeaderMenu(driver);
		
			header.clickShowCart();
			logger.info("Cart is opened");
			Thread.sleep(5000);
		
			header.clickProceedToCheckout();
			logger.info("Checkout Page is opened");
			Thread.sleep(5000);
		
		CheckoutPage checkoutpage=new CheckoutPage(driver);
			
			checkoutpage.validateOrderSummary();
			logger.info("Order Summary is displayed");
		
			//checkoutpage.setStreet(street);
			logger.info("Street is entered");
			Thread.sleep(1000);
			
			//checkoutpage.setCity(city);
			logger.info("City is entered");
			Thread.sleep(1000);
			
			//checkoutpage.selectProvince();
			logger.info("Province is selected");
			Thread.sleep(1000);
			
			//checkoutpage.setPostCode(postcode);
			logger.info("Postcode is entered");
			Thread.sleep(1000);
			
			//checkoutpage.setPhoneNumber(phonenumber);
			logger.info("Phone Number is entered");
			Thread.sleep(1000);
			
			checkoutpage.selectShippingMethod();
			logger.info("Shipping Method is selected");
			Thread.sleep(5000);
			
			checkoutpage.clickNext();
			logger.info("Next button is clicked");
			Thread.sleep(5000);
			
			checkoutpage.clickPlaceOrder();
			logger.info("Place Order button is clicked");
			Thread.sleep(5000);
			
		
			if(driver.getTitle().equals("Success Page"))
			{
				Assert.assertTrue(true);
				logger.info("Checkout Page Test is passed");
			}
			else
			{
				captureScreen(driver,"checkouttPageTest");
				Assert.assertTrue(false);
				logger.info("Checkout Page Test is failed");
			}				
	}
}
