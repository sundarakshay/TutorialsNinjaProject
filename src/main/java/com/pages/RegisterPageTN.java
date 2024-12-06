package com.pages;

import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class RegisterPageTN {
	WebDriver driver;
	By registerAccountMainTitle = By.xpath("//h1[text()='Register Account']");
	By registerAccountSubTitle = By.xpath("//legend[text()='Your Personal Details']");
	By continueRegisterButton = By.xpath("//input[@value='Continue']");
	By firstnameRegister = By.id("input-firstname");
	By firstnameRegsiterErrorMessage = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	By lastnameRegister = By.id("input-lastname");
	By lastnameRegisterErrorMessage = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	By emailRegister = By.id("input-email");
	By emailRegisterErrorMessage = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	By telephoneRegister = By.id("input-telephone");
	By telephoneRegisterErrorMessage = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	By passwordRegister = By.id("input-password");
	By passwordRegisterErrorMessage = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	By confirmPasswordRegister = By.id("input-confirm");
	By confirmPasswordRegisterErrorMessage = By.xpath("//div[text()='Password confirmation does not match password!']");
	By privacyPolicyRegister = By.xpath("//input[@type='checkbox']");
	By privacyPolicyRegisterErrorMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	By successfullyCreatedMessage = By.xpath("//h1[text()='Your Account Has Been Created!']");
	By accountCreatedContinuebutton = By.xpath("//a[text()='Continue']");

	public RegisterPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public Boolean verifyRegisterPageMainTitle() {
		Boolean RegisterPageMainTitleDisplayed = UtilitiesTN.isElementDispalyed(driver, registerAccountMainTitle);
		return RegisterPageMainTitleDisplayed;
	}

	public Boolean verifyRegisterPageSubTitle() {
		Boolean RegisterPageSubTitleDisplayed = UtilitiesTN.isElementDispalyed(driver, registerAccountSubTitle);
		return RegisterPageSubTitleDisplayed;
	}

	public void verifyLoginButton() {
		UtilitiesTN.buttonClick(driver, continueRegisterButton);
	}

	public String verifyFirstnameErrorMessage() {
		String firstnameErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, firstnameRegsiterErrorMessage);
		return firstnameErrorMessage;
	}

	public String verifyLastnameErrorMessage() {
		String lastnameErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, lastnameRegisterErrorMessage);
		return lastnameErrorMessage;
	}

	public String verifyEmailErrorMessage() {
		String emailErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, emailRegisterErrorMessage);
		return emailErrorMessage;
	}

	public String verifyTelephoneErrorMessage() {
		String telephoneErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, telephoneRegisterErrorMessage);
		return telephoneErrorMessage;
	}

	public String verifyPasswordErrorMessage() {
		String passwordErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, passwordRegisterErrorMessage);
		return passwordErrorMessage;
	}

	public String verifyConfirmPasswordErrorMessage() {
		String confirmPasswordErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver,
				confirmPasswordRegisterErrorMessage);
		return confirmPasswordErrorMessage;
	}

	public String verifyPrivacyPolicyErrorMessage() {
		String privacyPolicyErrorMessage = UtilitiesTN.ReadDisplayedMessage(driver, privacyPolicyRegisterErrorMessage);
		return privacyPolicyErrorMessage;
	}

	public void verifyRegisterByProvidingFirstName(String value) {
		UtilitiesTN.GivingInputToFields(driver, firstnameRegister, value);
	}

	public void verifyRegisterByProvidingLastName(String value) {
		UtilitiesTN.GivingInputToFields(driver, lastnameRegister, value);
	}

	public void verifyRegisterByProvidingEmail(String value) {
		UtilitiesTN.GivingInputToFields(driver, emailRegister, value);
	}

	public void verifyRegisterByProvidingTelephone(String value) {
		UtilitiesTN.GivingInputToFields(driver, telephoneRegister, value);
	}

	public void verifyRegisterByProvidingPassword(String value) {
		UtilitiesTN.GivingInputToFields(driver, passwordRegister, value);
	}

	public void verifyRegisterByProvidingConfirmPassword(String value) {
		UtilitiesTN.GivingInputToFields(driver, confirmPasswordRegister, value);
	}

	public void verifyPrivacyPolicy() {
		UtilitiesTN.buttonClick(driver, privacyPolicyRegister);
	}

	public String verifySuccessfullyRegisterMessage() {
		String successfullyRegisterMessage = UtilitiesTN.ReadDisplayedMessage(driver, successfullyCreatedMessage);
		return successfullyRegisterMessage;
	}

	public void verifyAccountCreatedContinueButtonNavigation() {
		UtilitiesTN.buttonClick(driver, accountCreatedContinuebutton);

	}

	public String generateUUID() {
		return UUID.randomUUID().toString();
	}
}
