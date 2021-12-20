package com.scuba.helper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterManager {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;

	public static ExtentReports getReports() {


		if(extent==null)
		{
			extent=new ExtentReports();
			spark=new ExtentSparkReporter("target/ExtentReports.html");
			spark.config().setReportName("Regression Run1");
			spark.config().setTheme(Theme.DARK);
			spark.config().setEncoding("utf-8");
			extent.attachReporter(spark);
		}
		return extent;
	}



}
