package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	public CheckoutPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='New Address']")
	@CacheLookup
	WebElement newAddressButton;
	
	@FindBy(name="street[0]")
	@CacheLookup
	WebElement inputStreet;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement inputCity;
	
	@FindBy(name="region_id")
	@CacheLookup
	WebElement selectProvince;
	
	@FindBy(name="postcode")
	@CacheLookup
	WebElement inputPostCode;
	
	@FindBy(name="telephone")
	@CacheLookup
	WebElement inputPhoneNumber;
	
	@FindBy(xpath="//span[normalize-space()='Ship here']")
	@CacheLookup
	WebElement shipHereButton;
	
	@FindBy(xpath="//input[@name='ko_unique_2']")
	@CacheLookup
	WebElement shippingMethod;
	
	@FindBy(xpath="//button[@class='button action continue primary']")
	@CacheLookup
	WebElement nextButton;
	
	@FindBy(xpath="//div[@class='opc-block-summary']")
	@CacheLookup
	WebElement orderSummary;
	
	@FindBy(xpath="//span[normalize-space()='Place Order']")
	@CacheLookup
	WebElement placeOrderButton;
	
	
	public void validateOrderSummary()
	{
		orderSummary.isDisplayed();
	}
	
	public void clickNewAddress()
	{
		newAddressButton.click();
	}
	
	public void setStreet(String street)
	{
		inputStreet.sendKeys(street);
	}
	
	public void setCity(String city)
	{
		inputCity.sendKeys(city);
	}
	
	public void selectProvince()
	{
		Select selectprovince=new Select(selectProvince);
		selectprovince.selectByVisibleText("Arizona");
	}
	
	public void setPostCode(String postcode)
	{
		inputPostCode.sendKeys(postcode);
	}
	
	public void setPhoneNumber(String phonenumber)
	{
		inputPhoneNumber.sendKeys(phonenumber);
	}
	
	public void clickShipHere()
	{
		shipHereButton.click();
	}
	
	public void selectShippingMethod()
	{
		shippingMethod.click();
	}
	
	public void clickNext()
	{
		nextButton.click();
	}
	
	public void clickPlaceOrder()
	{
		placeOrderButton.click();
	}
}
