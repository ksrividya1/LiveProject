package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class AccountSuccessPage {
	
	public AccountSuccessPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Success')]")
	public static WebElement breadCrumbSuccess;

}
