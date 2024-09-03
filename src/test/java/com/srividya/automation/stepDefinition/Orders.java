package com.srividya.automation.stepDefinition;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.srividya.automation.base.Base;
import com.srividya.automation.pages.HeaderSection;
import com.srividya.automation.pages.OrderSuccessPage;
import com.srividya.automation.pages.ShoppingCartPage;
import com.srividya.automation.pages.CheckOutPage;


import io.cucumber.java.en.*;

public class Orders {
	
	LoginApp login= new LoginApp();
	Search search=new Search();
	HeaderSection headerSection = new HeaderSection();
	ShoppingCartPage shoppingcart=new ShoppingCartPage();
	CheckOutPage checkoutPage=new CheckOutPage();
	OrderSuccessPage orderSuccessPage=new OrderSuccessPage();

	
	@Given("I login to the application")
	public void i_login_to_the_application() throws Throwable {
	    login.i_laugh_the_application();
	    headerSection.MyAccountLink().click();
	    headerSection.LoginLink().click();
	    login.i_login_to_the_Application_using_Username_and_Password(Base.reader.getUsername(), Base.reader.getPassword());
	}

	@When("I add a product to bag and checkout")
	public void i_add_a_product_to_bag_and_checkout() {
	    search.i_search_for_a_product(Base.reader.getProduct());
	    headerSection.viewShoppingCartOption.click();
	    shoppingcart.checkoutButton.click();
	    
	    
	}

	@When("I place an order")
	public void i_place_an_order() {
		// checkoutPage.continueButtonOfBillingDetailsSection.click();
		// checkoutPage.continueButtonOFDeliveryDetailsSection.click();
		// checkoutPage.continueButtofOfDeliveryMethodSection.click();
		// checkoutPage.termsAndConditionsCheckbox.click();
		// checkoutPage.continueButtonOfPaymentMethodSection.click();
		// checkoutPage.confirmOrderButton.click();
	}

	@Then("I should see that the order is placed successfuly")
	public void i_should_see_that_the_order_is_placed_successfuly() {
		// WebDriverWait wait=new WebDriverWait(Base.driver,10);
		// wait.until(ExpectedConditions.visibilityOf(orderSuccessPage.successBreadcrumb));
	}



}
