package com.java.testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserchrome {

	public static void main(String[] args) throws  InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("lokijuyht@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("69666886");
		
		driver.findElement(By.name("login")).click();
		
	    String output = driver.findElement(By.className("_9ay7")).getText();
	   
	    System.out.println(output);
	    
				
		
	
		
		
		


		
		
		
		
		
	
		
		/*TakesScreenshot tr = (TakesScreenshot) driver;
		File source = tr.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\screenshot\\test.png");
		FileUtils.copyFile(source, destination);*/
	

	}
}
