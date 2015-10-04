package com.asda.page_object;

import org.openqa.selenium.WebDriver;

public class AsdaAbstractPage {
	
public WebDriver driver;
private String base_url = "htttp//asda.com";
 public AsdaAbstractPage(WebDriver driver){
	this.driver = driver;
}
public void openAndMaximiseBrowser() throws InterruptedException{
  driver.navigate().to(base_url);	
driver.manage().window().maximize();
Thread.sleep(6000);
}
public void tearDown(){
	driver.quit();
}

}
