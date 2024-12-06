package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.utilities.UtilitiesTN;

public class LoginPageTN {
	WebDriver driver;
	By loginMainTitle = By.xpath("//h2[text()='Returning Customer']");
	By loginSubTitle = By.xpath("//strong[text()='I am a returning customer']");
	By emailAddressLogin = By.id("input-email");
	By passwordLogin = By.id("input-password");
	By loginButton = By.xpath("//input[@value='Login']");
	By warningErrorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By loginContinuebutton = By.xpath("//a[text()='Continue']");
	By registerAccountTitle = By.xpath("//h1[text()='Register Account']");
	By myAccount = By.xpath("//h2[text()='My Account']");

	public LoginPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public Boolean verifyLoginMainTitle() {
		Boolean loginMainTitleDisplayed = UtilitiesTN.isElementDispalyed(driver, loginMainTitle);
		return loginMainTitleDisplayed;
	}

	public Boolean verifyLoginSubTitle() {
		Boolean loginSubTitleDisplayed = UtilitiesTN.isElementDispalyed(driver, loginSubTitle);
		return loginSubTitleDisplayed;
	}

	public void verifyLoginProvidingEmailAddress(String value) {
		UtilitiesTN.GivingInputToFields(driver, emailAddressLogin, value);
	}

	public void verifyLoginProvidingPassword(String value) {
		UtilitiesTN.GivingInputToFields(driver, passwordLogin, value);
	}

	public void verifyLoginbuttonClick() {
		UtilitiesTN.buttonClick(driver, loginButton);
	}

	public String verifyLoginWarningErrorMessage() {
		String loginErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, warningErrorMessage);
		return loginErrorMessage;
	}

	public void verifyContinuebuttonClick() {
		UtilitiesTN.buttonClick(driver, loginContinuebutton);
	}

	public String verifyLoginPageContinueButtonNavigation() {
		String registerMainTitle = UtilitiesTN.ReadDisplayedMessage(driver, registerAccountTitle);
		return registerMainTitle;
	}

	public String verifyLoginButtonWithAllDetails() {
		String myAccountMainTitle = UtilitiesTN.ReadDisplayedMessage(driver, myAccount);
		return myAccountMainTitle;
	}
	
	public String generateUUID() {
		return UUID.randomUUID().toString();
	}
}
