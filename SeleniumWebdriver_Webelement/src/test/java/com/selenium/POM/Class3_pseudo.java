package com.selenium.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// Without POM Model Pseudo element Automation 


public class Class3_pseudo {

	public static void pseudoelement() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rangeslider.js.org/");
		Thread.sleep(5000);
		
		// Autopating Pseudo element by using javascript
	
		// 1. Locating neighbor element
	   String  nelement = driver.findElement(By.className("rangeslider__fill")).getCssValue("color");
	   
	   
	   //write Pseudo element code in javascript for color css
	   String colorpreudo = 
	   (String) driver.executeScript(
			   "var nelement = document.querySelector('div.rangeslider__handle');"
			   +"var pseudoelement = window.getComputedStyle(nelement,'::after');"
			   +"var value = pseudoelement.getPropertyValue('color');"
			   +"return(value);"
			   );
	   
		System.out.println("Color CSS = "+colorpreudo);
		
		
		// write pseudo element code for  background
		String backgroundcss = 
		(String) driver.executeScript(
				"var nelement1 = document.querySelector('div.rangeslider__handle');"
				+"var pseudoelement1 = window.getComputedStyle(nelement1, '::after');"
				+"var value2 = pseudoelement1.getPropertyValue('background');"
				+"return(value2)"
				);
		
		System.out.println("Backgroud CSS = "+backgroundcss);
		
		
		// write pseudo element code for border css
		String borderCSS = 
		(String) driver.executeScript(
				 "var nelement2 = document.querySelector('div.rangeslider__handle');"
				+"var preduelement2 = window.getComputedStyle(nelement2,'::after');"
				+"var borderCSS = preduelement2.getPropertyValue('border');"
				+"return(borderCSS)"
				);
		
		System.out.println("Border CSS = "+borderCSS);
		
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		pseudoelement();
	}


	
	
	
}
