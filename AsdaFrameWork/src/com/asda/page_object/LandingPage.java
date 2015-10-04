
package com.asda.page_object;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
		
	}
		
	@Test
	public void clickOnStartShoppingButton(){
	driver.findElement(By.id("startShoppingMain")).click();
			
	}	
		
}

