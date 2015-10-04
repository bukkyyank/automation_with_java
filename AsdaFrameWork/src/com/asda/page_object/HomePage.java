package com.asda.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
			
	}
	public void clickShopNowButton(){
	driver.findElement(By.xpath("//*[@id='carousel']/div[1]/div/div[1]/div/div/a")).click();
			
	}
	
}
