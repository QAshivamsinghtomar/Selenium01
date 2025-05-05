package com.selenium.testingtopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// DAte Picker in IRCTC Website


public class datepicker2 {

	public static void main(String[] args) throws Exception {

		String expectedDay = "2" ;
		String expectedMonth = "May" ;
		String expectedYear = "2025" ;
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		element.click();
		
		//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted'] - For Month
		//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted'] - For Year
		
		
		while(true) {
			
			// For month xpath
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")).getText();
		
			// For Year xpath
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")).getText();
		
			// comparing currect month and year with expected month and year data
			
			if((month.equals(expectedMonth)) && (year.equals(expectedYear))) {
				
				// checking day - day xpath
				
				//table/tbody/tr/td - day xpath
				List<WebElement> day = driver.findElements(By.xpath("//table/tbody/tr/td"));
				
				// compare current day with expected day
				for(WebElement e : day) {
					String dayvalue = e.getText();
					
					if(dayvalue.equals(expectedDay)) {
						
						e.click();
						Thread.sleep(2000);
						
						break ;
					}
				}
				
				break ;
			}
			
			else {
				
				driver.findElement(By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();
			}
		}
		
		Thread.sleep(5000);	
		
	}
	
	
	
}
