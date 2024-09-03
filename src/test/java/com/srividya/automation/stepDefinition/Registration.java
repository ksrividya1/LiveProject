package com.srividya.automation.stepDefinition;

import java.util.Map;

import org.junit.Assert;

import com.srividya.automation.base.Base;
import com.srividya.automation.pages.AccountSuccessPage;
import com.srividya.automation.pages.HeaderSection;
import com.srividya.automation.pages.RegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;


public class Registration {
	HeaderSection header=new HeaderSection();
	RegisterPage register=new RegisterPage();
	AccountSuccessPage accountSuccessPage= new AccountSuccessPage();
	
	@Given("I launch the application")
	public void i_launch_the_application() {
		Base.driver.get(Base.reader.getUrl());
	    
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page() {
	   header.MyAccountLink().click();
	   header.RegisterLink().click();
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {
		
		Map<String,String> field = dataTable.asMap(String.class,String.class);
			register.firstName().sendKeys(field.get("FirstName"));
			register.lastName().sendKeys(field.get("LastName"));
			register.email().sendKeys(System.currentTimeMillis()+field.get("Email"));
			register.telephone().sendKeys(field.get("Telephone"));
			register.password().sendKeys(field.get("Password"));
			register.confirmPassword().sendKeys(field.get("Password"));			
					
	    
	}

	@When("^I select the Privacy Policy$")
	public void i_select_the_Privacy_Policy() {
		register.checkbox().click();
	}

	@When("^I click on Continue button$")
	public void i_click_on_Continue_button() {
		register.submit().click();
	    
	}

	@Then("^I should see that the User Account has successfully created$")
	public void i_should_see_that_the_User_Account_has_successfully_created() {
		Assert.assertTrue(accountSuccessPage.breadCrumbSuccess.isDisplayed());
	}

	@Then("^I should see that the User Account has NOT created$")
	public void i_should_see_that_the_User_Account_has_NOT_created(){
		Assert.assertTrue(register.breadCrumbRegister().isDisplayed());
	}

	@Then("^I should see the error message warning user has to fill all mandatory fields$")
	public void i_should_see_the_error_message_warning_user_has_to_fill_all_mandatory_fields() {
		Assert.assertTrue(register.warning().isDisplayed());
	}

	@When("^I subscribe to Newsletter$")
	public void i_subscribe_to_Newsletter() {
	   register.rdbtnSubscribe().click();
	}

	@When("^I provide the below duplicate details into the fields$")
	public void i_provide_the_below_duplicate_details_into_the_fields(DataTable dataTable) {
	  
			Map<String,String> field=dataTable.asMap(String.class, String.class);
			register.firstName().sendKeys(field.get("FirstName"));
			register.lastName().sendKeys(field.get("LastName"));
			register.email().sendKeys(field.get("Email"));
			register.telephone().sendKeys(field.get("Telephone"));
			register.password().sendKeys(field.get("Password"));
			register.confirmPassword().sendKeys(field.get("Password"));			
						
		
	}
	@Then("^I should see the warning message stating that the user is already created$")
	public void i_should_see_the_warning_message_stating_that_the_user_is_already_created() {
		//Assert.assertTrue(register.warning().isDisplayed());
	}
}
