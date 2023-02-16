package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
public static void main(String[] args) throws Throwable  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://letcode.in/dropdowns");
    driver.manage().window().maximize();
    WebElement single_dropdown = driver.findElement(By.xpath("(//div[@class='select'])[1]//select"));
    Select dd = new Select(single_dropdown);
    dd.selectByVisibleText("Apple");
    //below are Multiple Dropdown
    
    WebElement multiple_dropdown = driver.findElement(By.xpath("//div[@class='select is-multiple']//select"));
    Select ss = new Select(multiple_dropdown);
    boolean multiple = ss.isMultiple();
    System.out.println("Multiple Dropdown");
    System.out.println("=====================");
    ss.selectByVisibleText("Ant-Man");
    ss.selectByVisibleText("Aquaman");
    ss.selectByVisibleText("The Avengers");
    ss.selectByVisibleText("Batman");
    ss.selectByVisibleText("Iron Man");
    
    List<WebElement> allSelectedOptions = ss.getAllSelectedOptions();
    for (WebElement webElement : allSelectedOptions) {
		System.out.println(webElement.getText());
	}
    Thread.sleep(3000);
    ss.deselectByVisibleText("Aquaman");
    ss.deselectByVisibleText("Batman");
    Thread.sleep(3000);
    ss.deselectAll();
    System.out.println("==========================");
    System.out.println("Applications Options");
    List<WebElement> options = ss.getOptions();
    for (WebElement webElement1 : options) {
    	System.out.println(webElement1.getText());
		
	}
	}
}

