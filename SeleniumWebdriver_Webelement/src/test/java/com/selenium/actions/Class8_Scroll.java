package com.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class8_Scroll {

	public static void m1() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// locate element
		WebElement element = driver.findElement(By.xpath("(//pre[@class='lang-java s-code-block'])[1]"));
		
		// Actions class
		Actions actions = new Actions(driver);
		
		// page scroll  end
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		// page scroll end
		actions.sendKeys(element, Keys.END).perform();
		Thread.sleep(2000);
		
		// element scroll up
		actions.sendKeys(element, Keys.HOME).perform();
		Thread.sleep(2000);
		
		// page scroll up
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);

		//close site
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.indianjournals.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// Actions class
		Actions actions = new Actions(driver);
				
		// page scroll  end
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(2000);
		
		// page scroll  home
		actions.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
