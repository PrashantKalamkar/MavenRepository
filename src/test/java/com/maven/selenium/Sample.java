package com.maven.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample
{
	@Test
	public void sampletest()
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
