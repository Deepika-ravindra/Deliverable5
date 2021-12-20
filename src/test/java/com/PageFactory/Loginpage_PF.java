package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.scuba.helper.BrowserFactory;
import com.tests.pages.LoginPage;

public class Loginpage_PF {



	@Test
	public void TestValidLogin() {

		WebDriver driver=BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
		LoginPage	login_page	=PageFactory.initElements(driver,LoginPage.class);
        login_page.loginHRM("Admin", "admin123");
        
        driver.quit();







	}









}
