package com.pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * @Description Used to maintain the Loginhotel page locators and getter method
 * @author Parthasarathy
 * @Date 19-09-2022
 */
public class LoginPage extends BaseClass {
	
	/**
	 * @Description Used to maintain the defalut constructor page factory
	 * @Date 19-09-2022
	 */
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @Description Used to maintain the locators and getters methods
	 * @Date 19-09-2022 
	 */
	 @FindBy(id="username")
	 private WebElement txtusername;
	 @FindBy(id="password")
	 private WebElement txtpass;
	 @FindBy(id="login")
	 private WebElement btnlogin;
	 @FindBy(className="auth_error")
	 private WebElement txterrormsg;
	 
	public WebElement getTxterrormsg() {
		return txterrormsg;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	/**
	 * @Description Used to provide input for the login 
	 * @param username
	 * @param password
	 * @Date 19-09-2022
	 */
	
	public void login(String username, String password) {
	sendKeys(getTxtusername(), username);
	sendKeys(getTxtpass(), password);
	elementClick(getBtnlogin());
		

	}
	
	/**
	 * @Description Used to provide input for the login with enter key
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnter(String username, String password) throws AWTException {
		sendKeys(getTxtusername(), username);
		sendKeys(getTxtpass(), password);
		robotKeyPress(KeyEvent.VK_TAB);
		robotKeyRelease(KeyEvent.VK_TAB);
		robotKeyPress(KeyEvent.VK_TAB);
		robotKeyRelease(KeyEvent.VK_TAB);
		robotKeyPress(KeyEvent.VK_ENTER);
		robotKeyRelease(KeyEvent.VK_ENTER);
	

	}
	
}
