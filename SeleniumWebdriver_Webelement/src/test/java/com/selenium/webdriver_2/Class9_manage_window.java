package com.selenium.webdriver_2;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class9_manage_window {

	public static void m1() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		// maximize the page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// minimize the page
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		// again maximize the page
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// get the size of the window - height and width
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();
		
		System.out.println("Window Height = "+height);
		System.out.println("Window Width = "+width);
		
		Thread.sleep(3000);
		
		
		// set size of the window -  Dimension class 
		Dimension dimension = new Dimension(600, 500);
		Thread.sleep(3000);
		driver.manage().window().setSize(dimension);
		Thread.sleep(3000);
		
		
		//get position of the window - Point class
		int x_axis = driver.manage().window().getPosition().getX();
		int y_axis = driver.manage().window().getPosition().getY();
		
		System.out.println("X-axis Window Position  = "+x_axis);
		System.out.println("Y_axis Window Position  = "+y_axis);
		
		Thread.sleep(3000);
		
		
		// set the position of the window - Point class
		Point point = new Point(650, 550);
		Thread.sleep(3000);
		driver.manage().window().setPosition(point);
		Thread.sleep(3000);
		
		// Full screen window
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
