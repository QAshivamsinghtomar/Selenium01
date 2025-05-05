package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class16_getTagName {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_submit");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Moving into ifram
		driver.switchTo().frame("iframeResult");
		// firstname tagname code
		WebElement element1 = driver.findElement(By.id("fname"));
		String tagName1 = element1.getTagName();
		System.out.println("First Name Tagname ="+tagName1);
		
		// lastname tagname code
		WebElement element2 = driver.findElement(By.id("lname"));
		String tagName2 = element2.getTagName();
		System.out.println("Last Name Tagname = "+tagName2);

		driver.close();
		
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// username tagname and send keys
		WebElement element1 = driver.findElement(By.id("txtuser"));
		String tagName1 = element1.getTagName();
		System.out.println("User Name Tagname ="+tagName1);
		element1.sendKeys("shsingh", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		
		// Shivam@123
		
		WebElement element2 = driver.findElement(By.id("txtpass"));
		String tagName2 = element2.getTagName();
		System.out.println("Pasword Tag Name ="+tagName2);
		element2.sendKeys("Shivam@123", Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		
		driver.close();
	
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
