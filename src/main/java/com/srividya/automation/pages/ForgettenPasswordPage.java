package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;


public class ForgettenPasswordPage {
	
public ForgettenPasswordPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(css="input[type='submit'][value='Continue']")
	public static WebElement continueButton;

}
