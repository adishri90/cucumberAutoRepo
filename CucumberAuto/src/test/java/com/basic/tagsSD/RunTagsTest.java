package com.basic.tagsSD;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions
(
		monochrome=true,
		//dryRun=true,
		//tags={"@Important"}, //All scenarios will be executed
		//tags={"@Smoke"},     //Scenarios with smoke tag in feature file will be executed
		//tags={"@Regression"}, //Scenarios with Regression tag in feature file will be executed
		//tags={"@Smoke", "@Regression"}, //Scenarios only with both Smoke and Regression tags with be executed
		tags={"@Smoke,@Regression"}, //Or condition. Scenarios either with Smoke or with Regression tags will be executed.
		features={"src/test/resources/com/basic/tagsFF/"},
		glue={"com/basic/tagsSD/"},
		plugin={"pretty",
				"html:target/cucmber-htmlreport",
				"json:target/cucumber-report10.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
				}
		)


public class RunTagsTest {

	
}
