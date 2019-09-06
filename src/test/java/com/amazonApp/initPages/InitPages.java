package com.amazonApp.initPages;



import org.openqa.selenium.WebDriver;

import com.amazonApp.pageObject.HomePage;
import com.amazonApp.pageObject.SearchItemPage;




public class InitPages {
	
	private WebDriver driver;
	public HomePage homePageObject;
	public SearchItemPage searchItemPageObject;
	
	
	public InitPages(WebDriver driver) {
		_initPage(driver);
		
	}

	private void _initPage(WebDriver driver) {
		
		homePageObject = new HomePage(driver);
		searchItemPageObject = new SearchItemPage(driver);
		
	}
	
	
	

}
