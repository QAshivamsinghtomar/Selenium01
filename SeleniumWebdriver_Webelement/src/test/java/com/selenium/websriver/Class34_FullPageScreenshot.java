package com.selenium.websriver;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Class34_FullPageScreenshot {

	public static void m1() throws Exception {
		
		// first way to take full page screenshot
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*
		AShot aShot = new AShot();
		ShootingStrategy shootingStrategy = ShootingStrategies.viewportPasting(1000);
		Screenshot screenshot = aShot.shootingStrategy(shootingStrategy).takeScreenshot(driver);
		
		File destination = new File("target\\indianjournals.png");
		ImageIO.write(screenshot.getImage(), "PNG", destination);
		*/
		
		AShot aShot = new AShot();
		ShootingStrategy strategy = ShootingStrategies.viewportPasting(1000);
		Screenshot screenshot = aShot.shootingStrategy(strategy).takeScreenshot(driver);
		
		File location = new File("target\\location.png");
		ImageIO.write(screenshot.getImage(), "PNG", location);
		
		driver.close();

	}
	
	
	public static void m2() throws Exception {
		
		// Second way to take full page screenshot by using shutterbug.
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://indianjournals.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Shutterbug.shootPage(driver, Capture.FULL, true).save("target\\indian.png");
		Shutterbug.shootPage(driver, Capture.FULL, true).save("target\\indian.png");
		
		driver.close();
		
	}
	
	public static void main(String[] args) throws Exception {
		m2();
	}
	
}
