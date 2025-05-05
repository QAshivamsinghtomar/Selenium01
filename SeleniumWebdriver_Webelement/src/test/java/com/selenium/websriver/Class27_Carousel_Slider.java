package com.selenium.websriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class27_Carousel_Slider {

	
	public static void m1() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// if banner available then  banner related code need to write in below try and catch block
		   // to close the banner.
		try {
			
		}
		catch (Exception exception) {	
		}
		
		
		
		int count = 0 ;
		List<WebElement> list ;
		
		// capture all carousel slider by using xpath
		WebElement carouselSlider = driver.findElement(By.xpath("//div[@class = '_3bzdSa']"));
		
		// check tag of the carousel slider
		String tagName =  carouselSlider.getTagName();
		System.out.println("Carousel Slider Tag Name = "+tagName);
		
		// check if tagname div then how many silde are available
		if(tagName.equals("div")) {
		 list = carouselSlider.findElements(By.xpath("div")); // same xpath we can write "child::div"
		
		 // retreving the slider one by one
		for(WebElement element : list) {
			
			// checking how many slider are visible and how many are hidden
			// if data-clone is false - it is visible and if data clone is true it is hidden
			
			try {
				if(element.getAttribute("data-clone").equals("false")) {
					count = count + 1 ;
				}
			}
			catch (Exception exception) {
				count = count + 1 ;
			}
			
		}
		
		
		}
		else {
			list = driver.findElements(By.xpath("child::li"));
			count = list.size();
		}
		
		System.out.println("Total number of slide = "+list.size());
		System.out.println("Total visible slide = "+count);
		
		
		// Check slide are 2D or 3D
		
		// first get the css value of transform 
		String transformValue = carouselSlider.getCssValue("transform");	
		if(transformValue.equals("scale")) { //transform-style
			transformValue = carouselSlider.getCssValue("transform-style");
		}
		
		if(transformValue.contains("3d")) {
			System.out.println("These are slides are 3D");
		}
		else{
			System.out.println("Slides are 3D");
		}
		
		
		// Check slide are moving manually or automatically
		String movingValue = carouselSlider.getCssValue("transform");
		System.out.println("transform attribute value = "+movingValue);
		
		if(movingValue.contains("none")) {
			System.out.println("Slides are moving manually");
		}
		else {
			System.out.println("Slides are moving automatically");
		}
		
		
		//check slide are moving slow or speed
		String transitionValue = carouselSlider.getCssValue("transition");
		System.out.println("Transition Value of carousel slider = "+transitionValue);
		
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		m1();
	}
	
}
