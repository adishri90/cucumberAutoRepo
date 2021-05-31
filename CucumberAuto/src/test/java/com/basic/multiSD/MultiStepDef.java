package com.basic.multiSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MultiStepDef {
	
	WebDriver driver;
	
	
	
	@Given("^User needs to be on Facebook login page$")
	
	public void user_needs_to_be_on_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adashriv\\Downloads\\Cucumber Automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	
	public void user_enters_user_first_name(String username)
	
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	@Then("^User checks user name \"([^\"]*)\" is present$")
	
	public void user_checks_user_name_is_present(String username)
	{
		String ActualUN= driver.findElement(By.id("email")).getAttribute("value");
		Assert.assertEquals(username, ActualUN);
	}
	
	@And("^User enters \"([^\"]*)\" password$")
	
	public void user_enters_password(String password)
	{
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
		driver=null; 
	}
	
	
	

}
