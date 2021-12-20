/**
 * 
 */
package com.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author deepikab
 *
 */
public class LoginPage {
	WebDriver driver;
	@FindBy(id="txtUsername")
	@CacheLookup
	WebElement username;
	@FindBy(how =How.ID,using = "txtPassword")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.XPATH,using = "//input[@id='btnLogin']")
	@CacheLookup
	WebElement login_button;

	public LoginPage(WebDriver driver) {
		this.driver=driver;

	}


	public void loginHRM(String uid, String passwd) {
		username.sendKeys(uid);
		password.sendKeys(passwd);
		login_button.click();
	}






}
