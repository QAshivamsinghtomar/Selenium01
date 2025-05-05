package com.selenium.websriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class13_getRect {

	public static void m1() throws InterruptedException {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//locating user name field of mail and checking details --- Visible Element
		WebElement element1 = driver.findElement(By.id("identifierId"));
		Rectangle rectangle = element1.getRect();
		
		//Checking location -- By getX and getY
		int x_axis1 = rectangle.getX();
		int y_axis1 = rectangle.getY();
		System.out.println("Visible Element Location Details first way="+x_axis1+"...."+y_axis1);
		
		// Checking size by getHeight and getWidth
		int height1 = rectangle.getHeight();
		int width1 = rectangle.getWidth();
		System.out.println("Visible Element Size Details first way ="+height1+"...."+width1);
		
		// Size Details by getDimension() method in Rectangle class
		Dimension dimension = rectangle.getDimension();
		int height2 = dimension.getHeight();
		int width2 =  dimension.getWidth();
		System.out.println("Size Details by Dimension class="+height2+"...."+width2);
		
		
		// Location Details by getPoint() method in Rectangle class
		Point point = rectangle.getPoint();
		int x_axis2 = point.getX();
		int Y_axis2 = point.getY();
		System.out.println("Location Details by Point class="+x_axis2+"...."+Y_axis2);
		
		driver.close();
		
	}	
	
	
	public static void main(String[] args) throws InterruptedException {
		m1();
	}
}
