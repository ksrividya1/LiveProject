package com.srividya.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.srividya.automation.base.Base;

public class RegisterPage {
	
	//Abstraction is process of hiding the implementation details and showing only the functionality to the users by extending the abstract class.
	//Hiding variables and accessing them using getters and setters methods is called as Encapsulation.
	
	public RegisterPage() {
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement telephone;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassowrd;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//div[contains(text(),'Warning')]")
	private WebElement warning;
	
	@FindBy(linkText="Register")
	private WebElement breadCrumbRegister;
	
	@FindBy(xpath="(//label[text()='Subscribe']/following::input[@type='radio'])[1]")
	private WebElement rdbtnSubscribe;
	
	public WebElement rdbtnSubscribe() {
		return rdbtnSubscribe;
	}
	
	public WebElement firstName() {
		return firstName;
	}
	
	public WebElement lastName() {
		return lastName;
	}
	
	public WebElement email() {
		return email;
	}
	
	public WebElement telephone() {
		return telephone;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement confirmPassword() {
		return confirmPassowrd;
	}
	
	public WebElement checkbox() {
		return checkbox;
	}
	
	public WebElement submit() {
		return btnSubmit;
	}
	
	public WebElement warning() {
		return warning;
	}
	
	public WebElement breadCrumbRegister() {
		return breadCrumbRegister;
	}
	
	
	
	

}
