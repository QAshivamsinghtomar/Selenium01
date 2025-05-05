package com.selenium.webdriver_2;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class10_Cookies1 {

	public static void m1() throws Exception {
		 
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// maximize the page
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Collect all cookies 
		Set<Cookie> set = driver.manage().getCookies();
		int cookieCount =  set.size();
		System.out.println("Count of all Cookies = "+cookieCount);
		
		// iterating each cookie one by one by using for each loop
		for(Cookie cookie : set) {
			if(cookie.isHttpOnly()) {
				 System.out.println(cookie.getName() + " .. is Http cookie only...");
			}
			else if(cookie.isSecure()) {
				 if(cookie.getName().equalsIgnoreCase("session-id") || cookie.getName().contains("SESSID")) {
					 System.out.println(cookie.getName()+ " is Session cookie only..");
				 }
				 else if(cookie.getName().equalsIgnoreCase("session-id-time")) {
					 System.out.println(cookie.getName()+ " is a persistent cookie only..");
				 }
				 else {
					 System.out.println(cookie.getName()+" is secure cookie only...");
				 }
			}
			else if(cookie.getName().equalsIgnoreCase("session-id") || cookie.getName().contains("SESSID")) {
				System.out.println(cookie.getName()+" is session cookie only...");
			}
			else if(cookie.getName().equalsIgnoreCase("session-id-time")) {
				System.out.println(cookie.getName()+ " is presistent cookie only..");
			}
			else if(cookie.getDomain().equalsIgnoreCase("https://www.amazon.com/")){
				System.out.println(cookie.getName()+ " is super domian cookie...");
			}
			else if(cookie.getName().equalsIgnoreCase("https://www.amazon.in/")) {
				System.out.println(cookie.getName()+" is same site domain cookie only...");
			}
			else {
				System.out.println(cookie.getName() + " is third party cookie...");
			}
			
			Thread.sleep(2000);
			driver.close();
			
		}	
	}
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Collect all cookie
		Set<Cookie> set = driver.manage().getCookies();
		System.out.println("Count of all Cookie = "+set.size() );
		
		// iterating all cookie one by one
		for(Cookie cookie : set) {
			if(cookie.isHttpOnly()) {
				System.out.println(cookie.getName() + ".. is Http Cookie");
			}
			else if(cookie.isSecure()) {
				if(cookie.getName().equalsIgnoreCase("session-id") || cookie.getName().equalsIgnoreCase("SESSID")) {
					System.out.println(cookie.getName() + ".. is Session cookie ");
				}
				else if(cookie.getName().equalsIgnoreCase("session-id-time")) {
					System.out.println(cookie.getName() + ".. is Persistent Cookie ");
				}
				else {
					System.out.println(cookie.getName() + ".. is Secure Cookie ");
				}
				
			}
			else if(cookie.getName().equalsIgnoreCase("session-id") || cookie.getName().equalsIgnoreCase("SESSID")) {
				System.out.println(cookie.getName() + ".. is Session Cookie");
			}
			else if(cookie.getName().equalsIgnoreCase("session-id-time")) {
				System.out.println(cookie.getName() + ".. is Persistent Cookie ");
			}
			else if(cookie.getDomain().equalsIgnoreCase("https://www.google.co.in/")) {
				System.out.println(cookie.getName() + ".. is site cookie ");
			}
			else if (cookie.getName().equalsIgnoreCase("https://www.google.com/")) {
				System.out.println(cookie.getName() + ".. is supper domian cookie ");
			}
			else {
				System.out.println(cookie.getName() + ".. is third party cookie ");
			}
			
			
		}
		
	}
	

	public static void main(String[] args) throws Exception {
		m2();
	}
	
	

}
