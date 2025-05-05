package com.selenium.webdriver_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class1_getCurrentUrl {

 public static void m1() throws Exception {
	 
	 RemoteWebDriver driver = new ChromeDriver();
	 driver.get("https://indianjournals.com");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 
	 
	 // Check url of that website
	 String url = driver.getCurrentUrl();
	 System.out.println("Url of the website ="+url);
	 
	 // check this website is sequre or not
	 if(url.startsWith("https")) {
		 System.out.println("This website Url is sequre");
	 }
	 else {
		 System.out.println("This website Url is not sequre");
	 }
	 
	 
	 driver.close();
	 
 }
 
 public static void m2() throws Exception {
	 
	 RemoteWebDriver driver = new ChromeDriver();
	 driver.get("https://smgi.org.in/");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 
	 String url = driver.getCurrentUrl();
	 System.out.println("Url of current website = "+ url);
	 Thread.sleep(2000);
	 
	 // checking website is sequre or not
	 if(url.startsWith("https")) {
		 System.out.println("This Website is sequre");
	 }
	 else {
		 System.out.println("This Website is not sequre");
	 }
	 
	 driver.close();
	 
 }
 public static void main(String[] args) throws Exception {
	m2();
}
 
}
