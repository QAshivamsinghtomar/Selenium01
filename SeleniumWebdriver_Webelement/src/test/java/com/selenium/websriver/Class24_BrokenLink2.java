package com.selenium.websriver;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class24_BrokenLink2 {

	
	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// google search box and sending data
		driver.findElement(By.id("APjFqb")).sendKeys("API Testing", Keys.ENTER);
		Thread.sleep(3000);
		
		int totalPage = 0 ;
		int totalLink = 0 ;
		int correctlyWorkingLink = 0 ;
		int notWorkingLink = 0 ;
		
		while(true) {
			totalPage ++ ;
			
			// Collect all link
			List<WebElement> list = driver.findElements(By.xpath("(//img) | (//base) | (//area) | (//a) | (//script) | (//link) | (//div)"));
			for(WebElement element : list) {
				
				try {
				
				if(element.getAttribute("href") != null) {
					String linkValue = element.getAttribute("href");
					
					if(linkValue.startsWith("https") || linkValue.startsWith("http")) {
						
						totalLink ++ ;
						
						URL url = new URL(linkValue);
						HttpsURLConnection connection = (HttpsURLConnection)
						url.openConnection();
						connection.connect();
						
						int responseCode = connection.getResponseCode();
						String responseMessage = connection.getResponseMessage();
						
						if(responseCode >=200 && responseCode <= 299) {
							correctlyWorkingLink ++ ;
						}
						else {
							notWorkingLink ++;
							System.out.println(linkValue+"====="+responseCode+"====="+responseMessage);
						}	
					}
					
				}
							
				}
				catch(Exception exception) {
					System.out.println(exception.getMessage());
				}
				try {
					// scrolling the page 10 times
					Actions actions = new Actions(driver);
					for(int i=1; i<=10; i++) {
						actions.sendKeys(Keys.ARROW_DOWN).perform();
					}	
				}
				catch(Exception exception) {
					break ; // terminate the loop
				}
			}
			System.out.println("Total link = "+totalLink);
			System.out.println("Total Working link = "+correctlyWorkingLink);
			System.out.println("Total Not Working link = "+notWorkingLink);
		
			driver.close();
			
		}

	}
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
