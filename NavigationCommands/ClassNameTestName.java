package com.navigationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameTestName 
{
	@Test
	public void TestDemo() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.className("NavCategoryItem-module_categoryImage__mk1mV")).click();
		String BrowserTitle = driver.getCurrentUrl();
		System.out.println(BrowserTitle);
	}
}
