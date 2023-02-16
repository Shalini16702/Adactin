package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    //tagName[@attributeName='attributeValue'----->Basic index also
    WebElement button = driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute'][1]"));
    button.click();
    button.sendKeys("oneplus phone");
    Thread.sleep(3000);
    //tagName[text()='full text']
    WebElement seller = driver.findElement(By.xpath("(//a[text()='Sell'])"));
    seller.click();
    
    
    
    
    
    
   
}
}
