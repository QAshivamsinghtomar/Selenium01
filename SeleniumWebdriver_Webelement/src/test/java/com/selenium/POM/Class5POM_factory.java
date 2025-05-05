package com.selenium.POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class5POM_factory {
	
	public static void main(String[] args) throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// Object of POM_PageFactory class
		
		Class_4POM_PageFactory factory = new Class_4POM_PageFactory(driver);
		driver.get("https://www.indianjournals.com/");
		Thread.sleep(2000);
		
		factory.login();
		Thread.sleep(2000);
		
		factory.email("shsingh@indianjournals.com");
		Thread.sleep(2000);
		
		factory.nextclick1();
		Thread.sleep(2000);
		
		factory.password("1234");
		Thread.sleep(2000);
		
		factory.logindone();
		Thread.sleep(2000);
		
	}

}
