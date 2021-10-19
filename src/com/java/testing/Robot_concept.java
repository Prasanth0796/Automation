package com.java.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_concept {
	
	public static void main(String[] args) throws InterruptedException, AWTException  {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement seller = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		
		Actions ac =new Actions(driver);
		ac.contextClick(seller).build().perform();
		Thread.sleep(3000);
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		
		WebElement com = driver.findElement(By.xpath("//a[text()='Computers']"));
		ac.contextClick(com).build().perform();
		Robot rb1 = new Robot();
		rb1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb1.keyPress(KeyEvent.VK_ENTER);
		
		WebElement cou = driver.findElement(By.xpath("//a[text()='Coupons']"));
		ac.contextClick(cou).build().perform();
		Robot rb2 = new Robot();
		rb2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb2.keyPress(KeyEvent.VK_ENTER);
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ac.contextClick(ele).build().perform();
		Robot rb3 = new Robot();
		rb3.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb3.keyPress(KeyEvent.VK_ENTER);
		
		WebElement newrel = driver.findElement(By.xpath("//a[text()='New Releases']"));
		ac.contextClick(newrel).build().perform();
		Robot rb4 = new Robot();
		rb4.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb4.keyPress(KeyEvent.VK_ENTER);
		
	     Set<String> all_id = driver.getWindowHandles();
	     for (String sr : all_id) {
	    	 System.out.println(sr);
	    	 String title = driver.switchTo().window(sr).getTitle();
	    	 System.out.println(title);
	    	 }
		
	     String actual_title ="Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
	     for (String sr : all_id) {
			if(driver.switchTo().window(sr).getTitle().equals(actual_title));{
			break;
		}
	     }
	     	driver.close();
	}
	

}
