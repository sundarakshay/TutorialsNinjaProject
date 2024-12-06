package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class ShoppingCartTestTN extends BaseTestTN {
	String loginUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(loginUrl);
		login.verifyLoginProvidingEmailAddress("sundarakshayqq@gmail.com");
		login.verifyLoginProvidingPassword("tutorialsninja@123");
		login.verifyLoginbuttonClick();
		shoppingcart.verifyHomeNavigation();
		shoppingcart.verifyLaptopsNotebooksDropDownNavigation();
		shoppingcart.verifyLaptopsNotebooksDropDownListShowAllNavigation();
		shoppingcart.verifyLaptopDetailsNavigation();
		shoppingcart.verifyaddToCartButtonClick();
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() {
		shoppingcart.verifyShoppingCartClick();
		String actual = shoppingcart.verifyTitleDisplayed();
		String expected = "Shopping Cart";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyUpdateQuantityTest() {
		shoppingcart.verifyShoppingCartClick();
		shoppingcart.verifyUpdateQuantity("10");
		shoppingcart.verifyUpdateQuantityActionButtonClick();
		Boolean actual = shoppingcart.verifyUpdateSuccessMessageDisplayed();
		Assert.assertEquals(actual, true);
	}

	@Test(priority = 3, retryAnalyzer = TNRetryListener.class)
	public void verifyEstimateShippingAndTexasTest() throws InterruptedException {
		shoppingcart.verifyShoppingCartClick();
		shoppingcart.verifyUpdateQuantity("2");
		shoppingcart.verifyUpdateQuantityActionButtonClick();
		Thread.sleep(5000);
		shoppingcart.verifyEstimatedShippingAndTaxesClick();
		shoppingcart.verifyEstimatateAndTaxesProvidingCountry("173");
		shoppingcart.verifyEstimatateAndTaxesProvidingState("2674");
		shoppingcart.verifyEstimatateAndTaxesProvidingPostCode("77007");
		shoppingcart.verifyGetQuoteClick();
		shoppingcart.verifyCancelButtonGetQuotesClick();
		Thread.sleep(5000);
		shoppingcart.verifyGetQuoteClick();
		Thread.sleep(5000);
		shoppingcart.verifyFlatRateGetQuotesRadioButtonClick();
		shoppingcart.verifyApplyShippingGetQuotesButtonClick();
		Boolean actualMessage = shoppingcart.verifyApplyShippingSuccessMessageDisplayed();
		Assert.assertEquals(actualMessage, true);
	}

	@Test(priority = 4,retryAnalyzer = TNRetryListener.class)
	public void verifyCheckoutButtonTest() {
		shoppingcart.verifyShoppingCartClick();
		shoppingcart.verifyCheckoutButtonClick();
		String actualTitle = shoppingcart.verifyCheckoutMainTitleMessageDisplayed();
		String expectedTitle = "Checkout";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
