package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class HomePageTN {
	WebDriver driver;
	By loginMainTitle = By.xpath("//h2[text()='Returning Customer']");
	By searchHomePage = By.xpath("//input[@name='search']");
	By seachButtonHomePage = By.xpath("//span[@class='input-group-btn']");
	By searchValidIphoneResultHomePage = By.xpath("//a[text()='iPhone']");
	By searchInvalidResultHomePage = By.xpath("//p[text()='There is no product that matches the search criteria.']");
	By itemCart = By.xpath("//span[@id='cart-total']");
	By itemCartMessage = By.xpath("//p[text()='Your shopping cart is empty!']");
	By componentsDropDown = By.xpath("//a[text()='Components']");
	By componentsDropDownList = By.xpath("//a[text()='Components']//following::div[1]");
	By componentsDropdownMiceAndTrackballs = By.xpath("//a[text()='Mice and Trackballs (0)']");
	By MicAndTrackballsTitle = By.xpath("//h2[text()='Mice and Trackballs']");
	By iphoneFeatureNavigation = By.xpath("//img[@title='iPhone']");
	By iPhoneTitleCartPage = By.xpath("//h1[text()='iPhone']");
	By homePageNavigation = By.xpath("//a[text()='Qafox.com']");

	public HomePageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public void verifySearchHomePageFeature(String value) {
		UtilitiesTN.GivingInputToFields(driver, searchHomePage, value);
	}

	public void verifySearchButtonClick() {
		UtilitiesTN.buttonClick(driver, seachButtonHomePage);

	}

	public String verifyValidSearchIphoneResultMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, searchValidIphoneResultHomePage);
		return alertMessage;
	}

	public String verifyInvalidSearchIphoneResultMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, searchInvalidResultHomePage);
		return alertMessage;
	}

	public void verifyItemCart() {
		UtilitiesTN.buttonClick(driver, itemCart);
	}

	public String verifyItemCartAlertMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, itemCartMessage);
		return alertMessage;
	}

	public void verifyComponentDropDown() {
		UtilitiesTN.buttonClick(driver, componentsDropDown);
	}

	public void verifyHomeNavigation() {
		UtilitiesTN.buttonClick(driver, homePageNavigation);
	}

	public void verifyComponentDropDownFirstOption() {
		UtilitiesTN.buttonClick(driver, componentsDropdownMiceAndTrackballs);
	}

	public String verifyMiceAndTrackballsMainTitlte() {
		String MiceAndTrackballsMainTitlte = UtilitiesTN.ReadDisplayedMessage(driver, MicAndTrackballsTitle);
		return MiceAndTrackballsMainTitlte;
	}

	public void verifyFeatureIphoneNavigation() {
		UtilitiesTN.buttonClick(driver, iphoneFeatureNavigation);
	}

	public String verifyFeatureIphoneMainTitlte() {
		String FeatureIphoneMainTitlte = UtilitiesTN.ReadDisplayedMessage(driver, iPhoneTitleCartPage);
		return FeatureIphoneMainTitlte;
	}
}
