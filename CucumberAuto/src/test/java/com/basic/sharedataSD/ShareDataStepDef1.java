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



public class ShareDataStepDef1 {
	
	WebDriver driver;
	
	public ShareDataStepDef1(SharedClass share) //Created a constructor and parameters are shared class object
	{
		driver= share.setup();
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
	
	

}
