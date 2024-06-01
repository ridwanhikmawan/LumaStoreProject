package com.luma.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver getDriver)
	{
		PageFactory.initElements(getDriver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement inputEmail;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//input[@id='pass']")
	@CacheLookup
	WebElement inputPassword;
	
	@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement signInButton;
	
	@FindBy(xpath="//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]")
	@CacheLookup
	WebElement forgotPasswordButton;
	
	@FindBy(xpath="//a[@class='action create primary']//span[contains(text(),'Create an Account')]")
	@CacheLookup
	WebElement createAccountButton;
	
	
	public void setEmail(String email)
	{
		inputEmail.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		inputPassword.sendKeys(password);
	}
	
	public void clickSignIn()
	{
		signInButton.click();
	}
	
	public void clickForgotPassword()
	{
		forgotPasswordButton.click();
	}
	
	public void clickCreateAccount()
	{
		createAccountButton.click();
	}
}
