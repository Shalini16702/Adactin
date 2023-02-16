package com.selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    //Screenshot taking process 
    TakesScreenshot aa = (TakesScreenshot)driver;
    File source = aa.getScreenshotAs(OutputType.FILE);
    File destination = new File("C:\\Users\\WELCOME\\eclipse-workspace\\See\\Screenshot//Screenshot.png");
    FileUtils.copyFile(source, destination);
    
}
}
