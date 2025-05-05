package com.selenium.webdriver_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class12_Cookie3 {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Create own cookie and add 
		Cookie cookie = new Cookie("Test", "Testing_Cookie01");
		driver.manage().addCookie(cookie);
		
		
		// Collect all cookie
		Set<Cookie> set = driver.manage().getCookies();
		List<Cookie> list = new ArrayList<Cookie>(set);
		System.out.println("All Cookie Count = "+list.size());
		
		// name & Value of all cookie
		for(Cookie cookie2 : list) {
			System.out.println("Cookie Name ="+cookie2.getName()+"... Cookie Value = "+cookie2.getValue());
		}
		
		// get the specific cookie by using getCookieNamed() method
		Cookie cookie3 = driver.manage().getCookieNamed("Test");
		System.out.println("Specific Cookie ="+cookie3.getName()+ "... Specific Cookie Value ="+cookie3.getValue());
		
		// delete specific cookie by using deleteCookie() method
		driver.manage().deleteCookie(list.get(0));
		
		// delete specific cookie by using deleteCookieNamed() method
	    driver.manage().deleteCookieNamed("_ga");
		//driver.manage().deleteCookieNamed(list.get(2).getName());
	    
	    // Delete all cookie
	    driver.manage().deleteAllCookies();
	    
	    // Now collect all cookie
	    Set<Cookie> set2 = driver.manage().getCookies();
	    List<Cookie> list2 = new ArrayList<Cookie>(set);
	    System.out.println("All cookie count = "+list2.size());
	    
	    // name of these cookie
	    for(Cookie cookie4 : list2) {
	    	System.out.println("Cookie name ="+cookie4.getName()+".. Cookie Value ="+cookie4.getValue());
	    }
	    
	    Thread.sleep(2000);
	    driver.close();
		
	}
	

	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
