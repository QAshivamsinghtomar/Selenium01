package com.selenium.webdriver_2;

/*
It will come when we are going to the next page and then again back to the same page. 
In this process the internal DOM(Document object model) is changing. When we are trying 
to operate the same page after backing then StaleElementReferenceException will come.

In order to prevent the StaleElementReferenceException, we need to relocate the 
element freshly by using driver.findElement(-) again


*/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class4_StaleElementReferenceException {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Locate search text box and send data
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("javaselenium", Keys.ENTER);
		Thread.sleep(3000);
		
		// back into search box page
		driver.navigate().back();
		
		// relocate the element
		element = driver.findElement(By.name("q"));
		element.clear();
		element.sendKeys("API Testing", Keys.ENTER);
		Thread.sleep(2000);
		
		
		driver.close();
			
		}
	
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.linkText("Buttons"));
		element.click();
		Thread.sleep(2000);
		
		// back into home page
		driver.navigate().back();
		
		// again relocate 
		element = driver.findElement(By.linkText("Buttons"));
		element.click();
		Thread.sleep(2000);
		driver.close();		
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
		
		
		
}
	
	

