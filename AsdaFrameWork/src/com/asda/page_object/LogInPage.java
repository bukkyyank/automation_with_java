package com.asda.page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends AsdaAbstractPage {

	private String password;
	private String username;
	public LogInPage(WebDriver driver) {
		super(driver);
}
public void enterLogInDetails(){
	driver.findElement(By.partialLinkText("sign-in-button")).click();
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("btn-signIn-accessible")).click();
	
}

}
