package com.basic.sharedataSD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ShareDataStepDef {
	
	WebDriver driver;
	
	
	
	public ShareDataStepDef(SharedClass share) //Created a constructor and parameters are shared class object
	{
		driver= share.setup();
	}
	
	@Given("^User needs to be on Facebook login page$")
	
	public void user_needs_to_be_on_Facebook_login_page()
	{
		
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	
	public void user_enters_user_first_name(String username)
	
	{
		driver.findElement(By.id("email")).sendKeys(username);
	}
	
	
	
	
	
	
	
	

}
