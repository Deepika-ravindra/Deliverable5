package com.tests.pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LeavePage {



	WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Assign Leave')]")
	WebElement assignleave;
	@FindBy(id="assignleave_txtEmployee_empName")
	WebElement empName;
	@FindBy(xpath = "//img[@class='ui-datepicker-trigger']")
	WebElement fromdate;
	@FindBy(xpath = "//a[contains(text(),'18')]")
	WebElement ddate;
	@FindBy(xpath = "//label[@for='assignleave_txtToDate']")
	WebElement todate;
	//	@FindBy(xpath = "//a[contains(text(),'18')]")
	//	WebElement ddate1;
	@FindBy(id="assignleave_txtComment")
	WebElement comment;
	public LeavePage(WebDriver driver) {
		this.driver=driver;
	}
	public void leave() {
		assignleave.click();
		empName.sendKeys("Orange Test");
	}

	public void LeaveType() throws InterruptedException {

		Select dd_po= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		dd_po.selectByIndex(5);
		fromdate.click();
		ddate.click();
		todate.click();
		//ddate1.click();
		Select dd_po1= new Select(driver.findElement(By.id("assignleave_duration_duration")));
		Thread.sleep(3000);
		dd_po.selectByIndex(0);
		Thread.sleep(3000);
		comment.sendKeys("personal work");
		Select dd_po2= new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		dd_po.selectByIndex(5);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.id("assignBtn"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);	
	}


}