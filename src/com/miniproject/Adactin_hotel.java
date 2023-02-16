package com.miniproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_hotel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	    driver.manage().window().maximize();
	    WebElement username = driver.findElement(By.id("username"));
	    username.click();
	    username.sendKeys("instagram");
	    WebElement password = driver.findElement(By.name("password"));
	    password.click();
	    password.sendKeys("3699VS*n");
	    WebElement login = driver.findElement(By.className("login_button"));
	    login.click();
	    //single dropdown
	    Thread.sleep(3000);
	    WebElement location = driver.findElement(By.xpath("//select[@class='search_combobox'][1]"));
	    Select aa = new Select(location);
	    aa.selectByVisibleText("London");
	    Thread.sleep(3000);
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    Select bb = new Select(hotels);
	    bb.selectByVisibleText("Hotel Hervey");
	    Thread.sleep(3000);
	    WebElement room_type = driver.findElement(By.name("room_type"));
	    Select cc = new Select(room_type);
	    cc.selectByVisibleText("Standard"); 
	    Thread.sleep(3000);
	    WebElement no_of_rooms = driver.findElement(By.id("room_nos"));
	    Select dd = new Select(no_of_rooms);
	    dd.selectByVisibleText("1 - One");
	    Thread.sleep(3000);
	    WebElement check_in = driver.findElement(By.id("datepick_in"));
	    check_in.click();
	    WebElement check_out = driver.findElement(By.id("datepick_out"));
	    check_out.click();
	    Thread.sleep(3000);
	    WebElement adult_rooms = driver.findElement(By.id("adult_room"));
	    Select ee = new Select(adult_rooms);
	    ee.selectByVisibleText("2 - Two");
	    Thread.sleep(3000);
	    WebElement child_per_room = driver.findElement(By.id("child_room"));
	    Select ff = new Select(child_per_room);
	    ee.selectByVisibleText("1 - One");
	    Thread.sleep(3000);
	    WebElement search_button = driver.findElement(By.className("reg_button"));
	    search_button.click();
	    //select butto
	    WebElement select_button = driver.findElement(By.id("radiobutton_0"));
	    select_button.click();
	    //continue button
	    WebElement continue_button = driver.findElement(By.name("continue"));
	    continue_button.click();
	    //billing process
	    WebElement first_name = driver.findElement(By.className("reg_input"));
	    first_name.click();
	    first_name.sendKeys("Shalu");
	    Thread.sleep(3000);
	    WebElement last_name = driver.findElement(By.name("last_name"));
	    last_name.click();
	    last_name.sendKeys("Nithu");
	    Thread.sleep(3000);
	    WebElement billing_address = driver.findElement(By.id("address"));
	    billing_address.click();
	    billing_address.sendKeys("No:62,Gangai amman koil st ,tamilnadu");
 	    Thread.sleep(3000);
	    //credit card no
	    WebElement credit_card_no = driver.findElement(By.id("cc_num"));
	    credit_card_no.click();
	    credit_card_no.sendKeys("1234567891011121 ");
	    Thread.sleep(3000);
	    WebElement card_type = driver.findElement(By.xpath("//select[@class='select_combobox']"));
	    Select gg = new Select(card_type);
	    gg.selectByVisibleText("Master Card");
	    Thread.sleep(3000);
	    //month
	    WebElement month = driver.findElement(By.xpath("//select[@class='select_combobox2']"));
	    Select hh = new Select(month);
	    hh.selectByVisibleText("December");    //card expiry month
	    Thread.sleep(3000);
	    //year
	    WebElement card_expiry_year = driver.findElement(By.id("cc_exp_year"));
	    Select ii = new Select(card_expiry_year);
	    ii.selectByVisibleText("2022");
	    Thread.sleep(3000);
	    //ccv no
	    WebElement cvv_no = driver.findElement(By.name("cc_cvv"));
	    cvv_no.click();
	    cvv_no.sendKeys("1234");
	    Thread.sleep(3000);
	    //book button
	    WebElement book_button = driver.findElement(By.name("book_now"));
	    book_button.click();
	    Thread.sleep(3000);
	    //logout
	    WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
	    logout.click();
	}

}
