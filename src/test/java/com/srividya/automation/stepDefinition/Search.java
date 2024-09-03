package com.srividya.automation.stepDefinition;

import org.junit.Assert;

import com.srividya.automation.pages.HeaderSection;
import com.srividya.automation.pages.SearchResultsPage;
import io.cucumber.java.en.*;

public class Search {
	HeaderSection header=new HeaderSection();
	SearchResultsPage searchResultsPage=new SearchResultsPage();
	
	@When("I search for a product {string}")
	public void i_search_for_a_product(String string) {
		header.searchBoxField.sendKeys(string);
		header.searchButton.click();
	   
	}

	@Then("I should see the product in the search results")
	public void i_should_see_the_product_in_the_search_results() {
	   Assert.assertTrue(searchResultsPage.samsungSyncMasterSearchResult.isDisplayed());
	}

	@Then("I should see a message informing {string}")
	public void i_should_see_a_message_informing(String string) {
		Assert.assertEquals(searchResultsPage.noResultsMessage.getText(),"There is no product that matches the search criteria.");
	}


}
