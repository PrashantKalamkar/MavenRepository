package com.maven.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo
{
	
    @Test
    public void demoTest()
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://facebook.com");
		String TitleofBrowser=driver.getTitle();
		System.out.println(TitleofBrowser);
		driver.quit();
		System.out.println("Hello");
		
		
		
	}
	
}
