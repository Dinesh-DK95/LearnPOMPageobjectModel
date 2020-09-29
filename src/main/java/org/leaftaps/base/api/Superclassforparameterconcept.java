package org.leaftaps.base.api;

import org.testng.annotations.Test;

import org.leaftaps.utils.ReadExcel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Superclassforparameterconcept {
	public static ChromeDriver driver;
	public  String excelname;
	
	@Parameters({"url"})
	@BeforeMethod
	public void Login(String url ) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Remaining code are in pom pages
		
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.close();

	}

	@DataProvider
	public String[] [] providedata() throws IOException {
		// to get excel data we have already created read excel class and calling here
		ReadExcel data = new ReadExcel();
		return data.readexcel(excelname);
		/*
		 * //First set of data , first row and cols data [0][0] = "TL"; data [0][1] =
		 * "DK"; data [0][2] = "M"; data [0][3] = "5454";
		 * 
		 * //Second set of data , second rows and cols data [1][0] = "TL"; data [1][1] =
		 * "Deekay"; data [1][2] = "M"; data [1][3] = "888888888";
		 * 
		 * return data;
		 */
	}
}
