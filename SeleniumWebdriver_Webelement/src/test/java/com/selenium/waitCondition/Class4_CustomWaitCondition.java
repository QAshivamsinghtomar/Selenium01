package com.selenium.waitCondition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Class4_CustomWaitCondition {

	public static ExpectedCondition<Boolean> waitAndClick(By b) {
		
		ExpectedCondition<Boolean> ec1 = new ExpectedCondition<Boolean>() {
			
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					driver.findElement(b).click();
					return true ;
				}
				catch (Exception exception) {
					return false ;
				}							
			}
		};
		
		return ec1 ;
	
	}
	
	
	
	public static ExpectedCondition<Boolean> waitAndFill(By b, String s){
		
		ExpectedCondition<Boolean> ec2 = new ExpectedCondition<Boolean>() {
			
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					driver.findElement(b).sendKeys(s);
					return true ;
				}
				catch (Exception exception) {
					return false ;
				}
			}
		};
		return ec2 ;
	}
	
	
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.withTimeout(Duration.ofSeconds(20));
		
		wait.until(waitAndFill(By.name("identifier"), "lavaselenium"));
		wait.until(waitAndClick(By.xpath("(//span[@jsname='V67aGc'])[2]//parent::button")));
		
		driver.close();
			
	}

}
