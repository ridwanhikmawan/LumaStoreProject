package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage {
	
	public ShoppingCartPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//span[@class='counter-number']")
	@CacheLookup
	WebElement counterNumber;
	
	@FindBy(xpath="//td[@class='col item']//img[@alt='Hero Hoodie']")
	@CacheLookup
	WebElement productImage;
	
	@FindBy(xpath="//tbody[1]/tr[1]/td[1]/div[1]")
	@CacheLookup
	WebElement productDetail;
	
	@FindBy(xpath="//th[@class='col qty']//span[contains(text(),'Qty')]")
	@CacheLookup
	WebElement productQuantity;
	
	@FindBy(xpath="//span[normalize-space()='Subtotal']")
	@CacheLookup
	WebElement subtotalPrice;
	
	@FindBy(xpath="//tbody[1]/tr[2]/td[1]/div[1]/a[1]/span[1]")
	@CacheLookup
	WebElement moveToWishListButton;
	
	@FindBy(xpath="//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/a[3]")
	@CacheLookup
	WebElement removeItemButton;
	
	@FindBy(xpath="//div[@class='cart-summary']")
	@CacheLookup
	WebElement orderSummary;
	
	@FindBy(xpath="//strong[normalize-space()='Order Total']")
	@CacheLookup
	WebElement totalPrice;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to Checkout']")
	@CacheLookup
	WebElement proceedToCheckoutButton;
	
	
	public void validateCounterNumber()
	{
		counterNumber.isDisplayed();
	}
	
	public void validateProductImage()
	{
		productImage.isDisplayed();
	}
	
	public void validateProductDetail()
	{
		productDetail.isDisplayed();
	}
	
	public void validateProductQuantity()
	{
		productQuantity.isDisplayed();
	}
	
	public void validateSubtotalPrice()
	{
		subtotalPrice.isDisplayed();
	}
	
	public void clickMoveToWishList()
	{
		moveToWishListButton.click();
	}
	
	public void clickRemoveItem()
	{
		removeItemButton.click();
	}
	
	public void validateOrderSummary()
	{
		orderSummary.isDisplayed();
	}
	
	public void validateTotalPrice()
	{
		totalPrice.isDisplayed();
	}
	
	public void clickProceedToCheckout()
	{
		proceedToCheckoutButton.click();
	}
	
}
