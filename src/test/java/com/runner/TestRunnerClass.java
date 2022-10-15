package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @Description Used to run the feature files
 * @author Parthasarathy
 * @Date 19-09-2022
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, stepNotifications = true, dryRun = false, plugin = { "pretty",
		"json:target//output.json" }, glue = "com.stepdefinition", features = "src\\test\\resources")
public class TestRunnerClass extends BaseClass {

	/**
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @Description Used to generateJVM report in the given loction
	 * @Date 19-09-2022
	 */

	@AfterClass
	public static void report() throws FileNotFoundException, IOException {

		Reporting.generateJVMReport(System.getProperty("user.dir") + getPropertyFileValue("jsonPath"));

	}

}
