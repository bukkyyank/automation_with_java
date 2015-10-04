package com.live.magento.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected static WebDriver driver;
	protected static Properties config = new Properties();
	protected static FileInputStream fis;
	protected static Logger logger = LogManager.getLogger("TestLogger");

	public AbstractPage(WebDriver driver) {
		this.driver = driver;

		try {
			fis = new FileInputStream(
					"C:\\Automation\\workspace\\eclipseworkspace\\first_basic_framework_25092015\\src\\main\\resources\\testDataRepo.properties");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void openAndMaximizeBrowser() {
		driver.manage().window().maximize();
		logger.info("browser has been maximized");
		driver.navigate().to(config.getProperty("base_url"));
		logger.info("the web address has been loaded succesfully");

	}

	public void tearDown() {
		driver.quit();
		logger.info("the browser has now closed");
		driver = null;
		logger.info("the browser has no value anymore");
	}
}
	/*public void getProcessedWebAddress() {
		String  guru99 = "http://live.guru99.com";
		String suffix = "guru99.com";
		if (guru99.contains("live.guru99")){
			driver.get(guru99);
			logger.info("The web address has been enter sucessfully");
		}else if(guru99.equalsIgnoreCase(guru99)){
			driver.navigate().to(guru99);
			logger.info("The web address has been enter sucessfully");
		}else if(guru99.endsWith(suffix)){
			driver.navigate().to("The web address has been enter sucessfully");
			logger.info("The web address has been enter sucessfully");
		}else{
			logger.error("The web address does not exist");
			camera.takeShot("getProcessedWebAddress");
		}
		}
		}*/





