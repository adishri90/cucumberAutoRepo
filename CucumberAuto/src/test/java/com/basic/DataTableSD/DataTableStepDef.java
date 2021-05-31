package com.basic.DataTableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class DataTableStepDef {
	
	WebDriver driver;
	
	
	
	@Given("^User needs to be on Facebook login page$")
	
	public void user_needs_to_be_on_Facebook_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adashriv\\Downloads\\Cucumber Automation\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	
	
	@When("^Enter following data$")
	public void enter_following_data(DataTable table) throws InterruptedException
	{
		List<List<String>> data= table.raw();
		String username1=data.get(1).get(0);
		String password1=data.get(1).get(1);
		
		driver.findElement(By.id("email")).sendKeys(username1);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password1);
		
	}
	
	

}
