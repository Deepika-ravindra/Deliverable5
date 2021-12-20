package com.scuba.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/*
 * Screenshot-Analyzing bugs/defects
 */

public class WebUtils {
	
	public static void takeSnapshot(WebDriver webdriver, String filePath) throws IOException
	{
		//convert driver object  to takeScreen shot object
		TakesScreenshot scrshot= ((TakesScreenshot) webdriver);
		//call ScreenShotas Method to create image file
     File scrfile=scrshot.getScreenshotAs(OutputType.FILE);
     // move image to new destination
     File destFile=new File(filePath);
     //copy file to destination path
     FileUtils.copyFile(scrfile, destFile);
     
	
	
	}
	public static boolean verifyElementPresent(WebDriver driver,String Xpath) {
		if(driver.findElements(By.xpath(Xpath)).size()!=0) {
			System.out.println("Element is present");
			return true;
		}
		else {
			System.out.println("Element is not present");
			return false;
		}
	}
}
