package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class10_isSelected {
	
	
	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(((//div[@class='col-xs-12 remove-padding'])[1]/div[1]/span)[2]/label)[1]"));
		 
		//checkinng isSelected or not - first check isDisplayed then isEnabled and then isSelected 
		
		if(element.isDisplayed()) {
			System.out.println("Element is Displayed");
			
			if(element.isEnabled()) {
				System.out.println("Element is Enable ");
				
				if(element.isSelected()) {
					System.out.println("Element is selected");
				}
				else {
					System.out.println("Element is not selected");
				}
			}
			else {
				System.out.println("Element is not enable");
			}
		}
		else {
			System.out.println("Element is not displayed");
		}
		
		driver.close();		
	}
	
	
	
	public static void m2() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@name='color'])[1]"));
		element.click();
		Thread.sleep(2000);
		//checking isDisplayed, isEnabled and isSelected() method
		if(element.isDisplayed()) {
			System.out.println("Text box is displayed in page");
			//isEnabled method checking
			if(element.isEnabled()) {
				System.out.println("Text box is Enabled in page");
				// isSelected method checking
				if(element.isSelected()) {
					System.out.println("Text box is selected ");
				}
				else {
					System.out.println("Text box is not selected");
				}
			}
			else {
				System.out.println("Text box is not Enabled in page");
			}
		}
		else {
			System.out.println("Text box is not displayed in page");
		}
		
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}

}
