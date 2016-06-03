package com.joinnow;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JoinNow {
	
	public void newPageVerification( WebDriver driver) throws InterruptedException{
		driver.getCurrentUrl();
	String page3_url = driver.getCurrentUrl();
	Assert.assertEquals("https://www.flysmiles.com/home/register", page3_url);
	
	Thread.sleep(4000);
	
	WebElement radio_button = (WebElement) driver.findElement(By.xpath(".//*[@id='rdmemno']"));
	WebElement UL_button = (WebElement) driver.findElement(By.id(".//*[@id='txtusernamerg']"));
	
	
	Assert.assertEquals(true, radio_button.isDisplayed());
	Assert.assertEquals(true, UL_button.isDisplayed());
}
}