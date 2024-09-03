package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class OrderSuccessPage {
	public OrderSuccessPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(linkText="Success")
	public static WebElement successBreadcrumb;

}
