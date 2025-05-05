package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

//isDisplayed method programe

public class Class8_isDisplayed {

	public static void m1() throws Exception {
		// isDisplayed on gmail of google page
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Checking Username field -visible element
		WebElement element = driver.findElement(By.id("txtuser"));
		
		/* First way to write
		Boolean boolean1 = element.isDisplayed();
		System.out.println(boolean1);
		*/
		
		if(element.isDisplayed()) {
			System.out.println("User name field is visible in username page");
		}
		else {
			System.out.println("User name field is not visible in username page ");
		}
		
		// Checking password filed - hidden element
		WebElement element2 = driver.findElement(By.id("txtpass"));
		if(element2.isDisplayed()) {
			System.out.println("Password field is visible in username page");
		}
		else {
			System.out.println("Password field is not visible in username page");
		}
		
		driver.close();
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login/Register")).click();
		Thread.sleep(2000);
		//isDisplayed on visible element
		WebElement element1 = driver.findElement(By.id("homemenuitems_TBuserNameOnHP"));
		if(element1.isDisplayed()) {
			System.out.println("Email field is visible");
		}
		else {
			System.out.println("Email field is not visible");
		}
		
		//isDisplayed on hidden element
		WebElement element2 =  driver.findElement(By.xpath("//input[@name='homemenuitems$TBpasswordOnHP']"));
		if(element2.isDisplayed()) {
			System.out.println("Password field is visible in Email page");
		}
		else {
			System.out.println("Password field is not visible in Email page");
		}
		
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
