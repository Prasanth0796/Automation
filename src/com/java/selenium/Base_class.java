package com.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {

	public static WebDriver driver;
	public static WebDriver getbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir ") + ("\\Driver\\msedgedriver.exe"));
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + ("\\Driver\\firefoxdriver.exe"));
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String path) {
		driver.get(path);

	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
		
	}

	public static void click(WebElement element) {

		element.click();

	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void actions() {
		
	}
	public static void robot() {
		
		
	}
	public void dropDown() {
		
	}
	public void navigateTo() {
		
	}
	public void close() {
		
	}
	public void forGet() {
		
	}
	public void checkBox() {
		
	}
	public void isEnable() {
		
	}
	public void isDisplayed() {
		
	}
	public void windowsHandling() {
	
	}
	public void getOption() {
		
		
	}
	public void getTitle() {
		
	}
	public void getCurrentUrl() {
		
	}
	public void radio() {
		
	}
	}
	
	
	
	


