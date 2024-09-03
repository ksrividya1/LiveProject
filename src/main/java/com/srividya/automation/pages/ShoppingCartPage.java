package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;
import com.srividya.automation.pages.ShoppingCartPage;

public class ShoppingCartPage {
public ShoppingCartPage() {
		
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(linkText="Checkout")
	public static WebElement checkoutButton;
	
	

}
