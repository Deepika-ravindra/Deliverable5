package com.scuba.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startBrowser(String browserName, String url) {


		if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(); 
		}
		else if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(); 
		}
		else if(browserName.equals("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();

		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
