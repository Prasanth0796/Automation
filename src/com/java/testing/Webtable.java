package com.java.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable
{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		System.out.println("all data");
		List<WebElement> alldata = driver.findElements
				(By.xpath("//table[@id='customers']//tbody//tr//td"));

		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}

		System.out.println("Particular Row");

	 List<WebElement> add = driver.findElements(By.xpath
				("//table[@id='customers']//tbody//tr//td"));
	 
	 for (WebElement data : add) {
		 
		 System.out.println(data.getText());
		
	}

		}
	}

