package com.util;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.homepage.Home;
import com.joinnow.JoinNow;
import com.page2.Page2;

public class Test {
	
	static WebDriver driver;
	static Home home; 
	static Page2 page2;
	static JoinNow joinNow;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new FirefoxDriver();
		home = new Home();
		page2 = new Page2();
		joinNow = new JoinNow();
		
		driver.get("http://www.srilankan.com/");
		home.pageVerification(driver);
		Thread.sleep(2000);
		page2.urlVerification(driver);
		
		
		
		String base = driver.getWindowHandle();
		  Set<String> set = driver.getWindowHandles();

		  set.remove(base);
		  assert set.size() == 1;
		  driver.switchTo().window((String) set.toArray()[0]);
		joinNow.newPageVerification(driver);
		
		System.out.println("hhhhf");
		
	}

}
