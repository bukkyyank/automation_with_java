
package com.live.magento.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends AbstractPage{

 
 public WelcomePage(WebDriver driver) {
  super(driver);
  
 }
public void verifyLogin () {
   boolean test1 = driver.getPageSource().contains(config.getProperty("name"));
   Assert.assertTrue("the test could not find the name: "+ config.getProperty("name"),test1);
   logger.info("name has been verified");
   boolean test2 = driver.getPageSource().contains(config.getProperty("username"));
   Assert.assertTrue("the test could not find the username: "+ config.getProperty("username"),test2);
  
   logger.info("username has been verified");
  }


	
}
