package com.java.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println("========all data=======");
		List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}
		
		System.out.println("========particular row========");
		
		List<WebElement> prow = driver.findElements(By.xpath("//table[@id='customers]//tr[2]//td"));
		for (WebElement row : prow) {	
        System.out.println(row.getText());
		}
		
		System.out.println("========particular column=======");
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers]//tbody//tr//th[2]"));  
		for (WebElement column : col) {
	    System.out.println(column.getText());	
		}
		
		List<WebElement> col2 = driver.findElements(By.xpath("//table[@id='customers]//tbody//tr//th[1]"));		
		for (WebElement columnw2 : col2) {
		System.out.println(columnw2.getText());
			
		}
		
		

}
}
