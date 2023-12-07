package com.QALegendBilling.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.QALegendBilling.utilities.TestHelperUtility;

public class AddNewProductPage1 extends TestHelperUtility {
	public WebDriver driver;

	public AddNewProductPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}