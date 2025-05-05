package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class30_getDomProperty_getDomAttribute {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='submit'])[4]"));
		
		String nameValue =  element.getAttribute("name");
		String onclick = element.getAttribute("onclick");
		
		System.out.println(nameValue);
		System.out.println(onclick);
		
		// get the value of an attribute of element given by developer in the page source only 
		String nameValue1 =  element.getDomAttribute("name");
		
		// get the value of property of element added by browser only
		String onclick1 = element.getDomProperty("onclick");

		System.out.println(nameValue1);
		System.out.println(onclick1);
		
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		//Launch Site
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.name("q"));
		
		System.out.println( element.getAttribute("maxlength") ); // HTML Property
		System.out.println(element.getAttribute("data-ved")); // HTML Property
		
		// get the value of an attribute of element given by developer in the page source only
		System.out.println(element.getDomAttribute("maxlength")); 

		// get the value of property of element added by browser only
		System.out.println(element.getDomProperty("data-ved"));
		
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
