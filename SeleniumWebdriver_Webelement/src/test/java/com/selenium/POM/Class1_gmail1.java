package com.selenium.POM;

// POM Model without PageFactory

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.webdriver.Webdriver1;

public class Class1_gmail1 {
	
	WebDriver driver ;
	
	// Constructor
	public Class1_gmail1(WebDriver webDriver) {
		driver = webDriver ;
	}

	
	// locate element
	By username = By.id("identifierId");
	By usernamebutton = By.xpath("(//span[@jsname='V67aGc']/parent::button)[2]");
	By passwordname = By.name("Passwd");
	By pswdbutton = By.xpath("(//span[@jsname='V67aGc']/parent::button)[2]");
	
	
	
	public void username(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	
	public void userclick() {
		driver.findElement(usernamebutton).click();
	}
	
	public void pswd(String password) {
		driver.findElement(passwordname).sendKeys(password);
	}
	
	
	public void pswdclick() {
		driver.findElement(pswdbutton).click();
	}	
	
}




