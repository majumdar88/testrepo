package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue = {"com.tt.steps"},
		tags = {"@SampleFeature"}
		)
public class testNGtestRunner extends AbstractTestNGCucumberTests {

}
