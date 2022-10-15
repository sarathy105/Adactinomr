package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


/**
 * @Decripition Book hotel page steps execution
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */
public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * @Descripition User should book hotel using {string}, {string} and {string}
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param dataTable
	 * @Date 19-09-2022
	 */
	@Then("User should book hotel using {string}, {string} and {string}")
	public void user_should_book_hotel_using_and(String firstname, String lastname, String address, io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> datatable = dataTable.asMaps();
	 Map<String, String> m = datatable.get(2);
	 String cardNo = m.get("cardNo");
	 String creditCardType = m.get("creditCardType");
	 String expiryMonth = m.get("expiryMonth");
	 String expiryYear = m.get("expiryYear");
	 String cvv = m.get("cvv");
	 pom.getBookHotelPage().bookHotel(firstname, lastname, address, cardNo, creditCardType, expiryMonth, expiryYear, cvv);
	 		
	}
	
	
	/**
	 * @Descripition User should verify after booking success message {string}
	 * @param bookingsuccessmsg
	 * @throws InterruptedException
	 * @Date 19-09-2022
	 */
	@Then("User should verify after booking success message {string}")
	public void user_should_verify_after_booking_success_message(String bookingsuccessmsg) throws InterruptedException {
		sleep(5000);
		Assert.assertEquals("Verify after booking success msg", bookingsuccessmsg, getText(pom.getBookingConfirmationPage().getBookingconfirmationsucessmsg()));
	    
	}
	
	
	/**
	 * @Descripiton User should verify after booking success message {string}
	 * @Date 19-09-2022
	 */
	@Then("User should click book now button without entering any fields")
	public void user_should_click_book_now_button_without_entering_any_fields() {
		pom.getBookHotelPage().bookHotel();
	   
	}
	
	
	/**
	 * @Descripition User should verify after click book now error message {string} ,{string}, {string},{string},{string},{string} and {string}
	 * @param firtnameerror
	 * @param lastnameerror
	 * @param addresserror
	 * @param cardnoerror
	 * @param cardtypeerror
	 * @param cardexpmponthyearerror
	 * @param cardcvverror
	 * @Date 19-09-2022
	 */
	@Then("User should verify after click book now error message {string} ,{string}, {string},{string},{string},{string} and {string}")
	public void user_should_verify_after_click_book_now_error_message_and(String firtnameerror, String lastnameerror, String addresserror, String cardnoerror,
			String cardtypeerror, String cardexpmponthyearerror, String cardcvverror) {
		Assert.assertEquals("Verify first name error msg", firtnameerror, getText(pom.getBookHotelPage().getFirstnameerrormsg()));
		Assert.assertEquals("Verify last name error msg", lastnameerror, getText(pom.getBookHotelPage().getLastnameerrormsg()));
		Assert.assertEquals("Verify address error msg", addresserror, getText(pom.getBookHotelPage().getAddresserrormsg()));
		Assert.assertEquals("Verify cardnum error msg", cardnoerror, getText(pom.getBookHotelPage().getCcnumerrormsg()));
		Assert.assertEquals("Verify cardtype error msg", cardtypeerror, getText(pom.getBookHotelPage().getCctypeerrormsg()));
		Assert.assertEquals("Verify cardtype error msg", cardexpmponthyearerror, getText(pom.getBookHotelPage().getCcexpiryerrormsg()));
		Assert.assertEquals("Verify cardtype error msg", cardcvverror, getText(pom.getBookHotelPage().getCccvverrormsg()));
	}
	
	
	
	
	


	
	




}
