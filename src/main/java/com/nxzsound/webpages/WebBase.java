package com.nxzsound.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBase {
	
	public static WebDriver driver;
	public void OpenBrowser(String browser) {
		if(browser.toLowerCase().contains("Chrome")) {
			driver = new ChromeDriver();
		}else if(browser.toLowerCase().contains("FireFox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new EdgeDriver();
		}
	}
	
	public void OpenWebsite(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	 
	public void Closebrowser() {
		driver.quit();
		
	}

}
