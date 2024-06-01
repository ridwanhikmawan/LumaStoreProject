package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	public HomePage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, ridwan test!']")
	@CacheLookup
	WebElement welcomeText;
	
	@FindBy(xpath="//div[@class='header content']")
	@CacheLookup
	WebElement headerMenu;
	
	
	public void validateWelcomeText()
	{
		welcomeText.isDisplayed();
	}
	
	public void validateHeaderMenu()
	{
		headerMenu.isDisplayed();
	}
	
}
