package com.stepdefinition;

import java.awt.AWTException;

import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;


/**
 * @Descripition Cancel booking page step execution
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */
public class TC5_CancelBookingStep extends BaseClass{
	PageObjectManager pom =new PageObjectManager();
	
	/**
	 * @Descrippition User should cancel the order id
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 * @Date 19-09-2022
	 */
	@Then("User should cancel the order id")
	public void user_should_cancel_the_order_id() throws IOException, InterruptedException, AWTException {
		String orderid = pom.getBookingConfirmationPage().bookingConfirmation();
		pom.getCancelBookingPage().cancelHotel(orderid);
		
	   
	}
	
	/**
	 * @Descripition User should verify after cancel order id success message {string}
	 * @param bookingcancelledmsg
	 * @Date 19-09-2022
	 */
	@Then("User should verify after cancel order id success message {string}")
	public void user_should_verify_after_cancel_order_id_success_message(String bookingcancelledmsg) {
		Assert.assertEquals("Verify after booking cancelled msg", bookingcancelledmsg, getText(pom.getCancelBookingPage().getCancelbookinerrormsg()));
		
	  
	}
	
	
	/**
	 * @Descripition Use should cancel the existing {string}
	 * @param orderid
	 * @throws AWTException
	 * @throws InterruptedException
	 * @Date 19-09-2022
	 */
	@Then("Use should cancel the existing {string}")
	public void use_should_cancel_the_existing(String orderid) throws AWTException, InterruptedException {
		pom.getCancelBookingPage().cancelHotel(orderid);
		
	
	}



}
