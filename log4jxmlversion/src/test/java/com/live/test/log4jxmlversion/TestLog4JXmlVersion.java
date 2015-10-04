package com.live.test.log4jxmlversion;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLog4JXmlVersion {

	public static Logger logger = LogManager.getLogger("fileAppender");
	protected static WebDriver driver;

	public static void main(String[] args) {
		DOMConfigurator.configure(
				"C:\\Automation\\workspace\\eclipseworkspace\\log4jxmlversion\\src\\main\\resources\\log4j.xml");

		try {

			driver = new FirefoxDriver();
			logger.info("Browser has been intatiated and luched succesfully");
			driver.get("http://live.guru99.com");
			logger.info("Web browser has benn loaded  succesfully");

			logger.error("Error occured");
			logger.warn("This is a warning excample");
			logger.debug("This is a debug excample");
		}

		catch (Throwable t) {
			logger.error("This is throwable excample");

		}
	}
}