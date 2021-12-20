package com.tests.extentReports;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.scuba.helper.BrowserFactory;
import com.scuba.helper.ExtentReporterManager;
import com.scuba.helper.WebUtils;
import com.tests.pages.DashboardPage;
import com.tests.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	@Test
	public void login2() throws IOException, InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		extent =ExtentReporterManager.getReports();
		ExtentTest test	=extent.createTest("Login Test");
		test.log(Status.INFO,"Starting the test case");
		WebDriver driver1=BrowserFactory.startBrowser("chrome","https://opensource-demo.orangehrmlive.com/");
		test.log(Status.INFO,"opening the browser");
		LoginPage login_page=PageFactory.initElements(driver1,LoginPage.class);
		test.pass("Navigated to HRM website loginPage");
		test.log(Status.INFO," Entering the credentials");
		login_page.loginHRM("Admin", "admin123");
		test.pass("Login in to Hrm page got completed");
		DashboardPage dbp=PageFactory.initElements(driver1, DashboardPage.class);
		test.pass("Navigated to dashboard page");
		dbp.MyTimeSheet();
		WebUtils.takeSnapshot(driver1, "C:/Users/deepikab/eclipse-workspace--MavenSeleniumWk3/ScubaDeliverable4/target/screenshots.png");
		TakesScreenshot scrShot =((TakesScreenshot)driver1);
		dbp.dropDown();
		dbp.timesheets();
		dbp.submitted();
		extent.flush();
		extent.flush();

	}
}

