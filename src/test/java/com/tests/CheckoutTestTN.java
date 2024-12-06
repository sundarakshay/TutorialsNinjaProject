package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class CheckoutTestTN extends BaseTestTN {

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
		checkout.verifyHomeNavigation();
		checkout.verifyLaptopsNotebooksDropDownNavigation();
		checkout.verifyLaptopsNotebooksDropDownListShowAllNavigation();
		checkout.verifyLaptopDetailsNavigation();
		checkout.verifyaddToCartButtonClick();
		checkout.verifyaddToShoppingCartNavigation();
		checkout.verifycheckoutButtonNavigation();
		String actual = checkout.verifyTitleDisplayed();
		String expected = "Checkout";
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyCheckOutFlowTest() {
		checkout.verifyHomeNavigation();
		checkout.verifyLaptopsNotebooksDropDownNavigation();
		checkout.verifyLaptopsNotebooksDropDownListShowAllNavigation();
		checkout.verifyLaptopDetailsNavigation();
		checkout.verifyaddToCartButtonClick();
		checkout.verifyaddToShoppingCartNavigation();
		checkout.verifycheckoutButtonNavigation();
		checkout.verifynewAddressRadioSelectionBillDetails();
		checkout.verifyBillingDetailsProvidingFirstName("Test FirstName");
		checkout.verifyBillingDetailsProvidingLastName("Test LastName");
		checkout.verifyBillingDetailsProvidingCompany("Test Company");
		checkout.verifyBillingDetailsProvidingAddressOne("Test First Line Address");
		checkout.verifyBillingDetailsProvidingAddressTwo("Test Second Line Address");
		checkout.verifyBillingDetailsProvidingCity("Test City");
		checkout.verifyBillingDetailsProvidingPostCode("956283");
		checkout.verifyBillingDetailsProvidingCountry("223");
		checkout.verifyBillingDetailsProvidingState("3514");
		checkout.verifycontinueBillDetailsClick();
		checkout.verifycontinueDeliveryDetailsClick();
		checkout.verifycontinueDeliveryMethodClick();
		checkout.verifytermsAndConditionPaymentMethodClick();
		checkout.verifycontinuePaymentMethodClick();
		checkout.verifycontinueConfirmOrderClick();
		String actualTitle = checkout.verifyOrderConfirmationMainTitlte();
		String expectedTitle = "Your order has been placed!";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
