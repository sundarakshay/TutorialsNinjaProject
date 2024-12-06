package com.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class HomeTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
		login.verifyLoginProvidingEmailAddress("jagifi3019@datingel.com");
		login.verifyLoginProvidingPassword("Sree@123");
		login.verifyLoginbuttonClick();
	}

	@Test(priority = 1)
	public void verifyItemCartScenarioEmptyTest() {
		home.verifyItemCart();
		String actualAlert = home.verifyItemCartAlertMessage();
		String expectedAlert = "Your shopping cart is empty!";
		Assert.assertEquals(actualAlert, expectedAlert);
		home.verifyItemCart();
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyComponentDropDownTest() {
		home.verifyHomeNavigation();
		home.verifyComponentDropDown();
		home.verifyComponentDropDownFirstOption();
		String actualTitle = home.verifyMiceAndTrackballsMainTitlte();
		String expectedTitle = "Mice and Trackballs";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3, retryAnalyzer = TNRetryListener.class)
	public void verifyFeatureIphoneNavigationTest() {
		home.verifyHomeNavigation();
		home.verifyFeatureIphoneNavigation();
		String actualTitle = home.verifyFeatureIphoneMainTitlte();
		String expectedTitle = "iPhone";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 4, retryAnalyzer = TNRetryListener.class)
	public void verifyInvalidsearchFeature() {
		home.verifyHomeNavigation();
		home.verifySearchHomePageFeature("Kitkat");
		home.verifySearchButtonClick();
		String actualTitle = home.verifyInvalidSearchIphoneResultMessage();
		String expectedTitle = "There is no product that matches the search criteria.";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 5, retryAnalyzer = TNRetryListener.class)
	public void verifyValidsearchFeature() {
		home.verifyHomeNavigation();
		home.verifySearchHomePageFeature("iphone");
		home.verifySearchButtonClick();
		String actualTitle = home.verifyValidSearchIphoneResultMessage();
		String expectedTitle = "iPhone";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
