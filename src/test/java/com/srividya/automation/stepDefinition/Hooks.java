package com.srividya.automation.stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.srividya.automation.base.Base;
import com.srividya.automation.config.PropertyFileReader;
import com.srividya.automation.framework.Browser;
import com.srividya.automation.util.PathHelper;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class Hooks {
	
	public static Logger log=LogManager.getLogger(Hooks.class);
	
	@Before
	public static void setup(Scenario scenario) {
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		log.info("Scenario Started: "+scenario.getName());
		Base.reader=new PropertyFileReader();
		Browser.startBrowser();
		Browser.maximize();
	} 

}
