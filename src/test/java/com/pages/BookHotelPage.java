package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Description Used to maintain the Bookhotel page locators and getter methods
 * @author Parthasarathy
 * @Date 19-09-2022
 *
 */
public class BookHotelPage extends BaseClass{
	
	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * Date 19-09-2022
	 */
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * @Description Used to maintain the locators and getters method 
	 * @Date 19-09-2022
	 */
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardnum;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement cardexpmonth;
	@FindBy(id="cc_exp_year")
	private WebElement cardexpyear;
	@FindBy(id="cc_cvv")
	private WebElement cardcvv;
	@FindBy(id="book_now")
	private WebElement btnbooknow;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement selectsucceccmsg;
	@FindBy(xpath="//td[text()='Booking Confirmation '] ")
	private WebElement bookingsuccessmsg;
	
	@FindBy(id="first_name_span")
	private WebElement firstnameerrormsg;
	@FindBy(id="last_name_span")
	private WebElement lastnameerrormsg;
	@FindBy(id="address_span")
	private WebElement addresserrormsg;
	@FindBy(id="cc_num_span")
	private WebElement ccnumerrormsg;
	@FindBy(id="cc_type_span")
	private WebElement cctypeerrormsg;
	@FindBy(id="cc_expiry_span")
	private WebElement ccexpiryerrormsg;
	@FindBy(id="cc_cvv_span")
	private WebElement cccvverrormsg;
	
	
	public WebElement getFirstnameerrormsg() {
		return firstnameerrormsg;
	}
	public WebElement getLastnameerrormsg() {
		return lastnameerrormsg;
	}
	public WebElement getAddresserrormsg() {
		return addresserrormsg;
	}
	public WebElement getCcnumerrormsg() {
		return ccnumerrormsg;
	}
	public WebElement getCctypeerrormsg() {
		return cctypeerrormsg;
	}
	public WebElement getCcexpiryerrormsg() {
		return ccexpiryerrormsg;
	}
	public WebElement getCccvverrormsg() {
		return cccvverrormsg;
	}
	public WebElement getBookingsuccessmsg() {
		return bookingsuccessmsg;
	}
	public WebElement getSelectsucceccmsg() {
		return selectsucceccmsg;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardnum() {
		return cardnum;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexpmonth() {
		return cardexpmonth;
	}
	public WebElement getCardexpyear() {
		return cardexpyear;
	}
	public WebElement getCardcvv() {
		return cardcvv;
	}
	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	
	
	/**
	 * @Description Used to provide inputs in the book hotel page
	 * @param firstname
	 * @param lastname
	 * @param address
	 * @param cardnumber
	 * @param cardtype
	 * @param cardexpmonth
	 * @param cardexpyear
	 * @param cardcvv
	 * @Date 19-09-2022
	 */
	
	public void bookHotel(String firstname, String lastname,
			String address, String cardnumber, String cardtype,
			String cardexpmonth, String cardexpyear, String cardcvv) {
		sendKeys(getFirstname(), firstname);	
		sendKeys(getLastname(), lastname);
		sendKeys(getAddress(), address);
		sendKeys(getCardnum(), cardnumber);
		sendKeys(getCardtype(), cardtype);
		sendKeys(getCardexpmonth(),cardexpmonth);
		sendKeys(getCardexpyear(), cardexpyear);
		sendKeys(getCardcvv(), cardcvv);
		elementClick(getBtnbooknow());
	}

	/**
	 * Descripition Used to click the element in the book hotel page
	 * @Date 19-09-2022
	 */
	public void bookHotel() {
	
		elementClick(getBtnbooknow());
	}



}
