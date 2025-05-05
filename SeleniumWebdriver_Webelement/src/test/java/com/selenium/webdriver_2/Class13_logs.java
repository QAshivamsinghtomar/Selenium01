package com.selenium.webdriver_2;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class13_logs {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// check log type
		Set<String> logs = driver.manage().logs().getAvailableLogTypes();
		System.out.println("Available type of logs = "+ logs);
		
		
		// get client logs
		System.out.println("client software logs");
		LogEntries logs1 = driver.manage().logs().get("client");
		for(LogEntry entries : logs1) {
			System.out.println(entries.getMessage());
		}
		
		System.out.println();
		
		// get broswer logs
		System.out.println("browser logs");
		LogEntries logEntries = driver.manage().logs().get("browser");
		for(LogEntry entry : logEntries) {
			System.out.println(entry.getMessage());
		}
		
		System.out.println();
		
		// get driver logs
		System.out.println("Driver software logs");
		LogEntries entries2 = driver.manage().logs().get("driver");
		for(LogEntry entry4 : entries2) {
			System.out.println(entry4.getMessage());
		}
		
		driver.close();
		
	}
	
	public static void m2() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// check available log type
		Set<String> set = driver.manage().logs().getAvailableLogTypes();
		System.out.println("Available log ="+set);
		
		System.out.println();
		
		// check client log
		System.out.println("Client logs = ");
		LogEntries entries1 = driver.manage().logs().get("client");
		for(LogEntry entry1 : entries1) {
			System.out.println(entry1.getMessage());
		}
		
		System.out.println();
		
		// check driver logs
		System.out.println("Chrome driver logs =");
		LogEntries entries2 =  driver.manage().logs().get("driver");
		for(LogEntry entry2 : entries2) {
			System.out.println(entry2.getMessage());
		}
		
		System.out.println();
		
		// check browser logs
		System.out.println("Chrome Browser logs = ");
		LogEntries entries3 = driver.manage().logs().get("browser");
		for(LogEntry entry3 : entries3) {
			System.out.println(entry3.getMessage());
		}
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
