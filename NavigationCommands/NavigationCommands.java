package com.navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {
   @Test
	public void navigationtomethod() {
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 String title= driver.getTitle();
		 String url=driver.getCurrentUrl();
		 System.out.println(title);
		 System.out.println(url);
	}
	
	/*@Test(priority=0)
	public void navigateback() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
	}*/
	@Test(priority=0)
	public void refershmethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().refresh();
	}
	public void NavigateForward() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://login.yahoo.com/");
		 url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		 url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().forward();
		 url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
}
