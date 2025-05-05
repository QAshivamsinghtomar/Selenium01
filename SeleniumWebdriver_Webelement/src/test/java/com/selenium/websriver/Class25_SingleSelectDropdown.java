package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class25_SingleSelectDropdown {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// first search nebhiour element and scroll the page
		WebElement nelement = driver.findElement(By.xpath("(//*[text()='Search Selection'])[2]"));
		
		//scroll the page by javascript
		driver.executeScript("arguments[0].scrollIntoView();", nelement);
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("((//*[text()='Search Selection'])[2]/following-sibling::div/input)[2]"));
		
		// Checking it is single selection or multi selection
		if(element.getAttribute("class").contains("Multiple")) {
			System.out.println("It is multi select Dropdown");
		}
		else {
			System.out.println("It is a Single Select Dropdown");
		}
		
		// Collect all items in that single select dropdown and display value
		
		List<WebElement>  list = driver.findElements(By.xpath("(//*[text()='Search Selection'])[2]/following-sibling::div/div/div"));
		System.out.println("List  ="+list);
		
		//name of all country name from the dropdown
		for(WebElement element2 : list) {
			// by using java name will not visible because of java will not provide text of hidden element
			//System.out.println("Name of all country name ="+element2.getText());
			
			// by javascript
			String value = (String) driver.executeScript("return(arguments[0].textContent);", element2);
			
			System.out.println("Name of all country name = "+value);
		}
		
		
			
		
		driver.close();
	}
	
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("(//div[@role='button'])[2]/span"));
		
		if(element.getAttribute("class").contains("Multiple")) {
			System.out.println("It is a multi select dropdown");
		}
		else{
			System.out.println("It is a single select dropdown");
		}
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		m1();
	}
	
}
