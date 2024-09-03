package com.srividya.automation.stepDefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.srividya.automation.base.Base;
import com.srividya.automation.config.PropertyFileReader;
import com.srividya.automation.framework.Browser;
import com.srividya.automation.util.PathHelper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



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
	
	@After
	public void closeBrowser(Scenario scenario){
		if(scenario.isFailed()){
			scenario.attach(Browser.takeScreenshot(), "png",System.currentTimeMillis()+" Screenshot");
		}
		log.info("Scenario Completed: "+scenario.getName());
		log.info("Scenario Status is: "+scenario.getStatus());
		Base.driver.quit();
	}
	

}
