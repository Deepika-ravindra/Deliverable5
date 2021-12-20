package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.scuba.helper.BrowserFactory;
import com.tests.pages.LeavePage;
import com.tests.pages.LoginPage;


public class LeavePage_PF {

	@Test
	public void VerifyAssignLeave() throws InterruptedException {


		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
		LoginPage	login_page	=PageFactory.initElements(driver,LoginPage.class);
		login_page.loginHRM("Admin", "admin123");
		LeavePage lp=PageFactory.initElements(driver,LeavePage.class);
		lp.leave();
		lp.LeaveType();	
	}
}
