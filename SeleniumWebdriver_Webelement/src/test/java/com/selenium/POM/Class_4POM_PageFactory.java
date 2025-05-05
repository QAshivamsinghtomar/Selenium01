package com.selenium.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// By using Page factory POM model - @FindBy Annotation

public class Class_4POM_PageFactory {
	
	WebDriver driver ;
	
	// Constructor
	public Class_4POM_PageFactory(WebDriver d) {
		
		driver = d ;
		PageFactory.initElements(driver, this); // this is mandatory in PageFactory
	}
	
	
	// locating element and identify by using @FindBy annotation 
	
	@FindBy(linkText = "Login/Register")
	WebElement loginclick ;
	
	// username webelement
	@FindBy(id = "homemenuitems_TBuserNameOnHP")
	WebElement username ;
	
	
	// userpage click
	@FindBy(xpath   = "(//input[@type='submit'])[1]")
	WebElement emalinext ;
	
	//pswd locate
	@FindBy(name = "homemenuitems$TBpasswordOnHP")
	WebElement pswd ;
	
	//login click
	@FindBy(name = "homemenuitems$btnLogin")
	WebElement loginbutton ;
	
	
	
	public void login() {
		loginclick.click();
	}
	
	
	public void email (String email) {
		username.sendKeys(email);
	}
	
	
	public void nextclick1() {
		emalinext.click();
	}
	
	
	public void password(String psswd) {
		pswd.sendKeys(psswd);
	}
	
	
	public void logindone() {
		loginbutton.click();
	}
	
}
	
	