package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class12_getSize {

	public static void m1() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// locating element of username field - Visible element
		WebElement element1 = driver.findElement(By.id("txtuser"));
		//getsize Method 
	    Dimension dimension1 = element1.getSize();
	    int height1 =  dimension1.getHeight();
	    int width1 = dimension1.getWidth();
	    
	    System.out.println("Height of Visible Element = "+height1);
	    System.out.println("Width of Visible Element = "+width1);
	    
	    
	    // Locating password filed xpath - hidden element
	    WebElement element2 = driver.findElement(By.id("txtpass"));
	   // getSize method on hidden element
	    Dimension dimension2 = element2.getSize();
	    int height2 = dimension2.getHeight();
	    int width2 = dimension2.getWidth();
	    
	    System.out.println("Height of Hidden Element = "+height2);
	    System.out.println("Width of Hidden Element = "+width2);
	    
	    
	    driver.close();
	
	}
	
	
	public static void m2() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// getSize on Visible element
		WebElement element1 =  driver.findElement(By.id("identifierId"));
		Dimension dimension1 = element1.getSize();
		int height1 = dimension1.getHeight();
		int width1 = dimension1.getWidth();
		
		System.out.println("Visible element height = "+height1);
		System.out.println("Visible element Width = "+width1);
		
		//getSize on hidden element 
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		Dimension dimension2 = element2.getSize();
		int height2 =  dimension2.getHeight();
		int width2 =  dimension2.getWidth();
		
		System.out.println("Hidden element height = "+height2);
		System.out.println("Hidden element Width = "+width2);
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}

}
