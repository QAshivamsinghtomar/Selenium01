package com.selenium.waitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Class1_Wait {

	public static void m1() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// previous we used fixed wait
		// Thread.sleep(2000);
		
		// ExplecitWait - FluentWait
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000)); // interval time
		wait.withTimeout(Duration.ofSeconds(20)) ;  // max waiting time
		
		// previous code for locating element and sending data
		//driver.findElement(By.name("q")).sendKeys("Java Selenium");
		
		
		// Locating element and sending data by using wait 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("Java Selenium", Keys.ENTER);
		
		// Title Check
		if(wait.until(ExpectedConditions.titleContains("Java Selenium"))) {
			System.out.println("Test Successful for Title check");
		}
		else {
			System.out.println("Test Unsuccessful for Title check");
		}
		
		driver.close();
	}
	
	
	
	public static void m2() {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait  = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000)); // interval time
		wait.withTimeout(Duration.ofSeconds(20)); // max. wait time
		
		// locate element and send data
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("API Testing", Keys.ENTER);
		
		// check title
		if(wait.until(ExpectedConditions.titleContains("API Testing"))) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test not successful");
		}
		
		driver.close();
	
		
	}
	
	public static void main(String[] args) {
		m2();
	}
	
}
