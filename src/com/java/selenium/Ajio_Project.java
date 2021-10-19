package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio_Project {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.1.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.name("searchVal")).sendKeys("Reebok Shoes");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='facet-head '])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//label[@class='facet-linkname facet-linkname-pricerange facet-linkname-Rs.2001-2500']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@class='circle size-variant-item size-instock '])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();

		driver.close();

	}

}
