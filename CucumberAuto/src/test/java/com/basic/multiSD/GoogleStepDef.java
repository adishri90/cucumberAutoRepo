package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
WebDriver driver;
	
	
	
	@Given("^User needs to be on google page$")
	
	public void user_needs_to_be_on_google_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adashriv\\Downloads\\Cucumber Automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@When("^User enters search string$")
	
	public void user_enters_search_string()
	
	{
		driver.findElement(By.name("q")).sendKeys("selenium");
	}

}
