package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyWishListPage {
	
	public MyWishListPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//div[@class='column main']")
	@CacheLookup
	WebElement wishListProduct;
	
	@FindBy(xpath="//a[@title='Remove This Item']")
	@CacheLookup
	WebElement removeWishListProductbutton;
	
	@FindBy(xpath="//span[normalize-space()='Add All to Cart']")
	@CacheLookup
	WebElement addAllToCartButton;
	
	
	public void validateWishListProduct()
	{
		wishListProduct.isDisplayed();
	}
	
	public void clickRemoveWishListProduct()
	{
		removeWishListProductbutton.click();
	}
	
	public void clickAddAllToCart()
	{
		addAllToCartButton.click();
	}
	
}
