package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Purchace {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("pbprasanth@gmail.com");
		
		driver.findElement(By.name("passwd")).sendKeys("Prasanth13");
		
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		Thread.sleep(2000);
		
		WebElement dress = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		Actions a = new Actions(driver);
		a.moveToElement(dress).build().perform();
				
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[2]")).click();
		Thread.sleep(2000);
		
		WebElement dress1 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(dress1).build().perform();
		
	/*	driver.findElement(By.xpath("//span[text()='More']")).click();*/
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		Thread.sleep(2000);
		
			
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		
		
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("cgv")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		
		
		
	}

}
