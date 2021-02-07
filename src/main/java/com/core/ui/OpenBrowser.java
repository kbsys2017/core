package com.core.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public void openPage() {
		
		WebDriver driver = new ChromeDriver();
		
		///driver.get()
		
		driver.get("https://google.com");
		driver.quit();
		
	System.out.println("test");
		
	}

}
