package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utilities.UtilitiesTN;

import Listeners.TNRetryListener;

public class LogoutTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
	}

	@Test(priority = 1, dataProvider = "data",  retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest(String email, String password) throws InterruptedException {
		login.verifyLoginProvidingEmailAddress(email);
		login.verifyLoginProvidingPassword(password);
		login.verifyLoginbuttonClick();
		logout.verifyMyAccountClick();
		logout.verifyLogoutButtonClick();
		String actual = logout.verifyLogoutMainTitleMessage();
		String expected = "Account Logout";
		Assert.assertEquals(actual, expected);
	}
	
	@DataProvider(name = "data")
	public Object[][] testdata() throws Exception {
		Object[][] retObjArr = UtilitiesTN.readExcel();
		return (retObjArr);
	}
}
