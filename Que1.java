	package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Que1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.boeing.com/");
		
		
		
	}

}
