package org.testpack;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends Baseclass1 {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get("https://www.faceook.com/");
    driver.manage().window().maximize();
	}


}
