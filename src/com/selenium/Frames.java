package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Frames.html");
    driver.manage().window().maximize();
    WebElement single_iframe = driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
    driver.switchTo().frame(single_iframe);
    WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
    box.sendKeys("shalini");
    driver.switchTo().defaultContent();
    WebElement iframe_iframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
    iframe_iframe.click();
    driver.switchTo().frame(1);
    driver.switchTo().frame(0);
    WebElement iframe_box = driver.findElement(By.xpath("//input[@type='text']"));
    iframe_box.sendKeys("velu");
}
}
