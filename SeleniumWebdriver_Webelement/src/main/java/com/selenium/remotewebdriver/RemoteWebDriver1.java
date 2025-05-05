package com.selenium.remotewebdriver;

// Creating RemoteWebDriver class in another package and accessing data

/*
import com.selenium.webdriver.Webdriver1;
import com.selenium.webdriver.Webdriver2_OptionIMPL;
import com.selenium.webdriver.Webdriver3_NavigationIMPL;
import com.selenium.webdriver.Webdriver4_TargetLocatorIMPL;

public class RemoteWebDriver1 implements Webdriver1 {

	// if constructor is protected, then we can not create object of that class outside of the package.
	protected RemoteWebDriver1() {
		System.out.println("RemoteWebDriver1 - Constructor");
	}
	
	
	
	@Override
	public Options manage() {
		return new Webdriver2_OptionIMPL();
	}

	@Override
	public Navigation navigate() {
		return new Webdriver3_NavigationIMPL();
	}

	@Override
	public TargetLocator switchTo() {
		return new Webdriver4_TargetLocatorIMPL();
	}
	
	
	
	// Main Method
	public static void main(String[] args) {
		RemoteWebDriver1 driver1 = new RemoteWebDriver1();
		
		System.out.println("------Options Interface Method------");
		driver1.manage().addCookie();
		driver1.manage().deleteAllCookie();
		driver1.manage().deleteCookie();
		driver1.manage().deleteCookieNamed();
		driver1.manage().getCookieNamed();
		driver1.manage().getCookies();
		driver1.manage().logs();
		driver1.manage().timeouts();
		driver1.manage().window();
		
		
		System.out.println();
		System.out.println();
		System.out.println("------Navigation Interface Method------");
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().to();
		driver1.navigate().refresh();
		
		
		System.out.println();
		System.out.println();
		System.out.println("------TargetLocator Interface Method------");
		driver1.switchTo().activeElement();
		driver1.switchTo().alert();
		driver1.switchTo().defaultContent();
		driver1.switchTo().frame();
		driver1.switchTo().newWindow();
		driver1.switchTo().parentFrame();
		driver1.switchTo().newWindow();
		
		
	}
	
	
	
	

}

*/