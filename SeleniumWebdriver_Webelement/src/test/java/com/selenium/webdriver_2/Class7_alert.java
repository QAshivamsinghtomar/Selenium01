package com.selenium.webdriver_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class7_alert {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		//click on try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(2000);
		
		//  alert text
		String alertvalue =  driver.switchTo().alert().getText();
		System.out.println("Alert Text = "+alertvalue);
		
		//click on ok button of alert
		driver.switchTo().alert().accept();
		
		// click on dismiss
		//driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		// back into default page
		driver.switchTo().defaultContent();
		
		// Enter again into frame
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		try {
			
			if(driver.findElement(By.xpath("//*[text()='You pressed OK!']")).isDisplayed()) {
				System.out.println("Alert is working properly");
			}
			else {
				System.out.println("Alert is not workking properly");
			}
		}
		catch(Exception exception) {
			System.out.println("Alert is not working properly");
			exception.getMessage();
		}
		
		driver.close();
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// nebhiour element
		WebElement element = driver.findElement(By.id("promtButton"));
		// scroll the page
		driver.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(1000);
		
		// click on 3rd click me button
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		
		// check alert text
		String alertValue = driver.switchTo().alert().getText();
		System.out.println("Alert Text Value = "+alertValue);
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		try {
			
			if(driver.findElement(By.xpath("//span[text()='Ok']")).isDisplayed()) {
				System.out.println("Alert is working properly, Clicked on Ok button");
			}
			else {
				System.out.println("Alert is not working properly, Clicked on cancel button");
			}
		}
		catch(Exception exception) {
			System.out.println("Alert is not working properly, Clicked on cancel button");
			System.out.println(exception.getMessage());
		}
		
		driver.close();
	
	}
	
	
	public static void m3() throws Exception {
		
		// testing form filling
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// click on from
		driver.findElement(By.xpath("(//div[@class='header-text'])[2]")).click();
		Thread.sleep(2000);
		
		// click on practicse form
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		Thread.sleep(2000);
		
		// first name
		driver.findElement(By.id("firstName")).sendKeys("Shivam");
		driver.findElement(By.id("lastName")).sendKeys("Singh");
		driver.findElement(By.id("userEmail")).sendKeys("Text01@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.className("custom-control-label")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9998741025");
		driver.findElement(By.id("subjectsContainer")).sendKeys("Hindi");
		Thread.sleep(5000);
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
