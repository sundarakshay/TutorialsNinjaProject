package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Listeners.TNRetryListener;

public class ProductReturnTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
		login.verifyLoginProvidingEmailAddress("sundarakshayqq@gmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() throws InterruptedException {
		productreturn.verifyMyAccountClick();
		productreturn.verifyOrderHistoryClick();
		productreturn.verifyOrderDetailsHistoryClick();
		productreturn.verifyProductOrderReturnButtonClick();
		String actual = productreturn.verifyTitleDisplayed();
		String expected = "Product Returns";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyProductReturnTest() {
		productreturn.verifyMyAccountClick();
		productreturn.verifyOrderHistoryClick();
		String actualOrderIdFromOrderHistory = productreturn.verifyGetOrderIdOrderHistory();
		productreturn.verifyOrderDetailsHistoryClick();
		productreturn.verifyProductOrderReturnButtonClick();
		String expectedOrderIdFromProductReturn = productreturn.verifyGetOrderIdProductReturns();
		productreturn.verifyReasonForReturnClick();
		productreturn.verifyReasonForReturnMessage("No more needed, purchased wrong product");
		productreturn.verifySubmitReturnButtonClick();
		String actualMainTitle = productreturn.verifyProductReturnMainTitleMessage();
		String actualSubTitle = productreturn.verifyProductReturnSubTitleMessage();
		String expectedMainTitle = "Product Returns";
		String expectedSubTitle = "Thank you for submitting your return request. Your request has been sent to the relevant department for processing.";
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualOrderIdFromOrderHistory, expectedOrderIdFromProductReturn);
		softAssert.assertEquals(actualMainTitle, expectedMainTitle);
		softAssert.assertEquals(actualSubTitle, expectedSubTitle);
		softAssert.assertAll();
	}
}