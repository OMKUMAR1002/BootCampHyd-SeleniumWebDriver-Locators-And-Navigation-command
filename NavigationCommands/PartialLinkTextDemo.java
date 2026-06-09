package com.navigationcommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkTextDemo {
	WebDriver driver;
	
	@BeforeTest
	public void Setup() {
	    driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void findElementById() {
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		driver.findElement(By.partialLinkText("Vitamins")).click();
	    
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		 int link=links.size();
		 System.out.println("No of links in holland and barret appplication:"+link);
		 
		 for(int i=0;i<links.size();i++) {
			 System.out.println(links.get(i).getText());
			 String str=links.get(i).getText();
			 String str1="Vitamins";
			 if(str==str1) {
				 driver.findElement(By.linkText("Vitamins")).click();
				 driver.findElement(By.xpath("//a[contains(@type,'button')])[4]")).click();
			 }
		 }
		 
		 
	
	
	}
}
