
package com.BlackCircles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInClass {

	private WebDriver driver;
	public String welcomeMessage = "Welcome . Dotcom to your";

	public LogInClass(WebDriver driver) {
		this. driver = driver;
	}
	
	
		public void openMyAccount(){
			driver.findElement(By.partialLinkText ("My Account")).click();
		}
		
		
		public void clickLogInButton(String username, String password ){
			driver.findElement(By.name("Email")).sendKeys(username);
			driver.findElement(By.name ("Password")).sendKeys(password);
			driver.findElement(By.name ("submit")).click();
		}
		
		public void verifyThePresenceOf (String message, String welcomeMassage){
			boolean answer = driver.getPageSource().contains(welcomeMessage);
			Assert.assertFalse("The page does not contain welcome message: " + welcomeMessage, answer);
			boolean urlAnswer = driver.getCurrentUrl().contains(message);
			Assert.assertTrue("The URL contains myAccount: ", urlAnswer);
		}

}
