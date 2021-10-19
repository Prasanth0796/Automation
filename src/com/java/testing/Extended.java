package com.java.testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Extended extends Base_class {

	public static void main(String[] args) throws AWTException, InterruptedException {
		getbrowser("chrome");
		getUrl("https://www.google.com/");
		sendKeys(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")), "facebook");
		click(driver.findElement(By.name("btnK")));
		click(driver.findElement(By.xpath("//a[@data-hveid='CAEQBA']")));
		navigateBack();
		navigateForward();
		getUrl("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement grow = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		Actions ac = new Actions(driver);
		ac.contextClick(grow).build().perform();
		Thread.sleep(3000);
		Robot rb = new Robot();
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		rb.keyPress(KeyEvent.VK_ENTER);
		

	}
}
