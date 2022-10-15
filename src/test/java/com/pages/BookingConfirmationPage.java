package com.pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


/**
 * @Description Used to maintain the Bookingconfirmation page locators and getter methods
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class BookingConfirmationPage extends BaseClass {
	

	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * @Date 19-09-2022
	 */
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * @Description Used to maintain the locators and getters method
	 * @Date 19-09-2022
	 */
	@FindBy(id="order_no")
	private WebElement ordernumber;
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingconfirmationsucessmsg;


	public WebElement getBookingconfirmationsucessmsg() {
		return bookingconfirmationsucessmsg;
	}

	public WebElement getOrdernumber() {
		return ordernumber;
	}
	
	/**
	 * @Description Used to generate the order id for the booking done
	 * @return String
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	
	public String bookingConfirmation() throws IOException, InterruptedException, AWTException {
		sleep(5000);
		String orderid = getAttribute(getOrdernumber());
		System.out.println(orderid);
		return orderid;
		
	
	}

}
