package com.selenium.websriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


/*
-> getText() Method - Checking on visible element and hidden element.

=> GetText Method will return Null value when
   . Element having a paried tag but element is hidden.
   . Element is having paired tag but no text available
   . Element having unpaired tag.
   
-> How to get Text on hidden element.
-> Ans. By using javascript. By using java hidden element text is not visible, it will be visible omly 
        by using javascript.

*/
public class Class4_getText {

	public static void m1() throws Exception {
		// Open Chrome Browser and mazimize
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Open ERP1
		driver.get("https://erp1.glomis.in/Home/LoginPage.aspx");
		Thread.sleep(2000);
		
		// Find username filed and send data and click on continue
		driver.findElement(By.id("txtuser")).sendKeys("shsingh", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		
		// Find password fild and send data and click on continue
		driver.findElement(By.id("txtpass")).sendKeys("Shivam@123", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		
		
		// Checking getText Method on visible element - Report Text
		WebElement element1 =  driver.findElement(By.id("sidemenu1_TreeView1t9"));
		String reportText =  element1.getText();
		System.out.println("Report Text = "+reportText);
		
		
		//Checking getText Method on hidden element by using java - Pending Payment
		 WebElement element2 = driver.findElement(By.id("sidemenu1_TreeView1t19"));
		 String pendingPaymentText = element2.getText();
		 System.out.println("Pending Payment Text by using java = "+pendingPaymentText);
		
		
		//Checking getText Method on hidden element by using javascript - Pending Payment
		 
		 String pendingpaymenttextbyjs = (String) driver.executeScript("return(arguments[0].textContent);", element2);
		 System.out.println("Pending Payment Text By using JS = "+pendingpaymenttextbyjs);
		 
		 driver.close();
		
	}
	
	public static void m2() throws Exception {
		
		// getText Method Testing on visible and hidden element
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// File dropdown Xpath and checking getText Method ---- Visible Element
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='text'])[1]"));
		String filetext =  element1.getText();
		System.out.println("File Text = "+filetext);
		
		
		// Checking getText method on hidden element by java ---- Open text
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='text'])[1]/following::div[3]"));
		String opentext =  element2.getText();
		System.out.println("Open Text Value by using java = "+opentext);
		
		// Checking gettext Method of open by using javascript
		String opentext1 = (String)driver.executeScript("return(arguments[0].textContent);", element2);
		System.out.println("Open Text Value by using javascript = "+opentext1);
		
		
		driver.close();
		
	}
	
	
	public static void m3() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://bharatjournals.org/sanjayjani/IJ/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//getText on visible element
		WebElement element = driver.findElement(By.xpath("((//select[@class='form-select'])[1]/option)[1]"));
		String elementValue = element.getText();
		System.out.println("Visible Filed Value = "+elementValue);
		
		//getText On hidden element by java
		
		WebElement element1 = driver.findElement(By.xpath("((//select[@class='form-select'])[1]/option)[5]"));
		String element1Value = element1.getText();
		System.out.println("Element1 Value = "+element1Value);
		
		
		//getText On hidden element by javascript
		String element1ValuebyJS = (String) driver.executeScript("return(arguments[0].textContent);", element1);
		System.out.println("Element 1 Value by JavaScript ="+element1ValuebyJS);
		
		driver.close();
	}
	
	
	public static void m4() throws Exception {
			
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://erp.glomis.in/Home/LoginPage.aspx");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("ContentPlaceHolder1_txtuser")).sendKeys("shsingh", Keys.TAB,Keys.ENTER);
		Thread.sleep(2000);
		
		//getText Method - details of hidden element
		driver.findElement(By.id("ContentPlaceHolder1_txtpass")).sendKeys("Shivam@123", Keys.TAB, Keys.ENTER);
		Thread.sleep(2000);
		
		// visible element
		WebElement element1 = driver.findElement(By.xpath("(//span[@class ='ContentPlaceHolder1_Menutest1_TreeView1_0 ContentPlaceHolder1_Menutest1_TreeView1_1'])[1]"));
		String visibletext =  element1.getText();
		System.out.println("visible text = "+visibletext);
		
		//hidden element
		WebElement element2 = driver.findElement(By.xpath("(//a[@class = 'ContentPlaceHolder1_Menutest1_TreeView1_0 ContentPlaceHolder1_Menutest1_TreeView1_1'])[2]"));
		String hiddenelement =  element2.getText();
		System.out.println("hidden element value by java = "+hiddenelement);
		
		
		//hidden element --- by javascript
		
		String hiddenelementvalue = (String)driver.executeScript("return(arguments[0].textContent);", element2);
		System.out.println("Hidden Element Value by Javascript = "+hiddenelementvalue);
		
		driver.close();
		
		
		
	}
	
	public static void main(String[] args) throws Exception {
		m4();
	}
	
}
