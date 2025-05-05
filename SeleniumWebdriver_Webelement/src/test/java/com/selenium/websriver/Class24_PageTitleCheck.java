package com.selenium.websriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

// send any data and check every page title 

public class Class24_PageTitleCheck {

	public static void m1() throws Exception {
		
		// taking input from user'end by Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word");
		String word = scanner.nextLine();
		
		// Open chrome browser and maximaize
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// Sending data
		driver.findElement(By.name("q")).sendKeys(word, Keys.ENTER);
		Thread.sleep(2000);
		
		// Pagination on result count
		
		int totalPageCount = 0 ;
		int flag = 0 ;
				
		
		while(true) {
			
			totalPageCount ++ ;
			
			String title = driver.getTitle();
			
			
			if(! title.contains(word)) {
				flag = 0 ;
				break ;
			}
			
			// Going to next page and scrolling the page
			
			try {
				Actions actions = new Actions(driver);
				for(int i = 0; i<=1 ; i++) {
					actions.sendKeys(Keys.ARROW_DOWN).perform();
				}
			}
			catch(Exception exception) {
				break ;
			}
		}
		
		if(flag == 0) {
			System.out.println(totalPageCount+" page count result is correct");
		}
		else {
			System.out.println(totalPageCount+" page count result is incorrect");
		}
		
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
}
