package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class ProductReturnPageTN {
	WebDriver driver;
	By myaccountHomePage = By.xpath("//span[text()='My Account']");
	By orderHistoryHomePage = By.xpath("//a[text()='Order History']");
	By getOrderIdOrderHistory = By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[1]/td[1]");
	By orderDetailsHistoryPage = By.xpath("//a[@data-original-title='View']");
	By productOrderReturnButton = By.xpath("//a[@class='btn btn-danger']");
	By getOrderIdProductReturns = By.xpath("//input[@id='input-order-id']");
	By reasonForReturn = By.xpath("//input[@value='2']");
	By reasonForReturnMessage = By.xpath("//textarea[@id='input-comment']");
	By submitReturnButton = By.xpath("//input[@value='Submit']");
	By productReturnMainTitle = By.xpath("//h1[text()='Product Returns']");
	By productReurnSubTitle = By.xpath(
			"//p[text()='Thank you for submitting your return request. Your request has been sent to the relevant department for processing.']");

	public ProductReturnPageTN(WebDriver driver) {
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

	public void verifyProductOrderReturnButtonClick() {
		UtilitiesTN.buttonClick(driver, productOrderReturnButton);
	}

	public String verifyGetOrderIdOrderHistory() {
		String returnMessage = UtilitiesTN.ReadDisplayedMessage(driver, getOrderIdOrderHistory);
		String OrderNumber = returnMessage.substring(1);
		return OrderNumber;
	}

	public String verifyGetOrderIdProductReturns() {
		String returnMessage = UtilitiesTN.ReadDataFromField(driver, getOrderIdProductReturns);
		return returnMessage;
	}

	public void verifyReasonForReturnClick() {
		UtilitiesTN.buttonClick(driver, reasonForReturn);
	}

	public void verifyReasonForReturnMessage(String value) {
		UtilitiesTN.GivingInputToFields(driver, reasonForReturnMessage, value);
	}

	public void verifySubmitReturnButtonClick() {
		UtilitiesTN.buttonClick(driver, submitReturnButton);
	}

	public String verifyProductReturnMainTitleMessage() {
		String returnMessage = UtilitiesTN.ReadDisplayedMessage(driver, productReturnMainTitle);
		return returnMessage;
	}

	public String verifyProductReturnSubTitleMessage() {
		String returnMessage = UtilitiesTN.ReadDisplayedMessage(driver, productReurnSubTitle);
		return returnMessage;
	}
}
