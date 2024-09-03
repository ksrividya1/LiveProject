package com.srividya.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features= {"classpath:FeatureFiles/Registration.feature"},
	glue= {"classpath:Registration.java"},
	tags= {"@Register"},
	plugin= {"html:target/Cucmber_html_report"}
)
public class Runner {

}
