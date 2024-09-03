package com.srividya.automation.stepDefinition;

import org.junit.Assert;

import com.srividya.automation.base.Base;
import com.srividya.automation.pages.HeaderSection;
import com.srividya.automation.pages.LoginAppPage;
import com.srividya.automation.pages.MyAccountPage;
import com.srividya.automation.pages.ForgettenPasswordPage;


import io.cucumber.java.en.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginApp {
	
	HeaderSection header = new HeaderSection();
	LoginAppPage loginAppPage=new LoginAppPage();
	MyAccountPage myAccountPage=new MyAccountPage();
	ForgettenPasswordPage forgotPassword =new ForgettenPasswordPage();
	
	
	@Given("^I laugh the application$")
	public void i_laugh_the_application() {
		Base.driver.get(Base.reader.getUrl());
	}

	@Given("^I navigate to Account Login page$")
	public void i_navigate_to_Account_Login_page() {
	    header.MyAccountLink().click();
	    header.LoginLink().click();
	}

	@When("^I login to the Application using Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void i_login_to_the_Application_using_Username_and_Password(String arg1, String arg2) throws Throwable {
		loginAppPage.email.sendKeys(arg1);
		loginAppPage.password.sendKeys(arg2);
		loginAppPage.btnLogin.click();
	}

	@Then("^I should see that the User is able to login successfully$")
	public void i_should_see_that_the_User_is_able_to_login_successfully() throws Throwable {
	   Assert.assertTrue(myAccountPage.linkAffliatedAccount.isDisplayed());
	}

	@Then("I should see an error message that the credentails are invalid")
	public void i_should_see_an_error_message_that_the_credentails_are_invalid() {
		WebDriverWait wait=new WebDriverWait(Base.driver,10);
		wait.until(ExpectedConditions.visibilityOf(loginAppPage.mainWarning));
	    Assert.assertEquals(loginAppPage.mainWarning.getText(), "Warning: No match for E-Mail Address and/or Password.");
	}

	@When("I reset the forgotten password for email {string}")
	public void i_reset_the_forgotten_password_for_email(String string) {
	    loginAppPage.forgotPassword.click();
	    forgotPassword.emailField.sendKeys(string);
	    forgotPassword.continueButton.click();
	}

	@Then("I should see a message informing the User that information related to restting password have been sent to email address")
	public void i_should_see_a_message_informing_the_user_that_information_related_to_restting_password_have_been_sent_to_email_address() {
	    Assert.assertEquals(loginAppPage.mainWarning.getText(),"An email with a confirmation link has been sent your email address.");
	}

}
