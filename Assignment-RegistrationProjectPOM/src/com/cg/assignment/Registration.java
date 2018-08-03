package com.cg.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("D:\\BDD\\Assignment-RegistrationProject\\src\\com\\cg\\assignment\\RegistrationPage.html");

	RegistrationPage page = PageFactory.initElements(driver, RegistrationPage.class);
	
	page.first.sendKeys("Vaishnavi");
	Thread.sleep(1000);
	
	page.last.sendKeys("Sundar");
	Thread.sleep(1000);
	
	page.mail.sendKeys("vaishu@capgemini.com");
	Thread.sleep(1000);
	
	page.num.sendKeys("9791136844");
	Thread.sleep(1000);
	
	page.add.sendKeys("Signana");
	Thread.sleep(1000);
	
	page.city.sendKeys("Chennai");
	Thread.sleep(1000);
	
	page.state.sendKeys("Tamil Nadu");
	Thread.sleep(1000);
	
	page.sub.click();
	
	Alert alert=driver.switchTo().alert();
	alert.accept();
	Thread.sleep(1000);
	
	page.reg.click();
	Thread.sleep(1000);
	
	Alert alert1=driver.switchTo().alert();
	alert1.accept();
	Thread.sleep(1000);
	driver.quit();
	}
}