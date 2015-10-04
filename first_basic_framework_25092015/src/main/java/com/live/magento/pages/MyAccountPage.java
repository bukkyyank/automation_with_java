package com.live.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends AbstractPage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	public void loginWith() {
		driver.findElement(By.id("email")).sendKeys(config.getProperty("username"));
		logger.info("Username has been entered succesfully");
		driver.findElement(By.id("pass")).sendKeys(config.getProperty("password"));
		logger.info("Password has been entered succesfully");
		driver.findElement(By.id("send2")).click();
		logger.info("LogIn button has been clicked succesfully");
	}
}