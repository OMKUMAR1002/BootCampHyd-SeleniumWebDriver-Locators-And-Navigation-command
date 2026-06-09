package com.locatorsTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IDTestDemoExamples {
 @Test
 public void IDLocator() {
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	 driver.manage().window().maximize();
	 String title = driver.getTitle();
	 System.out.println(title);
	 //Locator ID
	 driver.findElement(By.id("username")).sendKeys("student");
	 driver.findElement(By.id("password")).sendKeys("Password123");
	 	 
 }
 
}
