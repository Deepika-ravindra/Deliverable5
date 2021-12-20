package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.scuba.helper.BrowserFactory;
import com.tests.pages.DashboardPage;
import com.tests.pages.LoginPage;

public class DashBoardPage_PF {

	@Test
	public void SubmitTimeSheet() throws InterruptedException {

		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
		LoginPage	login_page	=PageFactory.initElements(driver,LoginPage.class);
		login_page.loginHRM("Admin", "admin123");
		DashboardPage dbp=PageFactory.initElements(driver, DashboardPage.class);
		dbp.MyTimeSheet();
		dbp.dropDown();
		dbp.timesheets();
		dbp.submitted();
		
	}
}

	

	



