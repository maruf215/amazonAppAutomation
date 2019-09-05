package com.amazonApp.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonApp.commonLibraries.assertion.VerificationHelper;
import com.amazonApp.commonLibraries.browserConfiguration.config.ObjectReader;
import com.amazonApp.commonLibraries.logger.LoggerHelper;
import com.amazonApp.commonLibraries.testbase.TestBase;
import com.amazonApp.commonLibraries.wait.WaitHelper;
import com.aventstack.extentreports.Status;

/**
 * 
 * @author Towfiqur Rahman
 */
public class HomePage {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(HomePage.class);
	WaitHelper waitHelper;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		TestBase.logExtentReport("Amazon Home Page Object Created");
	}

	@FindBy(id = "twotabsearchtextbox")
	WebElement serchProductEditField;

	@FindBy(xpath = "//div[3]/div/form/div[2]/div/input")
	public WebElement serchIcon;

	public void searchItem() {

		serchProductEditField.sendKeys("Nikon");
		serchIcon.click();

	}

}
