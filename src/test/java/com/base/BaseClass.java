package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @Description Used to maintain the reusable methods 
 * @author Parthasarathy
 * @Date 19-sep-2022
 *
 */
public class BaseClass {
	public static WebDriver driver;
	
	/**
	 * @Description
	 * @Date 19-09-2022
	 */
	public static void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	/**
	 * @Description Used to get the url for the browser to launch
	 * @param url
	 * @Date 19-09-2022
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * @Description Used to maximize the window
	 * @Date 19-09-2022
	 */
	public static void maximizewindow() {
		driver.manage().window().maximize();

	}
	
	/**
	 * @Description Used to clear the content in the text box
	 * @param element
	 * @Date 19-09-2022
	 */
	public void clearMethod(WebElement element) {
		element.clear();
	}
	
	/**
	 * @Description Used to find element by id
	 * @param attributevalue
	 * @return WebElement
	 * @Date 19-09-2022
	 */
	public WebElement findElementById(String attributevalue) {
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;

	}
	
	/**
	 * @Description Used to insert the value in the text box
	 * @param element
	 * @param data
	 * @Date 19-09-2022
	 */

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	/**
	 * @Description Used to click an element
	 * @param element
	 * @Date 19-09-2022
	 */
	public void elementClick(WebElement element) {
		element.click();

	}
	
	/**
	 * @Description Used to select the option by text
	 * @param element
	 * @param text
	 */
	public void selecetByVisibleText(WebElement element, String text) {
		Select sc=new Select(element);
		sc.selectByVisibleText(text);

	}
	
	/**
	 * @Description Used to select the option by index
	 * @param element
	 * @param index
	 */
	public void selecetByIndex(WebElement element, int index) {
		Select sc=new Select(element);
		sc.selectByIndex(index);	

	}
	
	
	/**
	 * @Description USed to take the screenshot
	 * @return File
	 * @Date 19-09-2022
	 */
	public File screenShot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		return file;
	}

	/**
	 * @Description Used to wait for given value
	 * @param value
	 * @throws InterruptedException
	 * @Date 19-09-2022
	 */
		public void sleep(long value) throws InterruptedException {
		Thread.sleep(value);

	}
		
		/**
		 * @Description Used to get the attribute value from the webpage
		 * @param element
		 * @return String
		 * @Date 19-09-2022
		 */
	
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	
	/**
	 * @Description Used to get the text from the webpage
	 * @param element
	 * @return String
	 * @Date 19-09-2022
	 */

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	
	/**
	 * @Description Used to find the element using xpath
	 * @param attributevalue
	 * @return WebElement
	 * @Date 19-09-2022
	 */
	public WebElement findElementXpath(String attributevalue) {
		WebElement element = driver.findElement(By.xpath(attributevalue));
		return element;

	}

/**
 * @Description Used to close all the window
 * @Date 19-09-2022
 */
	public static void quitdriver() {
		driver.quit();
	}
	
	/**
	 * @Description Used to Close the current window
	 * @Date 19-09-2022
	 */

	public void close() {
		driver.close();
	}

	/**
	 * @Description Used to press the key
	 * @param enter
	 * @throws AWTException
	 */
	public void robotKeyPress(int enter) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(enter);
	}

	/**
	 * @Description Used to release the key
	 * @param keycode
	 * @throws AWTException
	 * @Date 19-09-2022
	 */
	public void robotKeyRelease(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}

	
	
	/**
	 * @Description Used to accept the alert
	 * @Date 19-09-2022
	 */

	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	/**
	 * @Description Used to dismiss the alert
	 * @Date 19-09-2022
	 */
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	
	
	/**
	 * @Descripton USsed to get the property file value
	 * @param key
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties= new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") +"\\Config\\Config.properties"));
		return (String) properties.get(key);
	}
	
	/**
	 * @Description Used to get the broweser type as input
	 * @param browserType
	 * @Date 19-09-2022
	 */
	
	public static void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		case "ie":
			driver=new InternetExplorerDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
			
		default:
			break;
		}
	}
	
	
	/**
	 * @Description Used to take Screenshot 
	 * @return byte[] 
	 * Date 19-09-2022
	 */
	public byte[] getScreenshot() {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
	}



}


