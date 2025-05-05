package com.selenium.websriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Class5_element_details_beforeandAfter {

	public static void m1() throws Exception {
		
		// Checking details of an element before and after clicking on it.
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://bharatjournals.org/sanjayjani/IJ/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//span[@class='btn-arrow-right ms-3'])[1]"));
		
		// Before click, element details 
		
		String widthValue = element.getCssValue("width");
		String heightValue =  element.getCssValue("height");
		String background_color_Value = element.getCssValue("background-color");
		String display_value = element.getCssValue("display");
		String transition_value = element.getCssValue("transition");
		String font_size_value = element.getCssValue("font-size");
		String color_value =  element.getCssValue("color");
		String box_sizing_value =  element.getCssValue("box-sizing");
		
		System.out.println("width Value Before Click on element = "+widthValue);
		System.out.println("height Value Before Click on element = "+heightValue);
		System.out.println("background color Value Before Click on element = "+background_color_Value);
		System.out.println("display Value Before Click on element = "+display_value);
		System.out.println("transition Value Before Click on element = "+transition_value);
		System.out.println("font size Value Before Click on element = "+font_size_value);
		System.out.println("color Value Before Click on element = "+color_value);
		System.out.println("box sizing Value Before Click on element = "+box_sizing_value);
		
		System.out.println();
		System.out.println();
		
		// Element Details after clicking on element
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		
		
		String widthValue1 = element.getCssValue("width");
		String heightValue1 =  element.getCssValue("height");
		String background_color_Value1 = element.getCssValue("background-color");
		String display_value1 = element.getCssValue("display");
		String transition_value1 = element.getCssValue("transition");
		String font_size_value1 = element.getCssValue("font-size");
		String color_value1 =  element.getCssValue("color");
		String box_sizing_value1 =  element.getCssValue("box-sizing");
		
		System.out.println("width Value After Click on element = "+widthValue1);
		System.out.println("height Value After Click on element = "+heightValue1);
		System.out.println("background color Value After Click on element = "+background_color_Value1);
		System.out.println("display Value After Click on element = "+display_value1);
		System.out.println("transition Value After Click on element = "+transition_value1);
		System.out.println("font size Value After Click on element = "+font_size_value1);
		System.out.println("color Value After Click on element = "+color_value1);
		System.out.println("box sizing Value After Click on element = "+box_sizing_value1);
		
		driver.close();
		
	}
	
	public static void m2() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// xpath of electronics
		WebElement element = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
		Thread.sleep(2000);
		
		// Details before click on element
		
		String font_size = element.getCssValue("font-size");
		String display = element.getCssValue("display");
		String cursor = element.getCssValue("cursor");
		String color =  element.getCssValue("color");
		String list_style =  element.getCssValue("list-style");
		String border =  element.getCssValue("border");
		String box_sizing = element.getCssValue("box-sizing");
		String background_color = element.getCssValue("background-color");
		
		
		System.out.println("font_size before click on element = "+font_size);
		System.out.println("display before click on element = "+display);
		System.out.println("cursor before click on element = "+cursor);
		System.out.println("color before click on element = "+color);
		System.out.println("list_style before click on element = "+list_style);
		System.out.println("border before click on element = "+border);
		System.out.println("box_sizing before click on element = "+box_sizing);
		System.out.println("background_color before click on element = "+background_color);
		
		System.out.println();
		System.out.println();
		
		
		// Clicking on element by Actions class
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		
		
		// details after click on element
		
		String font_size1 = element.getCssValue("font-size");
		String display1 = element.getCssValue("display");
		String cursor1 = element.getCssValue("cursor");
		String color1 =  element.getCssValue("color");
		String list_style1 =  element.getCssValue("list-style");
		String border1 =  element.getCssValue("border");
		String box_sizing1 = element.getCssValue("box-sizing");
		String background_color1 = element.getCssValue("background-color");
		
		
		System.out.println("font_size after click on element = "+font_size1);
		System.out.println("display after click on element = "+display1);
		System.out.println("cursor after click on element = "+cursor1);
		System.out.println("color after click on element = "+color1);
		System.out.println("list_style after click on element = "+list_style1);
		System.out.println("border after click on element = "+border1);
		System.out.println("box_sizing after click on element = "+box_sizing1);
		System.out.println("background_color after click on element = "+background_color1);
		
		
		if(color == color1 || display == display1) {
			System.out.println("Both Color and display are same");
		}
		else {
			System.out.println("Both color and display are different");
		}
		
		driver.close();
	}
	
	
	
	
	public static void m3() throws InterruptedException {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// color Before focus 
		WebElement element = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[5]"));
		String color =  element.getCssValue("color");
		System.out.println("Before Focuse Color = "+color);
		
		// color after focus
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		String color1 =  element.getCssValue("color");
		System.out.println("After Focuse Color = "+color1);
		
		if(color == color1) {
			System.out.println("Both color are same");
		}
		else {
			System.out.println("Both Color are different");
		}
		
		driver.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		m3();
	}
	
}
