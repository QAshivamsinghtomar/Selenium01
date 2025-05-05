package com.selenium.websriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

//getAttribute Method - It will show the element attribute value

public class Class3_getAttribute  {

	public static void m1() throws Exception {
		
		// ERP1 username getAttribute value without login
		// getAttribute return type is String
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.name("txtuser"));
		Thread.sleep(2000);
		
		String name = element.getAttribute("name");
		System.out.println("Name = "+name);
		
		String type = element.getAttribute("type");
		System.out.println("Type = "+type);
		
		String value = element.getAttribute("value");
		System.out.println("Value = "+value);
		
		String className = element.getAttribute("class");
		System.out.println("Class Name = "+className);
		
		String placeholder = element.getAttribute("placeholder");
		System.out.println("placeholder = "+placeholder);

		
		driver.close();
	}
	
	
	public static void m2() throws Exception {
		// IRCTC Website Automation Script
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		// How to select Ladies in irctc
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@aria-label='LADIES']")).click();
		Thread.sleep(2000);
		
		// How to select 2 AC 
		driver.findElement(By.xpath("//span[@class = 'ng-tns-c65-11 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='AC 2 Tier (2A)']")).click();
		Thread.sleep(2000);
	
		// Sending ghaziabad in from text box
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("GHAZIABAD", Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		// sending kanpur in to text box
		driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[2]")).sendKeys("KANPUR",Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2000);
		
		/*
		// sending date
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
		Thread.sleep(2000);
		*/
		
		driver.findElement(By.xpath("((//div[@class='col-xs-12 remove-padding'])[3]/div/button)[1]")).click();
		Thread.sleep(5000);
		

		
		

		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
