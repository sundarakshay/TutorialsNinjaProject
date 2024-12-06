package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class OrderHistoryPageTN {
	WebDriver driver;
	By myaccountHomePage = By.xpath("//span[text()='My Account']");
	By orderHistoryHomePage = By.xpath("//a[text()='Order History']");
	By orderDetailsHistoryPage = By.xpath("//a[@data-original-title='View']");
	By orderHistoryMainTitle = By.xpath("//h2[text()='Order History']");

	public OrderHistoryPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public void verifyMyAccountClick() {
		UtilitiesTN.buttonClick(driver, myaccountHomePage);
	}

	public void verifyOrderHistoryClick() {
		UtilitiesTN.buttonClick(driver, orderHistoryHomePage);
	}

	public void verifyOrderDetailsHistoryClick() {
		UtilitiesTN.buttonClick(driver, orderDetailsHistoryPage);
	}

	public String verifyOrderHistoryMainTitleMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, orderHistoryMainTitle);
		return alertMessage;
	}
}
