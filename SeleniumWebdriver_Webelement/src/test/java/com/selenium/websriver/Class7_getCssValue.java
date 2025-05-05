package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

// // Checking details of gmail  on google page before and after clicking.

public class Class7_getCssValue {
	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement element =  driver.findElement(By.linkText("Gmail"));
		
		// Before click on element details 
		
		String display1 =  element.getCssValue("display");
		String color1 =  element.getCssValue("color");
		String text_decoration1 =  element.getCssValue("text-decoration");
		String vertical_align1 = element.getCssValue("vertical-align");
		
		System.out.println("Before click on Gmail Value = "+display1);
		System.out.println("Before click on Gmail Value = "+color1);
		System.out.println("Before click on Gmail Value = "+text_decoration1);
		System.out.println("Before click on Gmail Value = "+vertical_align1);
		
		// Clicking on the Element
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		
		System.out.println();
		System.out.println();
		
		
		// Details after click on the element
		String display2 =  element.getCssValue("display");
		String color2 =  element.getCssValue("color");
		String text_decoration2 =  element.getCssValue("text-decoration");
		String vertical_align2 = element.getCssValue("vertical-align");
		
		System.out.println("After click on Gmail Value = "+display2);
		System.out.println("After click on Gmail Value = "+color2);
		System.out.println("After click on Gmail Value = "+text_decoration2);
		System.out.println("After click on Gmail Value = "+vertical_align2);
		
		System.out.println();
		System.out.println();
		
		if(text_decoration1 == text_decoration2) {
			System.out.println("text_decoration is same before and after click on element");
		}
		else {
			System.out.println("text_decoration are different before and after click on element");
		}
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
