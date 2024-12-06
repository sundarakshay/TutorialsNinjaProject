package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class CheckoutPageTN {
	WebDriver driver;
	By homePageNavigation = By.xpath("//a[text()='Qafox.com']");
	By laptopsNotebooksDropDown = By.xpath("//a[text()='Laptops & Notebooks']");
	By laptopsNotebooksDropDownListShowAll = By.xpath("//a[text()='Show AllLaptops & Notebooks']");
	By laptopDetailsNavigation = By.xpath("//img[@class='img-responsive' and @title='HP LP3065']");
	By addToCartButton = By.xpath("//button[@id='button-cart']");
	By addToShoppingCartNavigation = By.xpath("//a[text()='shopping cart']");
	By checkoutButton = By.xpath("//a[text()='Checkout']");
	By newAddressBillDetails = By.xpath("//input[@value='new']");
	By firstNameBillDetails = By.xpath("//input[@id='input-payment-firstname']");
	By lastNameBillDetails = By.xpath("//input[@id='input-payment-lastname']");
	By companyBillDetails = By.xpath("//input[@id='input-payment-company']");
	By addressOneBillDetails = By.xpath("//input[@id='input-payment-address-1']");
	By addressTwoBillDetails = By.xpath("//input[@id='input-payment-address-2']");
	By cityBillDetails = By.xpath("//input[@id='input-payment-city']");
	By postCodeBillDetails = By.xpath("//input[@id='input-payment-postcode']");
	By countryBillDetails = By.xpath("//select[@id='input-payment-country']");
	By stateBillDetails = By.xpath("//select[@id='input-payment-zone']");
	By continueBillDetails = By.xpath("//input[@id='button-payment-address']");
	By continueDeliveryDetails = By.xpath("//input[@id='button-shipping-address']");
	By continueDeliveryMethod = By.xpath("//input[@id='button-shipping-method']");
	By termsAndConditionPaymentMethod = By.xpath("//input[@type='checkbox']");
	By continuePaymentMethod = By.xpath("//input[@id='button-payment-method']");
	By continueConfirmOrder = By.xpath("//input[@id='button-confirm']");
	By orderConfirmationMainTitle = By.xpath("//h1[text()='Your order has been placed!']");

	public CheckoutPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public void verifyHomeNavigation() {
		UtilitiesTN.buttonClick(driver, homePageNavigation);
	}

	public void verifyLaptopsNotebooksDropDownNavigation() {
		UtilitiesTN.buttonClick(driver, laptopsNotebooksDropDown);
	}

	public void verifyLaptopsNotebooksDropDownListShowAllNavigation() {
		UtilitiesTN.buttonClick(driver, laptopsNotebooksDropDownListShowAll);
	}

	public void verifyLaptopDetailsNavigation() {
		UtilitiesTN.buttonClick(driver, laptopDetailsNavigation);
	}

	public void verifyaddToCartButtonClick() {
		UtilitiesTN.buttonClick(driver, addToCartButton);
	}

	public void verifyaddToShoppingCartNavigation() {
		UtilitiesTN.buttonClick(driver, addToShoppingCartNavigation);
	}

	public void verifycheckoutButtonNavigation() {
		UtilitiesTN.buttonClick(driver, checkoutButton);
	}

	public void verifynewAddressRadioSelectionBillDetails() {
		UtilitiesTN.buttonClick(driver, newAddressBillDetails);
	}

	public void verifyBillingDetailsProvidingFirstName(String value) {
		UtilitiesTN.GivingInputToFields(driver, firstNameBillDetails, value);
	}

	public void verifyBillingDetailsProvidingLastName(String value) {
		UtilitiesTN.GivingInputToFields(driver, lastNameBillDetails, value);
	}

	public void verifyBillingDetailsProvidingCompany(String value) {
		UtilitiesTN.GivingInputToFields(driver, companyBillDetails, value);
	}

	public void verifyBillingDetailsProvidingAddressOne(String value) {
		UtilitiesTN.GivingInputToFields(driver, addressOneBillDetails, value);
	}

	public void verifyBillingDetailsProvidingAddressTwo(String value) {
		UtilitiesTN.GivingInputToFields(driver, addressTwoBillDetails, value);
	}

	public void verifyBillingDetailsProvidingCity(String value) {
		UtilitiesTN.GivingInputToFields(driver, cityBillDetails, value);
	}

	public void verifyBillingDetailsProvidingPostCode(String value) {
		UtilitiesTN.GivingInputToFields(driver, postCodeBillDetails, value);
	}

	public void verifyBillingDetailsProvidingCountry(String value) {
		UtilitiesTN.DropdownSelect(driver, countryBillDetails, value);
	}

	public void verifyBillingDetailsProvidingState(String value) {
		UtilitiesTN.DropdownSelect(driver, stateBillDetails, value);
	}

	public void verifycontinueBillDetailsClick() {
		UtilitiesTN.buttonClick(driver, continueBillDetails);
	}

	public void verifycontinueDeliveryDetailsClick() {
		UtilitiesTN.buttonClick(driver, continueDeliveryDetails);
	}

	public void verifycontinueDeliveryMethodClick() {
		UtilitiesTN.buttonClick(driver, continueDeliveryMethod);
	}

	public void verifytermsAndConditionPaymentMethodClick() {
		UtilitiesTN.buttonClick(driver, termsAndConditionPaymentMethod);
	}

	public void verifycontinuePaymentMethodClick() {
		UtilitiesTN.buttonClick(driver, continuePaymentMethod);
	}

	public void verifycontinueConfirmOrderClick() {
		UtilitiesTN.buttonClick(driver, continueConfirmOrder);
	}

	public String verifyOrderConfirmationMainTitlte() {
		String titleDisplayed = UtilitiesTN.ReadDisplayedMessage(driver, orderConfirmationMainTitle);
		return titleDisplayed;
	}
}
