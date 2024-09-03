package com.srividya.automation.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.srividya.automation.config.ConfigurationReader;

public class Base {
	public static Logger log=LogManager.getLogger(Base.class);
	public static WebDriver driver;
	public static ConfigurationReader reader;
}
