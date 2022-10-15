package com.stepdefinition;

import org.junit.Assert;


import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * @Description Search hotel steps execution
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */

public class TC2_SearchHotelStep extends BaseClass {
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * @Desripition User should search hotels by selecting all the fields using {string} , {string}, {string},{string},{string},{string} and {string}
	 * @param location
	 * @param roomtype
	 * @param roomno
	 * @param checkin
	 * @param checkout
	 * @param adultroom3
	 * @param childroom
	 * @Date 19-09-2022
	 */
	@Then("User should search hotels by selecting all the fields using {string} , {string}, {string},{string},{string},{string} and {string}")
	public void user_should_search_hotels_by_selecting_all_the_fields_using_and(String location, String roomtype, String roomno, String checkin, String checkout,  String adultroom, String childroom) {
	  pom.getSearchHotelPage().searchPage(location, roomtype,roomno, checkin, checkout, adultroom, childroom);
	}
	
	
	/**
	 * @Description User should verify after search {string}
	 * @param expsucccessmsg
	 * @Date 19-09-2022
	 */
	@Then("User should verify after search {string}")
	public void user_should_verify_after_search(String expsucccessmsg) {
		Assert.assertEquals("Verify after login sucess msg", expsucccessmsg,getText(pom.getSelectHotelPage().getSelectsuccessmsg()));
	  
	}
	
	/**
	 * @Description User should search hotels by selecting only the mandatory fields using {string} , {string},{string},{string} and {string} 
	 * @param location
	 * @param roomno
	 * @param checkin
	 * @param checkout
	 * @param adultroom
	 * @Date 19-09-2022
	 */
	@Then("User should search hotels by selecting only the mandatory fields using {string} , {string},{string},{string} and {string}")
	public void user_should_search_hotels_by_selecting_only_the_mandatory_fields_using_and(String location, String roomno, String checkin, String checkout, String adultroom) {
	   pom.getSearchHotelPage().searchPage(location , roomno, checkin, checkout, adultroom);
	}
	
	/**
	 * @Description User should verify a date error message after search  {string} and {string}
	 * @param checkinerrormsg
	 * @param checkouterrormsg
	 * @Date 19-09-2022
	 */
	@Then("User should verify a date error message after search  {string} and {string}")
	public void user_should_verify_a_date_error_message_after_search_and(String checkinerrormsg, String checkouterrormsg) {
		Assert.assertEquals("Verify check in date error msg", checkinerrormsg, getText(pom.getSearchHotelPage().getCheckinerror()));
		Assert.assertEquals("Verify check out error msg", checkouterrormsg, getText(pom.getSearchHotelPage().getCheckouterror()));
		  
	}
	
	
	/**
	 * @Description User should  search the hotel without selecting any fields
	 * @Date 19-09-2022
	 */
	@Then("User should  search the hotel without selecting any fields")
	public void user_should_search_the_hotel_without_selecting_any_fields() {
		pom.getSearchHotelPage().searchPage();
	   
	}
	
	
	
	/**
	 * @Description User should verify a location error messgage  after search  {string}
	 * @param locationerrormsg
	 */
	@Then("User should verify a location error messgage  after search  {string}")
	public void user_should_verify_a_location_error_messgage_after_search(String locationerrormsg) {
		Assert.assertEquals("Verify location error msg", locationerrormsg,getText(pom.getSearchHotelPage().getLocationerror()));
	  
	}

	
	
	
}
