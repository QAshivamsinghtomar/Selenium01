package com.selenium.websriver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class28_CarouselSlider2 {

	public static void m1() throws Exception {
		RemoteWebDriver driver= new ChromeDriver();
		driver.get("https://3dtransforms.desandro.com/carousel");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// scrolling the page by using javascript - 
		WebElement scrollView = driver.findElement(By.xpath("(//*[text()='Previous'])[2]"));
		driver.executeScript("arguments[0].scrollIntoView();", scrollView);
		Thread.sleep(2000);
		
		//Collect all carousel slider 
		WebElement carouselSlider = driver.findElement(By.className("carousel"));
		//carouselslider tagname
		String tagName = carouselSlider.getTagName();
		System.out.println("Carousel Slider Tag Name = "+tagName);
		
		List<WebElement> list ;
		int count = 0 ;
		
		if(tagName.equals("div")) {
			list = driver.findElements(By.xpath("(//div[@class='carousel'])[1]/div"));
			
			for(WebElement element : list) {
				
				try {
					if(element.getAttribute("data-clone").contains("false")) {
						count = count + 1 ;
					}
				}
				catch(Exception exception) {
					count = count + 1 ;
					
				}
				
			} 
			
		}
		else {
			 list = carouselSlider.findElements(By.xpath("child::li"));
			 count = list.size();
		}
		
		System.out.println("Total No. of slide = "+list.size());
		System.out.println("Total No. of visible Slide = "+count);
		
		
		// Check Slide are 2D or 3D
		String transformValue = carouselSlider.getCssValue("transform");
		if(transformValue.equals("scale")) {
			transformValue = carouselSlider.getCssValue("transform-style");
		}
		if(transformValue.contains("3d")) {
			System.out.println("These are slides are 3D");
		}
		else {
			System.out.println("These are slides are 2D");
		}
		
		
		//Check slide are moving manually or automatically
		
		String movingValue = carouselSlider.getCssValue("transform");
		if(movingValue.equals("none")) {
			System.out.println("Slides are moving manually");
		}
		else {
			System.out.println("Slides are moving Automatically");
		}
		
		
		// check slide are slow or fast
		String transitionValue = carouselSlider.getCssValue("transition");
		System.out.println("Transition Value = "+transitionValue);
		
		driver.close();
		
	}
	
	
	public static void m2() throws Exception {
		RemoteWebDriver driver = new  ChromeDriver(); // open the chrome browser
		driver.manage().window().maximize();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		Thread.sleep(5000);
		
		try
		{
			// close the banner
		}
		catch(Exception exception) {}
		
		
		// capture all the carousel sliders of flipkart
		
		WebElement carouselSliders =  driver.findElement(By.className("swiper-wrapper"));  
		
		List<WebElement> slides;
		int count = 0;
		
		String tagName =  carouselSliders.getTagName(); //<div>
		
		if (tagName.equals("div")) {

			slides =  carouselSliders.findElements(By.xpath("child::div"));//8
			
			for(WebElement slide : slides)
			{
				
				try {
					
					if( slide.getAttribute("data-clone").equals("false"))
					{
						count = count+1;
					}
				}
				catch(Exception exception) {
					count = count+1;
				}
			}
		}
		
		else {
			
			slides =  carouselSliders.findElements(By.xpath("child::li"));
			count = slides.size();
		}
		
		System.out.println("Total Number of slides are = "+slides.size());
		System.out.println("Count of all the visible slides = "+count);
		
		// check weather slides are 2D or 3D
		// get the css value of "transform"
		
		String transformValue =  carouselSliders.getCssValue("transform");
		
		if (transformValue.equals("scale")) { // transfrom-style
			transformValue = carouselSliders.getCssValue("transform-style");
			
		}
		
		if (transformValue.contains("3d")) {
			System.out.println("This all slides is 3D slides");
		}
		else {
			System.out.println("This all slides is 2D slides");
		}
		
		
		System.out.println();
		
		// weather your slides are moving automatically or manually
		
		String movingSlides =  carouselSliders.getCssValue("transform");
		
		if (movingSlides.equals("none")) {
			System.out.println("Not Moving Automatically");
		}
		else
		{
			System.out.println("Moving Automatically");
			
			String c =  movingSlides.substring(7, movingSlides.length()-1);
			
			String p[] =  c.split(",");
			
			p[4] = p[4].trim();
			p[5] = p[5].trim();
			
			//converting String into float
			float x = Float.parseFloat(p[4]);
			float y = Float.parseFloat(p[5]);
			
			if(x < y  &&  y==0)
			{
				System.out.println("Slides are moving from Right to Left");
			}
			

			else if(x > 0  &&  y==0)
			{
				System.out.println("Slides are moving from Left to Right ");
			}

			else if(x == 0  &&  y < 0)
			{
				System.out.println("Slides are moving from Bottom to Top");
			}

			else 
			{
				System.out.println("Slides are moving from Top to Bottom");
			}

		}
		System.out.println("Transform Attribute value = "+movingSlides);
		
		System.out.println();
		
		// Test weather your slides are fast or slow
		
		String transitionValue =  carouselSliders.getCssValue("transition");
		System.out.println("Transition value = "+transitionValue);
		
		String []q =  transitionValue.split(" ");
		
		if (q[2].equals("ease-in")) {
			System.out.println("Slow starts for each slides");
		}
		
		else if(q[2].equals("ease-out"))
		{
			System.out.println("Slow completes for each slides");
		}
		
		else
		{
			System.out.println("Slow starts and Slow completes for each slides");
		}
		
		// get the duration of each slides
		System.out.println("Duration of each slides is = "+q[1]);
		
		//get delay between each slides
		System.out.println("Delay between each slides is = "+q[3]);
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
