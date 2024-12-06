package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class OrderHistoryTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
		login.verifyLoginProvidingEmailAddress("sundarakshayqq@gmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() {
		orderhistory.verifyMyAccountClick();
		orderhistory.verifyOrderHistoryClick();
		String actual = orderhistory.verifyTitleDisplayed();
		String expected = "Order History";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyOrderHistoryTest() throws InterruptedException {
		orderhistory.verifyMyAccountClick();
		orderhistory.verifyOrderHistoryClick();
		orderhistory.verifyOrderDetailsHistoryClick();
		String actual = orderhistory.verifyOrderHistoryMainTitleMessage();
		String expected = "Order History";
		Assert.assertEquals(actual, expected);
	}
}
