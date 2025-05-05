package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class26_MultiSelectDropdown {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Multiple selection xpath 
		WebElement nelement = driver.findElement(By.xpath("(//*[text()='Multiple Selection'])[2]"));
		
		// scrolling the page by javascript 
		driver.executeScript("arguments[0].scrollIntoView();", nelement);
		
		WebElement element = nelement.findElement(By.xpath("following-sibling::div"));
		Thread.sleep(3000);
		
		// Check it is multi select or single select dropdow
		if(element.getAttribute("class").contains("multiple")) {
			System.out.println("It is a Multi Select Dropdown");
			
			//Check  count of value available in the dropdown
			
			List<WebElement> element2 = element.findElements(By.xpath("select/option"));
		    int size = element2.size();
		    System.out.println("Value count of the dropdown = "+size);
		    
		    
		    // name of all value available in the dropdown
		    
		    for(WebElement element3 : element2) {
		    	//1st way 
		    	//System.out.println("Name of all value from dropdown ="+element3.getText());
		    	
		    	//2nd way
		    	String value = (String)driver.executeScript("return(arguments[0].textContent);", element3);
		    	System.out.println("Name of all value from dropdown ="+value);
		
		    }
		    // select each item from the dropdown
		    
		    for(WebElement element4 : element2 ) {
		    	
		    	element.click();
		    	Thread.sleep(2000);
		    	
		    	// checking it is visible or not
		    	if(element4.isDisplayed()) {
		    		System.out.println("it is visible");
		    	}
		    	
		    	driver.close();
			
			
		}
	  
	    	
	}
	else {
		System.out.println("It is not a Multi Select Dropdown");
		}
	
}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='mbsc-page mbsc-font demo-multiple-select mbsc-ios mbsc-ltr']"));
		
		if(element.getAttribute("class").contains("multiple")) {
			System.out.println("Multi Select Dropdown");
			
			// count of value 
			List<WebElement> list = driver.findElements(By.xpath("(//div[@class='mbsc-page mbsc-font demo-multiple-select mbsc-ios mbsc-ltr'])/div/select/option"));
			int count = list.size();
			System.out.println("Dropdown count = "+count);
			
			// name of all value
			
			for(WebElement element3 : list) {
				//1st way
				//System.out.println("Name of dropdown value ="+element3.getText());
				
				//2nd way
				String value = (String)driver.executeScript("return(arguments[0].textContent);", element3);
				System.out.println("Name of dropdown value = "+value);
			
			}
		}
		else {
			System.out.println("Single Select Dropdown");
		}
		
		driver.close();
		
	}

	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
}
