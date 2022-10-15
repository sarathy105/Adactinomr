package com.stepdefinition;

import java.awt.AWTException;
import org.junit.Assert;
import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



/**
 * @Description Login page steps execution
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class TC1_LoginStep extends BaseClass {
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * @Description User should be in the login page of Adactin hotel webpage
	 * @Date 19-09-2022
	 */
	@Given("User should be in the login page of Adactin hotel webpage")
	public void user_should_be_in_the_login_page_of_adactin_hotel_webpage() {
		
	}
	
	/**
	 * @Description User should login using {string}, {string}
	 * @Date 19-09-2022
	 */
	@When("User should login using {string}, {string}")
	public void user_should_login_using(String username, String password) {
		pom.getLoginPage().login(username, password);
	  
	}
	
	/**
	 * @Description User should login using {string} , {string} with Enter key
	 * @Date 19-09-2022
	 */

	@When("User should login using {string} , {string} with Enter key")
	public void user_should_login_using_with_enter_key(String username, String password) throws AWTException {
	  pom.getLoginPage().loginWithEnter(username, password);
	  
	}
	
	
	/**
	 * @Description User should verify after login with invalid credentials error msg contains {string}
	 * @Date 19-09-2022
	 */
	
	@Then("User should verify after login with invalid credentials error msg contains {string}")
	public void user_should_verify_after_login_with_invalid_credentials_error_msg_contains(String expLoginErrorMsg) {
	Assert.assertTrue("Verify login error msg", getText(pom.getLoginPage().getTxterrormsg()).contains(expLoginErrorMsg));
	}
	
	




}
