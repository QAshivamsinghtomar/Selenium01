package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class18_tagnameCount {

	// Count of all element/tagname in the webiste which is start with a 
	
	public static void m1() throws Exception {
		
		// we have a 2 way to check 
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// first way to count all tagname start with a
		List<WebElement> list =  driver.findElements(By.xpath("//a"));
		int count = list.size();
		System.out.println("Count of a Tag Name 1st way= "+count);
		
		
		// second way
		List<WebElement> list1 = driver.findElements(By.tagName("a"));
		int count1 = list1.size();
		System.out.println("Count of a tag name 2nd way = "+count1);
		
		
		// name of thats tag name by using for each loop
		for(WebElement element : list) {
			System.out.println("Name of a tagname = "+element);
		}
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}


