package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class CheckOutPage {
	public CheckOutPage() {
		
		PageFactory.initElements(Base.driver,this);
		
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonOfBillingDetailsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonOFDeliveryDetailsSection;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtofOfDeliveryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement termsAndConditionsCheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonOfPaymentMethodSection;
	
	@FindBy(id="button-confirm")
	public static WebElement confirmOrderButton;

}
