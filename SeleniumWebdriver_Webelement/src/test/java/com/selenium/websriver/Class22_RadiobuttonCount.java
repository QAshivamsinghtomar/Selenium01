package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class22_RadiobuttonCount {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// counting of all radiob button 
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		int count = list.size();
		System.out.println("Count of all Radio button ="+count);
		Thread.sleep(2000);
		
		//checking how many radio button are visible and hidden
		
		int visibleRadioButton = 0 ;
		int hiddenRadioButton = 0 ;
		
		for(WebElement element : list) {
			if(element.isDisplayed()) {
				visibleRadioButton ++ ;
			}
			else {
				hiddenRadioButton ++ ;
			}
		}
		System.out.println("Visible Radion button = "+visibleRadioButton);
		System.out.println("Hidden Radion button = "+hiddenRadioButton);
		
		
		driver.close();
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Counting all radio button
		List<WebElement> list = driver.findElements(By.xpath("//input[@type = 'radio']"));
		int count = list.size();
		System.out.println("Count of All Radio button = "+count);
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) {
		try{
			m2();
		}
		catch(Exception exception) {
			System.out.println("Exception is coming");
		}
	}
}
