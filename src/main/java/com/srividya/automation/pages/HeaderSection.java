package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class HeaderSection {

	public HeaderSection() {
		PageFactory.initElements(Base.driver, HeaderSection.class);
	}
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement MyAccountLink;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterLink;
	
	public WebElement MyAccountLink() {
		return MyAccountLink;
	}
	
	public WebElement RegisterLink() {
		return RegisterLink;
	}
	
	

}
