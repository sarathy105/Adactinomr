package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Description Used to maintain the Searchhotel page locators and getter methods
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class SearchHotelPage extends BaseClass {

	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * @Date 19-09-2022
	 */

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @Description Used to maintain the locators and getter methods
	 * @Date 19-09-2022
	 */

	@FindBy(id = "location")
	private WebElement htlocaion;
	@FindBy(id = "hotels")
	private WebElement hthotel;
	@FindBy(id = "room_type")
	private WebElement htroomtype;
	@FindBy(id = "datepick_in")
	private WebElement htcheckin;
	@FindBy(id = "datepick_out")
	private WebElement htcheckout;
	@FindBy(id = "room_nos")
	private WebElement htroomno;
	@FindBy(id = "adult_room")
	private WebElement htadultroom;
	@FindBy(id = "child_room")
	private WebElement htchildroom;
	@FindBy(id = "Submit")
	private WebElement btnsubmit;
	@FindBy(id = "username_show")
	private WebElement successmsg;
	@FindBy(id = "location_span")
	private WebElement locationerror;
	@FindBy(id = "checkin_span")
	private WebElement checkinerror;
	@FindBy(id = "checkout_span")
	private WebElement checkouterror;

	public WebElement getCheckinerror() {
		return checkinerror;
	}

	public WebElement getCheckouterror() {
		return checkouterror;
	}

	public WebElement getLocationerror() {
		return locationerror;
	}

	public WebElement getSuccessmsg() {
		return successmsg;
	}

	public WebElement getHtlocaion() {
		return htlocaion;
	}

	public WebElement getHthotel() {
		return hthotel;
	}

	public WebElement getHtroomtype() {
		return htroomtype;
	}

	public WebElement getHtcheckin() {
		return htcheckin;
	}

	public WebElement getHtcheckout() {
		return htcheckout;
	}

	public WebElement getHtroomno() {
		return htroomno;
	}

	public WebElement getHtadultroom() {
		return htadultroom;
	}

	public WebElement getHtchildroom() {
		return htchildroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	/**
	 * @Description Used to provide all the inputs in the search hotel page
	 * @param location
	 * @param roomtype
	 * @param roomno
	 * @param checkin
	 * @param checkout
	 * @param adultroom
	 * @param childroom
	 * @Date 19-09-2022
	 */

	public void searchPage(String location, String roomtype, String roomno, String checkin, String checkout,
			String adultroom, String childroom) {
		selecetByVisibleText(getHtlocaion(), location);
		sendKeys(getHtroomtype(), roomtype);
		sendKeys(getHtroomno(), roomno);
		clearMethod(getHtcheckin());
		sendKeys(getHtcheckin(), checkin);
		clearMethod(getHtcheckout());
		sendKeys(getHtcheckout(), checkout);
		sendKeys(getHtadultroom(), adultroom);
		sendKeys(getHtchildroom(), childroom);
		elementClick(getBtnsubmit());

	}

	/**
	 * @Description Used to provide only the mandatory inputs in the search hotel
	 *              page
	 * @param location
	 * @param roomno
	 * @param checkin
	 * @param checkout
	 * @param adultroom
	 * @Date 19-09-2022
	 */
	public void searchPage(String location, String roomno, String checkin, String checkout, String adultroom) {
		selecetByVisibleText(getHtlocaion(), location);
		sendKeys(getHtroomno(), roomno);
		clearMethod(getHtcheckin());
		sendKeys(getHtcheckin(), checkin);
		clearMethod(getHtcheckout());
		sendKeys(getHtcheckout(), checkout);
		sendKeys(getHtadultroom(), adultroom);
		elementClick(getBtnsubmit());

	}

	/**
	 * @Description Used to click the element in the search hotel page
	 * @Date 19-09-2022
	 */
	public void searchPage() {
		elementClick(getBtnsubmit());

	}

}
