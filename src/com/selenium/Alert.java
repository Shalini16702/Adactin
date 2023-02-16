package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    WebElement simple_aleret = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	    simple_aleret.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	   // Thread.sleep(3000);
	    WebElement alert_with_ok_cancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	    alert_with_ok_cancel.click();
	    Thread.sleep(3000);
	    WebElement confirm_box = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	    confirm_box.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	   // Thread.sleep(3000);
	    WebElement alert_with_textbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	    alert_with_textbox.click();
	    Thread.sleep(3000);
	    WebElement prompt_box = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	    prompt_box.click();
	    Thread.sleep(3000);
	    driver.switchTo().alert().sendKeys("Shalini");
	    String text = driver.switchTo().alert().getText();
	    System.out.println(text);
	    driver.switchTo().alert().accept();
	}
	
}
