package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    WebElement emailid = driver.findElement(By.name("email"));
	    emailid.click();
	    emailid.sendKeys("9094955180");
	    WebElement password = driver.findElement(By.id("pass"));
	    password.click();
	    password.sendKeys("31*72**9");
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	}

}
