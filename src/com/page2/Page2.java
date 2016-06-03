package com.page2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page2 {
	
	public void urlVerification( WebDriver driver) throws InterruptedException{
		driver.getCurrentUrl();
	String page2_url = driver.getCurrentUrl();
	Assert.assertEquals("http://www.srilankan.com/de_de/de", page2_url);
	
	WebElement logIn = driver.findElement(By.id("logIn"));
	logIn.click();
	Thread.sleep(1000);
	
	WebElement joinNow = driver.findElement(By.xpath(".//*[@id='divFlySmiles']/div/label/a"));
	joinNow.click();
	
	}

}
