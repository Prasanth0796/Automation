package com.java.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("//input[@aria-required='true']"));
		username.sendKeys("pbprasanth");
		
		
		
		
		
	}

}
