package com.selenium.websriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class17_element_count {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Count of all element in the website
		// every element start with //*, so we will use below xpath to count all element
		
		List<WebElement> elements = driver.findElements(By.xpath("//*"));
		int elementSize = elements.size();
		System.out.println("Element Count = "+elementSize);
		
		//How to get the name of all element
		
		for(WebElement element2 : elements) {
			System.out.println(element2.getText());
		}

		driver.close();
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.globepub.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Count of total element in the website
		List<WebElement> list = driver.findElements(By.xpath("//*"));
		int elementCount = list.size();
		System.out.println("Count of Total Element = "+ elementCount);
		
		// name of all Element by using for each loop
		for(WebElement element : list) {
			System.out.println("Name of element ="+element );
		}
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
