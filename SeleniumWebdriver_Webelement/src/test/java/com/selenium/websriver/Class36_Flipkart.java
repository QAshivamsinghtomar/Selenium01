package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class36_Flipkart {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//click on Appliances
		driver.findElement(By.xpath("//span[text()='Appliances']")).click();
		Thread.sleep(5000);
		
		// locate washing machine
		WebElement nebhiourElement = driver.findElement(By.xpath("(//span[text()='VIEW ALL'])[3]"));
		Thread.sleep(5000);
		
		// scroll the page 
		driver.executeScript("arguments[0].scrollIntoView();", nebhiourElement);
		Thread.sleep(5000);
		
		// click on Double-door Refrigerators
		
		WebElement element = driver.findElement(By.xpath("(//span[text()='VIEW ALL'])[4]"));
		element.click();
		Thread.sleep(2000);
		
		// count of all item in Double-door Refrigerators
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		System.out.println("Count of all list item = "+ list.size());
		
		// iterating one by one
		for(WebElement element2 : list) {
			
			System.out.println("Name of Element  = "+ element2.getText());
		}
		
		
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for(WebElement element3 : list2) {
			
			System.out.println("Price of the element = "+ element3.getText());
		}
		
		
		driver.close();
	
	}
	

	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
