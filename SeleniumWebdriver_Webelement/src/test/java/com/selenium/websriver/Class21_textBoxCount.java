package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class21_textBoxCount {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// counting of all textbox
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='text']"));
		int count = list.size();
		System.out.println("Text box count = "+count);
		
		// checking visible and hidden textbox
		int visibleTextBox = 0 ;
		int hiddenTextBox = 0 ;
		
		for(WebElement element : list) {
			if(element.isDisplayed()) {
				visibleTextBox ++ ;	
			}
			else {
				hiddenTextBox ++ ;
			}
		}
		System.out.println("Visible Text Box = "+visibleTextBox);
		System.out.println("Hidden Text Box = "+hiddenTextBox);
		
		driver.close();		
	}
	
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//  count of all textbox
		List<WebElement> list = driver.findElements(By.xpath("//*[@type = 'text']"));
		int count = list.size();
		System.out.println("Count of textbox = "+count);
		
		driver.close();
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
