package br.accenture.runners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

private static WebDriver driver;
	
	public static WebDriver getDriver(){
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver", ".\\bin\\windows\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}

	
	public static void killDriver(){
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}