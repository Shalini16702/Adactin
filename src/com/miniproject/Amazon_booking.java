package com.miniproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_booking {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WELCOME\\eclipse-workspace\\See\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//dropdown
		WebElement all_dropdown = driver.findElement(By.name("url"));
		Select aa = new Select(all_dropdown);
		aa.selectByVisibleText("Books");
		WebElement search_box = driver.findElement(By.id("twotabsearchtextbox"));
		search_box.click();
		Thread.sleep(3000);
		search_box.sendKeys("Harry potter books");
		WebElement button = driver.findElement(By.id("nav-search-submit-button"));
		button.click();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/Harry-Potter-Chamber-Secrets/dp/1408855666/ref=sr_1_2?crid=3ITHPLA74DYCB&keywords=harry+potter+books&qid=1672981946&s=books&sprefix=harr%2Cstripbooks%2C473&sr=1-2");
//		WebElement books = driver.findElement(By.xpath("//span[text()='Harry Potter and the Chamber of Secrets (Harry Potter 2)']"));
//		books.click();
		Thread.sleep(3000);
		WebElement add_to_cart = driver.findElement(By.xpath("//div[@id='addToCart_feature_div'][2]"));
		add_to_cart.click();
//		WebElement add_cart = driver.findElement(By.id("add-to-cart-button"));
//		add_cart.click();
		Thread.sleep(3000);
		//screenshot
		 TakesScreenshot a = (TakesScreenshot)driver;
		 File source = a.getScreenshotAs(OutputType.FILE);
		 File destination = new File("C:\\Users\\WELCOME\\eclipse-workspace\\See\\Screenshot//Screenshot.png");
		 FileUtils.copyFile(source, destination);
		
		 WebElement proceed_to_buy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceed_to_buy.click();
		Thread.sleep(3000);
		//sign in
		WebElement email_id = driver.findElement(By.name("email"));
		email_id.click();
		email_id.sendKeys("+917904376557");
		Thread.sleep(3000);
		WebElement continue_button = driver.findElement(By.id("continue"));
		 continue_button.click();
		 Thread.sleep(3000);
		 WebElement password = driver.findElement(By.name("password"));
		 password.click();
		 password.sendKeys("16*72**2");
		 Thread.sleep(3000);
		 WebElement sign_in = driver.findElement(By.id("signInSubmit"));
		 sign_in.click();
		 Thread.sleep(3000);
		 //address
		 WebElement use_this_address = driver.findElement(By.id("orderSummaryPrimaryActionBtn"));
		 use_this_address.click();
		 Thread.sleep(3000);
		 //payment mode
		 WebElement cash_on_delivery = driver.findElement(By.xpath("//input[@type='radio'][5]"));
		 cash_on_delivery.click();
		 Thread.sleep(3000);
		 WebElement use_this_payment_method = driver.findElement(By.className("a-button-input a-button-text"));
		 use_this_payment_method.click();
		 Thread.sleep(3000);
		 TakesScreenshot b = (TakesScreenshot)driver;
		 File sour = b.getScreenshotAs(OutputType.FILE);
		 File desti = new File("C:\\Users\\WELCOME\\eclipse-workspace\\See\\Screenshot//Screenshot.png");
		 FileUtils.copyFile(source, destination);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}
}
