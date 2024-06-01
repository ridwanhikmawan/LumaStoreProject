package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HeaderMenu {
	
	public HeaderMenu(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//div[@class='panel header']//button[@type='button']")
	@CacheLookup
	WebElement profileMenu;
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='My Account']")
	@CacheLookup
	WebElement myAccountMenu;
	
	@FindBy(xpath="(//a[@href='https://magento.softwaretestingboard.com/wishlist/'])[1]")
	@CacheLookup
	WebElement myWishListMenu;
	
	@FindBy(xpath="//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
	@CacheLookup
	WebElement signOutButton;
	
	@FindBy(xpath="//input[@id='search']")
	@CacheLookup
	WebElement inputSearch;
	
	@FindBy(xpath="//button[@title='Search']")
	@CacheLookup
	WebElement searchButton;
	
	@FindBy(xpath="//a[@class='action showcart']")
	@CacheLookup
	WebElement showCartButton;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	@CacheLookup
	WebElement proceedToCheckoutButton;
	
	@FindBy(xpath="//a[@class='action delete']")
	@CacheLookup
	WebElement deleteProductButton;
	
	@FindBy(xpath="//span[normalize-space()='View and Edit Cart']")
	@CacheLookup
	WebElement editCartButton;
	
	
	public void clickProfile()
	{
		profileMenu.click();
	}
	
	public void clickMyAccount()
	{
		myAccountMenu.click();
	}
	
	public void clickMyWishList()
	{
		myWishListMenu.click();
	}
	
	public void clickSignOut()
	{
		signOutButton.click();
	}
	
	public void setSearch(String search)
	{
		inputSearch.sendKeys(search);
	}
	
	public void clickSearch()
	{
		searchButton.click();
	}
	
	public void clickShowCart()
	{
		showCartButton.click();
	}
	
	public void clickProceedToCheckout()
	{
		proceedToCheckoutButton.click();
	}
	
	public void clickDeleteProduct()
	{
		deleteProductButton.click();
	}
	
	public void clickEditCart()
	{
		editCartButton.click();
	}
	
}
