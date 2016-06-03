package com.homepage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	 
	
	public void pageVerification(WebDriver driver) throws InterruptedException {
		
		
		
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		
		String title = driver.getTitle();
		WebElement button = (WebElement) driver.findElement(By.id("btnExplore"));
		
		Assert.assertEquals("http://www.srilankan.com/", url);
		Assert.assertEquals("Select Your Country", title);
		Assert.assertEquals(true, button.isDisplayed());
		
		Thread.sleep(3000);
		 
		WebElement dropdown = driver.findElement(By.xpath(".//*[@id='countryDropDown_msdd']/div[1]/span[2]"));
		dropdown.click();
		Thread.sleep(3000);
		WebElement dropdown_value = driver.findElement(By.xpath(".//*[@id='countryDropDown_child']/ul/li[5]/span"));
		dropdown_value.sendKeys("Germany");
		Thread.sleep(3000);
		WebElement select_country = driver.findElement(By.xpath(".//*[@id='countryDropDown_child']/ul/li[5]"));
		select_country.click();
		
		button.click();
		
	}

}
