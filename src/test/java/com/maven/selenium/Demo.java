package com.maven.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo
{
	
    @Test
    public void demoTest()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.quit();
		System.out.println("Hello");
		
		
		
	}
	
}
