package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class ShoppingCartPageTN {
	WebDriver driver;
	By homePageNavigation = By.xpath("//a[text()='Qafox.com']");
	By laptopsNotebooksDropDown = By.xpath("//a[text()='Laptops & Notebooks']");
	By laptopsNotebooksDropDownListShowAll = By.xpath("//a[text()='Show AllLaptops & Notebooks']");
	By laptopDetailsNavigation = By.xpath("//img[@class='img-responsive' and @title='HP LP3065']");
	By addToCartButton = By.xpath("//button[@id='button-cart']");
	By shoppingCart = By.xpath("//span[text()='Shopping Cart']");
	By updateQuantity = By.xpath("//input[@size='1']");
	By updateQuantityActionButton = By.xpath("//button[@data-original-title='Update']");
	By updateSuccessMessage = By.xpath("//i[@class='fa fa-check-circle']");
	By estimatedShippingAndTaxes = By.xpath("//a[text()='Estimate Shipping & Taxes ']");
	By countryEstimatateShipping = By.xpath("//select[@id='input-country']");
	By stateEstimatateShipping = By.xpath("//select[@id='input-zone']");
	By postCodeEstimatateShipping = By.xpath("//input[@id='input-postcode']");
	By getQuotes = By.xpath("//button[@id='button-quote']");
	By cancelButtonGetQuotes = By.xpath("//button[text()='Cancel']");
	By flatRateGetQuotesRadioButton = By.xpath("//input[@name='shipping_method']");
	By applyShippingGetQuotes = By.xpath("//input[@id='button-shipping']");
	By applyShippingSuccessMessage = By.xpath("//i[@class='fa fa-check-circle']");
	By checkoutButton = By.xpath("//a[text()='Checkout']");
	By checkoutMainTitle = By.xpath("//h1[text()='Checkout']");

	public ShoppingCartPageTN(WebDriver driver) {
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

	public void verifyShoppingCartClick() {
		UtilitiesTN.buttonClick(driver, shoppingCart);
	}

	public void verifyUpdateQuantity(String value) {
		UtilitiesTN.GivingInputToFieldsAndClear(driver, updateQuantity, value);
	}

	public void verifyUpdateQuantityActionButtonClick() {
		UtilitiesTN.buttonClick(driver, updateQuantityActionButton);
	}

	public Boolean verifyUpdateSuccessMessageDisplayed() {
		Boolean titleDisplayed = UtilitiesTN.isElementDispalyed(driver, updateSuccessMessage);
		return titleDisplayed;
	}

	public void verifyEstimatedShippingAndTaxesClick() {
		UtilitiesTN.buttonClick(driver, estimatedShippingAndTaxes);
	}

	public void verifyEstimatateAndTaxesProvidingCountry(String value) {
		UtilitiesTN.DropdownSelect(driver, countryEstimatateShipping, value);
	}

	public void verifyEstimatateAndTaxesProvidingState(String value) {
		UtilitiesTN.DropdownSelect(driver, stateEstimatateShipping, value);
	}

	public void verifyEstimatateAndTaxesProvidingPostCode(String value) {
		UtilitiesTN.GivingInputToFieldsAndClear(driver, postCodeEstimatateShipping, value);
	}

	public void verifyGetQuoteClick() {
		UtilitiesTN.buttonClick(driver, getQuotes);
	}

	public void verifyCancelButtonGetQuotesClick() {
		UtilitiesTN.buttonClick(driver, cancelButtonGetQuotes);
	}

	public void verifyFlatRateGetQuotesRadioButtonClick() {
		UtilitiesTN.buttonClick(driver, flatRateGetQuotesRadioButton);
	}

	public void verifyApplyShippingGetQuotesButtonClick() {
		UtilitiesTN.buttonClick(driver, applyShippingGetQuotes);
	}

	public Boolean verifyApplyShippingSuccessMessageDisplayed() {
		Boolean titleDisplayed = UtilitiesTN.isElementDispalyed(driver, applyShippingSuccessMessage);
		return titleDisplayed;
	}

	public void verifyCheckoutButtonClick() {
		UtilitiesTN.buttonClick(driver, checkoutButton);
	}

	public String verifyCheckoutMainTitleMessageDisplayed() {
		String titleDisplayed = UtilitiesTN.ReadDisplayedMessage(driver, checkoutMainTitle);
		return titleDisplayed;
	}
}
