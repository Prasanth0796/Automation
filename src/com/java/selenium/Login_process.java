package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_process {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("pbprasanth9@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='icon-user left']")).click();
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
	    gender.click();
	    Thread.sleep(2000);
	    
		WebElement name = driver.findElement(By.name("customer_firstname"));
		name.sendKeys("Prasanth");

		WebElement last = driver.findElement(By.name("customer_lastname"));
		last.sendKeys("babu");

		WebElement mail = driver.findElement(By.name("passwd"));
		mail.sendKeys("Prasanth13");

		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByIndex(13);

		WebElement mon = driver.findElement(By.id("months"));
		Select s1 = new Select(mon);
		s1.selectByValue("3");

		WebElement year = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
		Select s2 = new Select(year);
		s2.selectByValue("1996");

		WebElement company = driver.findElement(By.name("company"));
		company.sendKeys("private company");

		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("21c,baliamman kovil lane");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");

		WebElement state = driver.findElement(By.id("id_state"));
		Select s3 = new Select(state);
		s3.selectByValue("32");

		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("10001");

		WebElement uni = driver.findElement(By.name("id_country"));
		Select s4 = new Select(uni);
		s4.selectByValue("21");

		driver.findElement(By.name("other")).sendKeys("im a mechanical enginer");

		driver.findElement(By.id("phone")).sendKeys("7010113936");

		driver.findElement(By.id("alias")).sendKeys("villivakkam");

		driver.findElement(By.xpath("//span[text()='Register']")).click();

	}

}
