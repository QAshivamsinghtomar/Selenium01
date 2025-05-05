package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class6_getText {
	
	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// getText Method on Visible Element - Product 
		WebElement element = driver.findElement(By.linkText("Products"));
		String elementText =  element.getText();
		System.out.println("Element Text = "+elementText);
		
		// getText Method on hidden element - Directory (By using java)
		WebElement element2 = driver.findElement(By.xpath("//a[@title='Directory Details']"));
		String element2Text =  element2.getText();
		System.out.println("Element 2 Text = "+element2Text);
		
		// by using javascript
		
		String textValue = (String) driver.executeScript("return(arguments[0].textContent);", element2);
		System.out.println("Text Content BY javascript = "+textValue);
		driver.close();
		
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		m1();
	}
	

}
