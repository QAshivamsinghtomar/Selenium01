package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class19_dropdownCount {

	// drop down can be devloped by using div tag and select tag, div tag can be used for another 
	// one element also, but select tag always used for creating dropdown only.
	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Count of all dropdown by using <select> tag
		List<WebElement> list = driver.findElements(By.xpath("//select"));
		int count = list.size();
		System.out.println("Count of all dropdown = "+count);
		
		// Checking how many dropdown is visible and how many are hidden
		int visibleDropdown = 0;
		int hiddenDropdown = 0 ;
		
		for(WebElement element : list) {
			if(element.isDisplayed()) {
				visibleDropdown ++ ;
			}
			else {
				hiddenDropdown ++ ;
			}
			
		}
		System.out.println("Visible Dropdown = "+visibleDropdown);
		System.out.println("Hidden Dropdown ="+hiddenDropdown);
		
		driver.close();		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.globepub.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// count of all dropdown
		List<WebElement> list = driver.findElements(By.xpath("//select"));
		int count = list.size();
		System.out.println("Count of all dropdown = "+count);
		
		// checking visible and hidden dropdown count
		int visibleDropdown = 0 ;
		int hiddenDropdown = 0 ;
		
		for(WebElement element : list ) {
			if(element.isDisplayed()) {
				visibleDropdown ++ ;
			}
			else {
				hiddenDropdown ++ ;
			}
		}
		System.out.println("Visible Dropdown Count = "+visibleDropdown);
		System.out.println("Hidden Dropdown Count = "+hiddenDropdown);
		
		driver.close();
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
