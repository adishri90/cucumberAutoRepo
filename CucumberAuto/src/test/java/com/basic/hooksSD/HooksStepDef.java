package com.basic.hooksSD;

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



public class HooksStepDef {
	
	WebDriver driver;
	
	@Before(order=1)
	
	public void beforeSetup1(){
		
		System.out.println("in before1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adashriv\\Downloads\\Cucumber Automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Before (order=2)
	
	public void beforeSetup2(){
		
		System.out.println("in before2");
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
	
	@After (order=2)
	
	public void tearDown1()
	{
		System.out.println("in after1");
		driver.quit();
		driver=null;
	}
	
	@After (order=1)
	
	public void tearDown2()
	{
		System.out.println("in after2");
	}
	
	

}
