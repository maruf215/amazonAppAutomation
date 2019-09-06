package com.amazonApp.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonApp.commonLibraries.assertion.AssertionHelper;
import com.amazonApp.commonLibraries.browserConfiguration.config.ObjectReader;
import com.amazonApp.commonLibraries.logger.LoggerHelper;
import com.amazonApp.commonLibraries.testbase.TestBase;
import com.amazonApp.commonLibraries.wait.WaitHelper;

/**
 * 
 * @author Towfiqur Rahman
 */
public class SearchItemPage {

	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(SearchItemPage.class);
	WaitHelper waitHelper;

	public SearchItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		TestBase.logExtentReport("NavigationMenu object created");
	}
	
	//*[@id="a-autoid-0-announce"]
	//*[@id="s-result-sort-select_2"]
	

	@FindBy(id = "a-autoid-0-announce")
	WebElement sortByFeatured;
	
	@FindBy(id = "s-result-sort-select_2")
	WebElement highToLow;

	@FindBy(xpath = "//div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div/div/h2/a/span")
	public WebElement secondProduct;

	@FindBy(id = "productTitle")
	WebElement productTopicTitle;

	public void productDetails() {

		sortByFeatured.click();
		highToLow.click();
		secondProduct.click();
		String s1 = "Nikon D3X";
		String s2 = productTopicTitle.getText();
		AssertionHelper.verifyPartialText(s1, s2);

	}

}
