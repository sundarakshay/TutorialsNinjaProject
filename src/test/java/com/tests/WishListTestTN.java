package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class WishListTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
		login.verifyLoginProvidingEmailAddress("sundarakshayqq@gmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
		wishList.verifyHomeNavigation();
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() {
		wishList.verifyWishListNavigation();
		String actualTitle = wishList.verifyTitleDisplayed();
		String expectedTitle = "My Wish List";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyWishListPageMainTitleTest() {
		wishList.verifyWishListNavigation();
		String actualTitle = wishList.verifyWishListMainTitle();
		String expectedTitle = "My Wish List";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 3, retryAnalyzer = TNRetryListener.class)
	public void verifyWishListPageSubTitleTest() {
		wishList.verifyWishListNavigation();
		String actualTitle = wishList.verifyWishListSubTitle();
		String expectedTitle = "Your wish list is empty.";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 4, retryAnalyzer = TNRetryListener.class)
	public void verifyAddToWishListTest() {
		wishList.verifyIphoneWishListNavigation();
		wishList.verifyAddToWishList();
		wishList.verifyAddToWishListClose();
	}

	@Test(priority = 5, retryAnalyzer = TNRetryListener.class)
	public void verifyAddToWishListRemoveTest() {
		wishList.verifyIphoneWishListNavigation();
		wishList.verifyAddToWishList();
		wishList.verifyAddToWishListClose();
		wishList.verifyWishListNavigation();
		wishList.verifyAddToWishListRemoveButton();
		wishList.verifyAddToWishListClose();
		String actualTitle = wishList.verifyAddToWishListRemoveMessage();
		String expectedTitle = "Your wish list is empty.";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}