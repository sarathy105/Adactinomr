package com.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



/**
 * @Description Used to maintain the Cancelhotel page locators and getter methods
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class CancelBookingPage extends BaseClass{
	
	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * @Date 19-09-2022
	 */
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);

	}
	
	/**
	 * @Description Used to maintain the locators and getters method
	 * @Date 19-09-2022
	 */


	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedid;
	@FindBy(id="order_id_text")
	private WebElement searchid;
	@FindBy(id="search_hotel_id")
	private WebElement btngo;
	
	@FindBy(name="cancelall")
	private WebElement cancelhotelid;
	@FindBy(id="search_result_error")
	private WebElement cancelbookinerrormsg;
	@FindBy(xpath="//input[@type='button'][1]")
	private WebElement cancelclick;

	
	public WebElement getCancelclick() {
		return cancelclick;
	}

	public WebElement getCancelbookinerrormsg() {
		return cancelbookinerrormsg;
	}

	public WebElement getBookedid() {
		return bookedid;
	}
	
	public WebElement getSearchid() {
		return searchid;
	}
	
	public WebElement getBtngo() {
		return btngo;
	}
	
	public WebElement getCancelhotelid() {
		return cancelhotelid;
	}

 /**
 * @Decription Used to cancel the booking using the given order id
 * @param orderid
 * @throws AWTException
 * @throws InterruptedException
 * @Date 19-09-2022
 */
	
	public void cancelHotel(String orderid) throws AWTException, InterruptedException {
	elementClick(getBookedid());
	sendKeys(getSearchid(), orderid);
	elementClick(getBtngo());
	elementClick(getCancelclick());
	acceptAlert();
	
	
	}

}
