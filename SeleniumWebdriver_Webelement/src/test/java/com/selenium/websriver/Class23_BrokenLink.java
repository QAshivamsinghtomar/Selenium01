package com.selenium.websriver;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class23_BrokenLink {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// First we are colling all link from the website
		List<WebElement> element1 = driver.findElements(By.xpath("(//img) | (//base) | (//link)| (//a) | (//area) | (//div) | (//script)"));
		
		int totalLink = 0 ;
		int correctlyWorkingLink = 0 ;
		int notWorkingLink = 0 ;
		
		// For each loop using --- here all link store in element
		for(WebElement element : element1) {
			
			try { // this try block will use for if any exception will come 
				
				// Test Case 1 - Check weather this link is contaning href attribute or not
				if(element.getAttribute("href") != null ) { 
					
					String hrefValue = element.getAttribute("href");
					
					// Test Case2 - Check weather that href is contain URL (https) or not
					if(hrefValue.startsWith("https") || hrefValue.startsWith("http")) {
						totalLink ++ ;
						
						// using URL and HttpsURLConnection for connection 
						
						URL url = new URL(hrefValue);
						HttpsURLConnection connection = (HttpsURLConnection)
						url.openConnection();
						connection.connect();
						
						// Test case3 - Check responce code and responce message
						int ResponseCode = connection.getResponseCode();
						String ResponseMessage = connection.getResponseMessage();
						
						connection.disconnect();
						
						// Test Case4 = Check 200 -299 status code
						if(ResponseCode>=200 && ResponseCode<=299) {
							correctlyWorkingLink ++ ;
						}
						else {
							notWorkingLink ++ ;
							System.out.println("Url = "+hrefValue+"....Responce code = "+ResponseCode+"....Response Message = "+ResponseMessage);
						}
					
					}
					
					
				}
				
			}
			catch (Exception exception) {
				System.out.println(exception.getMessage());
			}
			
		}
		System.out.println("Total link in Website = "+totalLink);
		System.out.println("Total Working link in Website = "+correctlyWorkingLink);
		System.out.println("Not Working link in Website = "+notWorkingLink);
		
		driver.close();
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.globepub.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		int totalLink = 0 ;
		int correctlyWorkingLink = 0 ;
		int notWorkingLink = 0 ;
		
		// collect all link
		List<WebElement> list = driver.findElements(By.xpath("(//img) | (//a) | (//base) | (//area) | (//div) | (//script) | (//link)"));
		
		for(WebElement element : list) {
			
			try {
				if(element.getAttribute("href") != null) {
					String hrefValue = element.getAttribute("href");
					
					if(hrefValue.startsWith("https") || hrefValue.startsWith("http")) {
						totalLink ++ ;
						
						URL url = new URL(hrefValue);
						HttpsURLConnection connection = (HttpsURLConnection)
						url.openConnection();
						connection.connect();
						
						int responseCode = connection.getResponseCode();
						String responseMessage = connection.getResponseMessage();
						
						connection.disconnect();
						
						if(responseCode >= 200 && responseCode <= 299) {
							correctlyWorkingLink ++ ;
						}
						else {
							notWorkingLink ++ ;
							System.out.println("====URL = "+hrefValue+"========Response Code = "+responseCode+"=======Response Message = "+responseMessage);
						}
						
					}
					
				}
				
			}
			catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
		System.out.println("Total Link = "+totalLink);
		System.out.println("Total working Link = "+correctlyWorkingLink);
		System.out.println("Not working Link = "+notWorkingLink);
		
		
		driver.close();

	}
	
	public static void m3() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.aajtak.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		List<WebElement> list = driver.findElements(By.xpath("(//img) | (//a) | (//base) | (div) | (//area) | (//link) | (//script)"));
		
		int totallink = 0 ;
		int workingLink = 0 ;
		int notWorkingLink = 0 ;
		
		for(WebElement element : list) {
			
			try {
				if(element.getAttribute("href") != null) {
					String hrefValue = element.getAttribute("href");
					if(hrefValue.startsWith("https") || hrefValue.startsWith("http")) {
						totallink ++ ;
						
						URL url = new URL(hrefValue);
						HttpsURLConnection connection = (HttpsURLConnection)
					    url.openConnection();
						connection.connect();
						
						int responseCode =  connection.getResponseCode();
						String responseMessage = connection.getResponseMessage();
						
						connection.disconnect();
						
						if(responseCode >=200 && responseCode<=299) {
							workingLink ++ ;
						}
						else {
							notWorkingLink ++; 
							System.out.println(hrefValue+"===="+responseCode+"===="+responseMessage);
						}
						
					}
					
					
					
				}
				
			}
			catch(Exception exception) {
				System.out.println(exception.getMessage());
			}
		}
		System.out.println("Total Link = "+totallink);
		System.out.println("Total Working Link = "+workingLink);
		System.out.println("Total Not Working Link = "+notWorkingLink);
		
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws Exception {
		m3();
	}
	
	
}
