package com.navigationcommands;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTag {
	public static void main(String[]args)throws Exception {
	WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement el:links) {
			System.out.println(el.isDisplayed());
			System.out.println(el.isEnabled());
			System.out.println(el.getAttribute("href"));
		}
		WebElement el = links.get(3);
	
		String expectedUrl = el.getAttribute("href");
		System.out.println("Expected URL: " + expectedUrl);

		el.click();
		Thread.sleep(5000);

		String actualUrl = driver.getCurrentUrl();
		System.out.println("Current URL: " + actualUrl);

		if (actualUrl.equals(expectedUrl)) {
		    System.out.println("PASS");
		} else {
		    System.out.println("FAIL");
		}
	}
}
