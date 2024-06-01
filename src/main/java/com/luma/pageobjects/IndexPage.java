package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IndexPage {
	
	public IndexPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement signInButton;
	
	@FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
	@CacheLookup
	WebElement createAccountButton;
	
	@FindBy(xpath="//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]/span[1]/a[1]")
	@CacheLookup
	WebElement supportButton;
	
	@FindBy(xpath="//a[@aria-label='store logo']//img")
	@CacheLookup
	WebElement lumaStoreLogo;
	
	
	public void validateLogo()
	{
		lumaStoreLogo.isDisplayed();
	}
	
	public void clickLogo()
	{
		lumaStoreLogo.click();
	}
	
	public void validateSignInButton()
	{
		signInButton.isDisplayed();
	}
	
	public void clickSignIn()
	{
		signInButton.click();
	}
	
	public void validateCreateAccountButton()
	{
		createAccountButton.isDisplayed();
	}
	
	public void clickCreateAccount()
	{
		createAccountButton.click();
	}
	
	public void validateSupportButton()
	{
		supportButton.isDisplayed();
	}
	
	public void clickSupport()
	{
		supportButton.click();
	}
	
}
