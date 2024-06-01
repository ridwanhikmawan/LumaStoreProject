package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchResultPage {
	
	public SearchResultPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//body/div[@class='page-wrapper']/main[@id='maincontent']/div[@class='columns']/div[@class='column main']/div[@class='search results']/div[@class='products wrapper grid products-grid']/ol[@class='products list items product-items']/li[1]/div[1]")
	@CacheLookup
	WebElement listOfProduct;
	
	@FindBy(xpath="//img[@alt='Hero Hoodie']")
	@CacheLookup
	WebElement productImage;
	
	@FindBy(xpath="//img[@alt='Hero Hoodie']")
	@CacheLookup
	WebElement productName;
	
	@FindBy(xpath="//span[@id='product-price-158']//span[@class='price'][normalize-space()='$54.00']")
	@CacheLookup
	WebElement productPrice;
	
	@FindBy(xpath="//div[@class='swatch-opt-158']//div[@id='option-label-size-143-item-169']")
	@CacheLookup
	WebElement productSize1;
	
	@FindBy(xpath="//div[@class='swatch-opt-158']//div[@id='option-label-color-93-item-52']")
	@CacheLookup
	WebElement productColor1;
	
	@FindBy(xpath="//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
	@CacheLookup
	WebElement addToCartButton1;
	
	@FindBy(xpath="//div[@class='swatch-opt-254']//div[@id='option-label-size-143-item-169']")
	@CacheLookup
	WebElement productSize2;
	
	@FindBy(xpath="//div[@id='option-label-color-93-item-54']")
	@CacheLookup
	WebElement productColor2;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
	@CacheLookup
	WebElement addToCartButton2;
	
	@FindBy(xpath="//div[@class='swatch-opt-1108']//div[@id='option-label-size-143-item-169']")
	@CacheLookup
	WebElement productSize3;
	
	@FindBy(xpath="//div[@class='swatch-opt-1108']//div[@id='option-label-color-93-item-56']")
	@CacheLookup
	WebElement productColor3;
	
	@FindBy(xpath="//li[2]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]")
	@CacheLookup
	WebElement addToCartButton3;
	
	@FindBy(xpath="//li[4]//div[1]//div[1]//div[3]//div[1]//div[2]//a[1]")
	@CacheLookup
	WebElement addToWishListButton2;
	
	
	public void validateListOfProduct()
	{
		listOfProduct.isDisplayed();
	}
	
	public void validateProductImage()
	{
		productImage.isDisplayed();
	}
	
	public void validateProductName()
	{
		productName.isDisplayed();
	}
	
	public void validateProductPrice()
	{
		productPrice.isDisplayed();
	}
	
	public void clickProductSize1()
	{
		productSize1.click();
	}
	
	public void clickProductColor1()
	{
		productColor1.click();
	}
	
	public void clickAddToCart1()
	{
		addToCartButton1.click();
	}
	
	public void clickProductSize2()
	{
		productSize2.click();
	}
	
	public void clickProductColor2()
	{
		productColor2.click();
	}
	
	public void clickAddToCart2()
	{
		addToCartButton2.click();
	}
	
	public void clickProductSize3()
	{
		productSize3.click();
	}
	
	public void clickProductColor3()
	{
		productColor3.click();
	}
	
	public void clickAddToCart3()
	{
		addToCartButton3.click();
	}
	
	public void clickAddToWishList2()
	{
		addToWishListButton2.click();
	}
	
}
