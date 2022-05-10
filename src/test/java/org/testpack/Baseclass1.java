package org.testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
	 public static WebDriver driver;
	 
	 public  void setup(String url) {
//		 if(System.getProperty("browser").equalsIgnoreCase("chrome")) {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		 }
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		driver.get(url);
        driver.manage().window().maximize();
        
	}
	 
	
public WebElement xpath(String id) {
	WebElement element = driver.findElement(By.id(id));
	return element;

}
//public static WebDriver driver;
public  static void getDriver() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();	
}

public  static void loadUrl(String url) {
	driver.get(url);		
}

public  static void maximize() {
	driver.manage().window().maximize();
}

public  static void closeBrowser() {
	
	driver.quit();
}

public WebElement findLocByID(String id) {
	WebElement element = driver.findElement(By.id(id));
	return element;
	
}
}
