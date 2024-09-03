package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class LoginAppPage {
	
	public LoginAppPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement email;
	
	@FindBy(id="input-password")
	public static WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public static WebElement btnLogin;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassword;

}
