package com.live.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 public class BukkyPage {
   WebDriver driver = new FirefoxDriver();
 
 public void BukkyPage(WebDriver driver){
   this.driver = driver;	
}
 public void LogIn(){
	driver.findElements(By.id("password"));
}
}
