package com.selenium.websriver;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

/*
 
  To write any code in selenium, first we need to add this dependencies in prom file 
  then only we can write the code.

<dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.11.0</version>     
    </dependency>
    
*/


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class1_login {
	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver(); // Opening the chrome browser
		driver.manage().window().maximize(); // maximize the page
		driver.get("https://erp1.glomis.in/"); // Opening the URL
		Thread.sleep(2000);
		driver.findElement(By.id("txtuser")).sendKeys("shsingh"); //finding username field and sending data
		Thread.sleep(2000); // wating for 2 sec.
		driver.findElement(By.name("Button1")).click(); // clicking on next button
		Thread.sleep(2000); // waiting doe 2 sec.
		driver.findElement(By.id("txtpass")).sendKeys("Shivam@123"); //finding password field and sending data
		Thread.sleep(2000); // waitng for 2 sec.
		driver.findElement(By.id("Button1")).click(); // clicking on next button
		Thread.sleep(2000); // waitnig for 2 sec.
		
		driver.findElement(By.xpath("//img[@title='Expand Report']")).click(); // Expending Report 
		Thread.sleep(5000); // waitnig for 5 sec.
		driver.findElement(By.linkText("Institution Report")).click(); // opening 
		Thread.sleep(5000); // waitnig for 5 sec.
		
		
		
		WebElement element1 =  driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtClient"));
		element1.sendKeys("Banaras Hindu University", Keys.ARROW_DOWN);
		element1.click();
		Thread.sleep(5000);
		
		WebElement element12 = driver.findElement(By.id("ContentPlaceHolder1_txtbegindateCR5"));
		element12.sendKeys("01-2024", Keys.ARROW_DOWN, Keys.ENTER);
		element12.click();
		Thread.sleep(5000);
		
		WebElement element13 = driver.findElement(By.id("ContentPlaceHolder1_txtenddateCR5"));
		element13.sendKeys("01-2024", Keys.ARROW_DOWN, Keys.ENTER);
		element13.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Shivam Singh")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);

		// Get Attribute value 
		
		WebElement element = driver.findElement(By.name("txtuser"));
		String name =  element.getAttribute("Name");
		System.out.println("Name Value = "+name);
		
		String type = element.getAttribute("type");
		System.out.println("Type = "+type);
		
		String id = element.getAttribute("id");
		System.out.println("Id = "+id);
		
		String className = element.getAttribute("class");
		System.out.println("Class Name = "+className);
		
		String placeholder =  element.getAttribute("placeholder");
		System.out.println("Placeholder Name = "+placeholder);
		
		driver.close();
	}

	
	public static void main(String[] args) throws Exception {
		m1();
	}

}
