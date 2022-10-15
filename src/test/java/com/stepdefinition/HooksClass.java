package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



/**
 * @Description Hooksclass execution
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class HooksClass extends BaseClass{
	
	/**
	 * @Description Used to launch the browser and maximize
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @Date 19-09-2022
	 */
	
	
	@Before
	public void beforeScenerio()  throws FileNotFoundException, IOException{
		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
		maximizewindow();
	   
	}
	
	/**
	 * @Description Used to take the screeshot if the scenario fails and also to close the browser.
	 * @param scenario
	 * @Date 19-09-2022
	 */
	
	@After
	public void afterScenario(Scenario scenario) {
		boolean b = scenario.isFailed();
		if(b) {
		scenario.attach(getScreenshot(), "image/png", "Screenshot Attachment");
		}
		quitdriver();
	}
	
	
}
