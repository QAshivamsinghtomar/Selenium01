package com.selenium.testingtopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DatePicker {

	
	public static void m1() throws Exception {
		
		String expectedday = "2" ;
		String expectedMonth = "March" ;
		String expectedYear = "2026" ;
		
		
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		
		// enter into frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		
		// locate element  
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		Thread.sleep(2000);
		datepicker.click();
		
		
		// selecting date from the calander
		
		// compare current date and expected date
		
		//span[@class='ui-datepicker-month'] - For Month
		//span[@class='ui-datepicker-year'] - For year
		
		
		while(true) {
		    // Month xpath
			String monthValue = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		   
			// year xpath
			String yearValiue = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			// compare current date and expected date
			if(monthValue.equals(expectedMonth) && (yearValiue.equals(expectedYear))) {
			
			// day list - xpath
			List<WebElement> dayvalue = driver.findElements(By.xpath("//table/tbody/tr/td"));
			
			// compare day with expected day
			
			for(WebElement e : dayvalue) {
				String daytext = e.getText() ;
				if(daytext.equals(expectedday)) {
					
				e.click();
				Thread.sleep(1000);
				
				break ;
			}
			
			}
			
			break ;
			
			}
			else {
			driver.findElement(By.xpath("//span[@class ='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
		}
		
		driver.close();		
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
