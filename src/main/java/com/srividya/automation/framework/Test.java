package com.srividya.automation.framework;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		
		JavascriptExecutor exe=((JavascriptExecutor) driver);
		//exe.executeScript("arguments[0].value=\"Hello\"", driver.findElement(By.xpath("//input[@name='q']")));
		exe.executeScript("document.body.style.zoom='100%'");
	}

}
