package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


/**
 * @Description Used to maintain the Selecthotel page locators and getter methods
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class SelectHotelPage extends BaseClass{
	
	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * @Date 19-09-2022
	 */
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * @Description Used to maintain the locators and getters method
	 * @Date 19-09-2022
	 */

	@FindBy(id="radiobutton_1")
	private WebElement selecthotel;
	@FindBy(id="continue")
	private WebElement btncontinue;
	@FindBy(className="login_title")
	private WebElement selectsuccessmsg;
	@FindBy(id="radiobutton_span")
	private WebElement selecterrormsg;
	
	public WebElement getSelecterrormsg() {
		return selecterrormsg;
	}
	public WebElement getSelectsuccessmsg() {
		return selectsuccessmsg;
	}
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}
	
	/**
	 * @Description Used to select the hotel and click the button in selecthotel page
	 * @Date 19-09-2022
	 */
	
	public void selectHotel() {
		elementClick(getSelecthotel());
		elementClick(getBtncontinue());
	}

	/**
	 * @Description Used to click the button without selecting the hotel
	 * @Date 19-09-2022
	 */
	public void clickHotel() {
		elementClick(getBtncontinue());
		
	}


}
