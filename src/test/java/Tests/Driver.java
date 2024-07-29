package Tests;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Utilities.ExcelReader;


public class Driver {
	public static WebDriver driver;
	//public static ExcelReader excel = new ExcelReader("C:\\Users\\BEMANASA\\eclipse-workspace\\SauceDemo_1\\src\\test\\resources\\Excel\\SauceAddress.xlsx");
	@BeforeSuite
	public void browserSetup() {
			
			System.setProperty("WebDriver.Edge.driver","C://Users//BEMANASA//Downloads//edgedriver_win64//msedgedriver.exe");
			//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe"); 
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		 }
			@AfterSuite
			public void CloseBrowser() {
				if(driver!=null) {
					driver.quit();
				}
			}
	}

