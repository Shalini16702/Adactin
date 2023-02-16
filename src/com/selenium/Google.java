package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
	driver.get("http://www.amazon.in/");
	driver.manage().window().maximize();
	
	
}
}
  