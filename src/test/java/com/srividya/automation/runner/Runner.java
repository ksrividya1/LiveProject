package com.srividya.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"classpath:FeatureFiles/Registration.feature","classpath:FeatureFiles/LoginApp.feature","classpath:FeatureFiles/Search.feature"},
	glue= {"classpath:Registration.java"},
	plugin={"html:target/cucumber_html_report"}
)
public class Runner {

}
