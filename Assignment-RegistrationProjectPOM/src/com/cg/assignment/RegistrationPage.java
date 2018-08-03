package com.cg.assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	
	@FindBy(how = How.ID, using = "fname")
	WebElement first;
	
	@FindBy(how = How.ID, using = "lname")
	WebElement last;
	
	@FindBy(how = How.ID, using = "email")
	WebElement mail;
	
	@FindBy(id="contactnumber")
	WebElement num;

	@FindBy(id="address")
	WebElement add;
	
	@FindBy(id="city")
	WebElement city;

	@FindBy(xpath="/html/body/table/tbody/tr[7]/td[2]/select")
	WebElement state;

	@FindBy(id="submit")
	WebElement sub;
	
	@FindBy(id="Register")
	WebElement reg;
	
}
