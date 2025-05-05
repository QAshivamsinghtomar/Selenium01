package com.selenium.waitCondition;

import java.time.Duration;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Class5_CustomWaitCondition {

	public static ExpectedCondition<Boolean> waitAndFill(By b, String sk){
		
		ExpectedCondition<Boolean> ec1 = new ExpectedCondition<Boolean>() {
			
			@Override
			public Boolean apply(WebDriver driver) {
				try {
					driver.findElement(b).sendKeys(sk);
					return true ;
				}
				catch (Exception exception) {
					return false ;
				}
			}
		};
		return ec1 ;
	}
	
	
	public static ExpectedCondition<Boolean> waitAndClick(By b){
		
		ExpectedCondition<Boolean> ec2 = new ExpectedCondition<Boolean>() {
			
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
		return ec2 ;
	}
	
	
	
	public static void main(String[] args) {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		
		FluentWait<RemoteWebDriver> wait = new FluentWait<RemoteWebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(1000)); // interval time
		wait.withTimeout(Duration.ofSeconds(20)) ; // max wait time
		
		wait.until(waitAndClick(By.linkText("Login/Register")));
		wait.until(waitAndFill(By.name("homemenuitems$TBuserNameOnHP"), "ssingh@indianjournals.com"));
		wait.until(waitAndClick(By.xpath("(//input[@type='submit'])[1]")));
		
	}
	
	
}
