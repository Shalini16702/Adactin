package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.worldometers.info/coronavirus/");
	    driver.manage().window().maximize();
	    //Reading All Elements Data (//table/tbody/tr/td-------> ALL DATA)
//	    List<WebElement> virus = driver.findElements(By.xpath("//table/tbody/tr/td"));
//	    for (WebElement webElement : virus) {
//			System.out.println(webElement.getText());
//		}
	    //Reading Particular row from Webtable
	    //table/tbody/tr[index]/td  -------->particular row
	    List<WebElement> row_index = driver.findElements(By.xpath("//table/tbody/tr[21]/td"));
	    for (WebElement abc : row_index) {
			System.out.println(abc.getText());
		}
	  //Reading Particular column from Webtable
	    //table/tbody/tr/td[index]  -------->particular column
	    List<WebElement> column_index = driver.findElements(By.xpath("//table/tbody/tr/td[35]"));
	    for (int i = 0; i < column_index.size(); i++) {
	    	System.out.println(column_index.get(i).getText());
			
		}
	}

}
