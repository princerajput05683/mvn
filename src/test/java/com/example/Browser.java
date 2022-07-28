package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	
	
	@Test
	public void runtest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	String str=driver.getTitle();
	System.out.println("----------------------");
	System.out.println("------"+str+"----------");
	driver.close();
		
	}

}
