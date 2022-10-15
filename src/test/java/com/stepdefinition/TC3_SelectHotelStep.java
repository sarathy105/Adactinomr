package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


/**
 * @Description Selecthotel page steps execution
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */
public class TC3_SelectHotelStep  extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	
	/**
	 * @Description User should select any hotel name
	 * @Date 19-09-2022
	 */
	@Then("User should select any hotel name")
	public void user_should_select_any_hotel_name() {
		pom.getSelectHotelPage().selectHotel();
	    
	}


	/**
	 * @Description User should verify after select hotel name success message {string}
	 * @param bookahotelsuccessmsg
	 * @Date 19-09-2022 
	 */
	@Then("User should verify after select hotel name success message {string}")
	public void user_should_verify_after_select_hotel_name_success_message(String bookahotelsuccessmsg) {
		Assert.assertEquals("Verify after select success msg", bookahotelsuccessmsg, getText(pom.getBookHotelPage().getSelectsucceccmsg()));
	    
	}
	
	
	/**
	 * @Description User should click continue without select any hotel
	 * @Date 19-09-2022
	 */
	@Then("User should click continue without select any hotel")
	public void user_should_click_continue_without_select_any_hotel() {
		pom.getSelectHotelPage().clickHotel();
	    
	}
	
	/**
	 * @Description User should verify without select any hotel error message {string}
	 * @param selecterrormsg
	 * @Date 19-09-2022
	 */
	@Then("User should verify without select any hotel error message {string}")
	public void user_should_verify_without_select_any_hotel_error_message(String selecterrormsg) {
		Assert.assertEquals("Verify after select success msg", selecterrormsg, getText(pom.getSelectHotelPage().getSelecterrormsg()));
	   
	}
}
