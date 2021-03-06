package com.basic.FirstFeatureFile;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyFirstStepDef {
	
	WebDriver driver;
	
	
	
	@Given("^User needs to be on Facebook login page$")
	
	public void user_needs_to_be_on_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adashriv\\Downloads\\Cucumber Automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Opening URL.");
	}
	
	@When("^User enters user first name$")
	
	public void user_enters_user_first_name()
	
	{
		driver.findElement(By.id("email")).sendKeys("Adarsh");
		System.out.println("Entering username.");
	}
	
	@Then("User checks user name is present")
	
	public void user_checks_user_name_is_present()
	{
		String ActualUN= driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals("Adarsh", ActualUN);
	}
	
	

}
