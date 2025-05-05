package com.selenium.webdriver_2;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class11_Cookie2 {

	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// create my own cookie -- By Cookie class
		Cookie cookie = new Cookie("MyCookie1", "TestingCookie1");
	
	  // add created cookie
	  driver.manage().addCookie(cookie);
	 
	 // collect all cookie
	 Set<Cookie> set = driver.manage().getCookies();
	 System.out.println("Count of all cookie ="+set.size());
	 
	 // name of all cookie and cookie value
	 for(Cookie cookie2 : set) {
		System.out.println(".. Name of Cookie = "+cookie2.getName()+".. Value of Cookie = "+ cookie2.getValue()); 
	 }
	 
	 driver.close();
	
	}
	
	public static void m2() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// create own cookie
		Cookie cookie = new Cookie("test1", "Testing_Cookie_1");
		// add this cookie
		driver.manage().addCookie(cookie);
		
		// Collect all cookie and cookie count
		Set<Cookie> set = driver.manage().getCookies();
		System.out.println("Count of all cookie = "+set.size());
		
		
		// name of all cookie
		for(Cookie cookie2 : set) {
			System.out.println(".. Cookie Name = "+cookie2.getName() + ".. Cookie Value ="+cookie2.getValue());
		}
		
		driver.close();
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		m2();
	}
	
}
