package com.cg.assignment.test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {

	WebDriver driver = null;

	@Given("^Display registration page to enter details$")
	public void display_registration_page_to_enter_details() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("D:\\BDD\\Assignment-RegistrationProject\\src\\com\\cg\\assignment\\RegistrationPage.html");

	}

	@When("^Valid details with correct mailId format is entered$")
	public void valid_details_with_correct_mailId_format_is_entered() throws Throwable {

		WebElement fName = driver.findElement(By.id("fname"));
		fName.sendKeys("Vaishnavi");
		Thread.sleep(1000);

		WebElement lName = driver.findElement(By.id("lname"));
		lName.sendKeys("Sundar");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vaishu@capgemini.com");
		Thread.sleep(1000);
		
		WebElement contactnumber = driver.findElement(By.id("contactnumber"));
		contactnumber.sendKeys("9791136844");
		Thread.sleep(1000);
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Signana");
		Thread.sleep(1000);
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		Thread.sleep(1000);
		
		WebElement state = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]/select"));
		state.sendKeys("Tamil Nadu");
		Thread.sleep(1000);
		
	}

	@Then("^Details are validated$")
	public void details_are_validated() throws Throwable {
		
		WebElement submit = driver.findElements(By.id("submit")).get(0);
		submit.click();
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
		assertEquals("Details Validated", alert.getText());
		alert.accept();
		Thread.sleep(1000);
	}

	@Then("^Project details to be displayed in oredr to compelete registration successfully$")
	public void project_details_to_be_displayed_in_oredr_to_compelete_registration_successfully() throws Throwable {
		
		WebElement register = driver.findElements(By.id("Register")).get(0);
		register.click();
		Thread.sleep(1000);
		
		Alert alert=driver.switchTo().alert();
		assertEquals("Registration Successfull", alert.getText());
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		driver.quit();
	}

}
