package com.selenium.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

// Print all value available in the dropdow

public class Class2_SingleSelectDropdownValue {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		//maximize the page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locate dropdown
		WebElement element = driver.findElement(By.id("themes"));
		
		// Select Class
		Select select = new Select(element);
		
		// display all itema available in the dropdown
		List<WebElement> item = select.getOptions();
		// here 0 is select, thats why we started from 1
		for(int i = 1; i < item.size() ; i++) {
			WebElement element2 = item.get(i);
			System.out.println("Dropdown Value =" + element2.getText());
		}
		
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Neghibour element 
		WebElement nElement = driver.findElement(By.xpath("//div[text()='Select One']"));
		
		// scroll the page 
		driver.executeScript("arguments[0].scrollIntoView();", nElement);
		Thread.sleep(2000);
		
		// locate 'Old Style Select Menu' drop down
		WebElement element = driver.findElement(By.id("oldSelectMenu"));
		
		// Select Class
		Select select = new Select(element);
		
		// print all value available in the dropdown
		List<WebElement> item =  select.getOptions();
		Thread.sleep(5000);
		
		// for loop
		for(int i = 0 ; i<item.size() ; i++) {
			WebElement element2 = item.get(i);
			System.out.println("Dropdown Value = " + element2.getText());
		}
		
		driver.close();
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
