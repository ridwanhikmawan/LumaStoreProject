package com.luma.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.base.BaseClass;
import com.luma.pageobjects.HeaderMenu;
import com.luma.pageobjects.IndexPage;
import com.luma.pageobjects.LoginPage;
import com.luma.pageobjects.ShoppingCartPage;


public class TC_ShoppingCartPageTest extends BaseClass 
{

	@Test
	public void shoppingCartPageTest() throws IOException, InterruptedException
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
			
			header.clickShowCart();
			logger.info("Cart is opened");
			Thread.sleep(1000);
		
			header.clickEditCart();
			logger.info("Shopping Cart Page is opened");
			Thread.sleep(5000);
			
		ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
			
			shoppingcartpage.validateCounterNumber();
			logger.info("Counter Number is displayed");
			
			shoppingcartpage.validateProductImage();
			logger.info("Product Image is displayed");
			
			shoppingcartpage.validateProductDetail();
			logger.info("Product Detail is displayed");
			
			shoppingcartpage.validateProductQuantity();
			logger.info("Product Quantity is displayed");
			
			shoppingcartpage.validateSubtotalPrice();
			logger.info("Subtotal Price is displayed");
			
			shoppingcartpage.clickMoveToWishList();
			logger.info("Second Product is moved to wishlist");
			Thread.sleep(5000);
			
			shoppingcartpage.clickRemoveItem();
			logger.info("Third Product is removed");
			Thread.sleep(5000);
			
			shoppingcartpage.validateOrderSummary();
			logger.info("Order Summary is displayed");
			
			shoppingcartpage.validateTotalPrice();
			logger.info("Total Price is displayed");
			
		
			if(driver.getTitle().equals("Shopping Cart"))
			{
				Assert.assertTrue(true);
				logger.info("Shopping Cart Page Test is passed");
			}
			else
			{
				captureScreen(driver,"shoppingCartPageTest");
				Assert.assertTrue(false);
				logger.info("Shopping Cart Page Test is failed");
			}				
	}
}
