package com.selenium.websriver;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class11_getLocation {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com/");
		Thread.sleep(2000);
		
		// User name field -- Visible Element
		WebElement element = driver.findElement(By.id("identifierId"));		
		Point point = element.getLocation();
		int x_axis =  point.getX();
		int y_axis = point.getY();
		
		System.out.println("X Axis Value = "+x_axis);
		System.out.println("Y Axis Value = "+y_axis);
		
		
		// Passwod field - Hidden element
		WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		Point point2 = element2.getLocation();
		int x_axis2 = point2.getX();
		int y_axis2 = point2.getY();
		
		System.out.println("X Axis Value = "+x_axis2);
		System.out.println("Y Axis Value = "+y_axis2);

		driver.close();
		
}
	
	
	public static void m2() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Locating element of username --- Visible element
		WebElement element1 = driver.findElement(By.id("txtuser"));
		// getLocation method of visible element
		Point point1 = element1.getLocation();
		int x_axis1 = point1.getX();
		int y_axis1 = point1.getY();
		
		System.out.println("X_axis Value of Username ="+x_axis1);
		System.out.println("Y_axis Value of Username ="+y_axis1);
		
		
		//Locating element of password filed -- hidden element
		WebElement element2 = driver.findElement(By.id("txtpass"));
		Point point2 =  element2.getLocation();
		int x_axis2 = point2.getX();
		int y_axis2 = point2.getY();
		
		System.out.println("X_axis Value of Password ="+x_axis2);
		System.out.println("Y_axis Value of Password ="+y_axis2);
		
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}
	
}
