package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class HeaderSection {

	public HeaderSection() {
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement MyAccountLink;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement RegisterLink;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement LoginLink;
	
	@FindBy(name="search")
	public static WebElement searchBoxField;
	
	@FindBy(css="button[class$='btn-lg']")
	public static WebElement searchButton;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	public static WebElement viewShoppingCartOption;
	
	public WebElement MyAccountLink() {
		return MyAccountLink;
	}
	
	public WebElement RegisterLink() {
		return RegisterLink;
	}
	
	public WebElement LoginLink() {
		return LoginLink;
	}
	
	

}
