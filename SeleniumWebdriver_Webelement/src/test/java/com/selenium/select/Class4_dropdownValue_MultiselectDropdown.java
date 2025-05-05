package com.selenium.select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class4_dropdownValue_MultiselectDropdown {
	
	public static void m1() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Neghibour element 
		WebElement nElement = driver.findElement(By.xpath("//div[text()='Select One']"));
				
		// scroll the page 
		driver.executeScript("arguments[0].scrollIntoView();", nElement);
		Thread.sleep(2000);
		
		// locate 'Multiselect drop down' dropdown -- 
		WebElement element = driver.findElement(By.xpath("//div[text()='Select...']"));
		element.click();
		Thread.sleep(2000);
		
		/*
		for(WebElement element2 : element) {
			int size = element.size();
			System.out.println(size);
		}
		*/
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
