package com.navigationcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//write a program using selenium web driver count number of links in holland and barrett application and print.
public class LinkTextDemo {
	WebDriver driver;
	int total=0;
	@BeforeTest
	public void Setup() {
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void findElementById() {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int linkcount=links.size();
		  total= total + links.size();
		  
		  System.out.println("Number of links: "+linkcount);
		
		
		
	}
	
	

}
