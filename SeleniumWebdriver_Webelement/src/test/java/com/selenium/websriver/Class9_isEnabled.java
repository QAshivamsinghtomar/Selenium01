package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class9_isEnabled {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element1 =  driver.findElement(By.id("txtuser"));
		if(element1.isEnabled()) {
			System.out.println("User name filed is enabled ");
		}
		else {
			System.out.println("User name filed is disabled ");
		}
		
		
		WebElement element2 =  driver.findElement(By.id("txtpass"));
		if(element2.isEnabled()) {
			System.out.println("Password field is enabled");
		}
		else {
			System.out.println("Password field is disabled");
		}
		
		driver.close();
	}
	
	
	public static void m2() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// user name filed - visible element
		WebElement element1 = driver.findElement(By.name("identifier"));
		if(element1.isDisplayed()) {
			System.out.println("User name field is displayed");
			if(element1.isEnabled()) {
				System.out.println("User name field is Enabled");
			}
			else {
				System.out.println("User name field is disabled");
			}
		}
		else {
			System.out.println("User name field is not displayed");
		}
		
		// password filed - hidden element
		WebElement element2 =  driver.findElement(By.name("hiddenPassword"));
		if(element2.isDisplayed()) {
			System.out.println("Password field is displayed in username field");
			if(element2.isEnabled()) {
				System.out.println("Password field is enable is username field");
			}
			else {
				System.out.println("Password field is not enable is username field");
			}
		}
		else {
			System.out.println("Password field is not displayed in username field");
		}
		
		driver.close();

	}
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}
	
}
