package com.java.testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement from = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement to = driver.findElement(By.id("bank"));
		
	    Actions ac = new Actions(driver);
	    ac.dragAndDrop(from, to).build().perform();
	    Thread.sleep(3000);
	    
	    WebElement from1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
	    WebElement to1 = driver.findElement(By.id("amt7"));
	    ac.dragAndDrop(from1, to1).build().perform();
	    Thread.sleep(3000);
	    
	  
         WebElement from3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		 WebElement to3 = driver.findElement(By.id("loan"));
	     ac.dragAndDrop(from3, to3).build().perform();
	     Thread.sleep(3000);
	     
	     
	     WebElement from4 = driver.findElement(By.xpath("(//a[@style='color:#FFFFFF;'])[4]"));
	     WebElement to4 = driver.findElement(By.id("amt8"));
	      ac.dragAndDrop(from4, to4).build().perform();
	      
	      TakesScreenshot ts = (TakesScreenshot) driver;
	      File source = ts.getScreenshotAs(OutputType.FILE);
	      File destination=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\screenshot\\image1.png");
	      FileUtils.copyFile(source, destination);
	      driver.close();
	      
}
}