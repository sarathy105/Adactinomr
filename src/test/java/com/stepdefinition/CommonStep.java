package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * @Description It is created as a common class to generate the success message after login
 * @Date 19-09-2022
 * @author Parthasarathy
 *
 */

public class CommonStep extends BaseClass {
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * @Description User should verify after login {string}
	 * @param expLoginSuccessMsg
	 * @Date 19-09-2022
	 */
	@Then("User should verify after login {string}")
	public void user_should_verify_after_login(String expLoginSuccessMsg) {
		Assert.assertEquals("Verify after login sucess msg", expLoginSuccessMsg, getAttribute(pom.getSearchHotelPage().getSuccessmsg()));
	   
	}

	
}
