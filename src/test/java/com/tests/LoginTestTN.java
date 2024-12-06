package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class LoginTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() {
		String actualTitle = login.verifyTitleDisplayed();
		String expectedTitle = "Account Login";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginMainTitleTest() {
		Boolean actualBoolean = login.verifyLoginMainTitle();
		Assert.assertEquals(actualBoolean, true);
	}

	@Test(priority = 3, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginSubTitleTest() {

		Boolean actualBoolean = login.verifyLoginSubTitle();
		Assert.assertEquals(actualBoolean, true);
	}

	@Test(priority = 4, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginButtonWithoutAnyTest() {
		login.verifyLoginbuttonClick();
		String actualErrorMessage = login.verifyLoginWarningErrorMessage();
		String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@Test(priority = 5, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginButtonWithEmailTest() {
		login.verifyLoginProvidingEmailAddress("testmail@test.com");
		login.verifyLoginbuttonClick();
		String actualErrorMessage = login.verifyLoginWarningErrorMessage();
		String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@Test(priority = 6, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginButtonWithPasswordTest() {
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
		String actualErrorMessage = login.verifyLoginWarningErrorMessage();
		String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@Test(priority = 7, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginButtonWithInvalidDetailsTest() {
		login.verifyLoginProvidingEmailAddress("testmail"+login.generateUUID()+"@testmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
		String actualErrorMessage = login.verifyLoginWarningErrorMessage();
		String expectedErrorMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}

	@Test(priority = 8, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginPageContinueButtonNavigationTest() {
		login.verifyContinuebuttonClick();
		String actualRegisterTitle = login.verifyLoginPageContinueButtonNavigation();
		String expectedRegisterTitle = "Register Account";
		Assert.assertEquals(actualRegisterTitle, expectedRegisterTitle);
	}

	@Test(priority = 9, retryAnalyzer = TNRetryListener.class)
	public void verifyLoginButtonWithAllDetailsTest() {
		login.verifyLoginProvidingEmailAddress("sundarakshayqq@gmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
		String actualErrorMessage = login.verifyLoginButtonWithAllDetails();
		String expectedErrorMessage = "My Account";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
	}
}
