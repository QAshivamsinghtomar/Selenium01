package com.selenium.webdriver_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class5_getWindowHandles {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_input.asp");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// click on Try it Yourself link
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Thread.sleep(3000);
		
		// Handle Multiple window
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		
		// enter into 2nd window(index start with 0)
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
	
		// Enter into frame of 2nd window
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		
		// Enter 1st value
		driver.findElement(By.id("fname")).sendKeys("java");
		Thread.sleep(2000);
		
		// Enter 2nd value
		driver.findElement(By.id("lname")).sendKeys("selenium");
		Thread.sleep(2000);
		
		// click on submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		// Out of Frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		// close 2nd window
		driver.close();
		
		// move into first window
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		// close 1st window
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// click on link
		driver.findElement(By.linkText("DIVA ENTERPRISES PVT. LTD.")).click();
		Thread.sleep(2000);
		
		// Handleing the multiple window
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		
		// move into second window
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		
		// closing second window
		driver.close();
		
		// move into first window
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		
		// closing first window
		driver.close();
		
	}
	
	
	public static void m3() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// click on gmail
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		
		// click on sign button
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Learn more about using Guest mode")).click();
		Thread.sleep(2000);
		
		
		// Handle multiple window
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		
		// move into second window
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		
		// click on Android
		driver.findElement(By.linkText("Android")).click();
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		
		// move into first window
		
		
		driver.switchTo().window(list.get(0));
		Thread.sleep(2000);
		
		//new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		//driver.close();
		
		

	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
