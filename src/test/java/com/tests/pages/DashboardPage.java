package com.tests.pages;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DashboardPage {

	WebDriver driver;
	@FindBy(xpath="//tbody/tr[1]/td[6]/div[1]/a[1]/img[1]")
	WebElement mytimesheet;
	@FindBy(id="btnEdit")
	WebElement editbtn;
	@FindBy(id="initialRows_0_toDelete")
	WebElement checkbox;
	@FindBy(id="initialRows_0_projectName")
	WebElement projectname;

	@FindBy(how=How.XPATH,using = "//body/div[4]/ul[1]/li[3] ")
	WebElement dropDowns;
	@FindBy(className = "projectActivity")
	WebElement projactivity;
	@FindBy(id="initialRows_0_0")
	WebElement mon;
	@FindBy(id="initialRows_0_1")
	WebElement tue;
	@FindBy(id="initialRows_0_2")
	WebElement wed;
	@FindBy(name = "initialRows[0][3]")
	WebElement thu;
	@FindBy(name = "initialRows[0][4]")
	WebElement fri;
	@FindBy(name = "initialRows[0][5]")
	WebElement sat;
	@FindBy(name = "initialRows[0][6]")
	WebElement sun;
	@FindBy(name = "btnSave")
	WebElement saBtn;
	@FindBy(id="btnSubmit")
	WebElement subBtn;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}

	public void MyTimeSheet() throws InterruptedException {
		mytimesheet.click();
		editbtn.click();
		checkbox.click();
		projectname.click();
		projectname.sendKeys(" ");
		Thread.sleep(2000);
		dropDowns.click();
		projactivity.click();
	}
	public void dropDown() throws InterruptedException {

		Select dd_po= new Select(driver.findElement(By.id("initialRows_0_projectActivityName")));
		Thread.sleep(3000);
		dd_po.selectByVisibleText("Feature Development");
	}
	public void timesheets() throws InterruptedException {
		mon.sendKeys("8");
		tue.sendKeys("8");
		wed.sendKeys("8");
		thu.sendKeys("8");
		fri.sendKeys("8");
		sat.sendKeys("8");
		sun.sendKeys("8");
		saBtn.click();
		Thread.sleep(4000);
		subBtn.click();
		Thread.sleep(6000);
	}
	public  void submitted() throws InterruptedException {
		Thread.sleep(4000);
		WebElement Submitted=driver.findElement(By.xpath("//em[@id='timesheet_status']"));
		System.out.println("Submitted");
		Thread.sleep(6000);
		Boolean verifyTitle=driver.getTitle().equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet");
		System.out.println("Boolean value of verifyTitle==:"+verifyTitle);
		Assert.assertTrue(verifyTitle);
     

		
		
	}
	
		



}