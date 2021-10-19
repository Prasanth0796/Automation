package com.java.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws  InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.navigate().back();
		
	TakesScreenshot tr = (TakesScreenshot) driver;
	File source = tr.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\screenshot\\test.png");
	FileUtils.copyFile(source, destination);
	
	driver.close();
}
}
