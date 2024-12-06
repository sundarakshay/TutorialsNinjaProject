package com.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Listeners.TNRetryListener;

public class RegisterTestTN extends BaseTestTN {

	String registerURL = "https://tutorialsninja.com/demo/index.php?route=account/register";

	@BeforeMethod
	public void PreExecutionModule() throws Exception {
		driver.get(registerURL);
	}

	@Test(priority = 1, retryAnalyzer = TNRetryListener.class)
	public void verifyTitleDisplayedTest() {
		String actualTitle = register.verifyTitleDisplayed();
		String expectedTitle = "Register Account";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterAccountMainTitleTest() {
		Boolean actualBoolean = register.verifyRegisterPageMainTitle();
		Assert.assertEquals(actualBoolean, true);
	}

	@Test(priority = 3, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterAccountSubTitleTest() {
		Boolean actuaBoolean = register.verifyRegisterPageSubTitle();
		Assert.assertEquals(actuaBoolean, true);
	}

	@Test(priority = 4, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutAnyDetails() {
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 5, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithFirstName() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyLoginButton();
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 6, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithLastName() {
		register.verifyRegisterByProvidingLastName("TestLastName");
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 7, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithEmail() {
		register.verifyRegisterByProvidingEmail("testemail@test.com");
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 8, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithTelephone() {
		register.verifyRegisterByProvidingTelephone("987654321");
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 9, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithPassword() {
		register.verifyRegisterByProvidingPassword("Sree@123");
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 10, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithConfirmPassword() {
		register.verifyRegisterByProvidingConfirmPassword("Sree@123");
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
		String confirmPasswordActual = register.verifyConfirmPasswordErrorMessage();
		String confirmPasswordExpected = "Password confirmation does not match password!";
		Assert.assertEquals(confirmPasswordActual, confirmPasswordExpected);
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 11, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithPrivacyPolicy() {
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
	}

	@Test(priority = 12, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutFirstname() {
		register.verifyRegisterByProvidingLastName("TestLastName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String firstnameActual = register.verifyFirstnameErrorMessage();
		String firstnameExpected = "First Name must be between 1 and 32 characters!";
		Assert.assertEquals(firstnameActual, firstnameExpected);
	}

	@Test(priority = 13, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutLastname() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String lastnameActual = register.verifyLastnameErrorMessage();
		String lastnameExpected = "Last Name must be between 1 and 32 characters!";
		Assert.assertEquals(lastnameActual, lastnameExpected);
	}

	@Test(priority = 14, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutEmail() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String emailActual = register.verifyEmailErrorMessage();
		String emailExpected = "E-Mail Address does not appear to be valid!";
		Assert.assertEquals(emailActual, emailExpected);
	}

	@Test(priority = 15, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutTelephone() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("Stutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String telephoneActual = register.verifyTelephoneErrorMessage();
		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		Assert.assertEquals(telephoneActual, telephoneExpected);
	}

	@Test(priority = 16, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutPassword() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String passwordActual = register.verifyPasswordErrorMessage();
		String passwordExpected = "Password must be between 4 and 20 characters!";
		Assert.assertEquals(passwordActual, passwordExpected);
	}

	@Test(priority = 17, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutConfirmPassword() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String confirmPasswordActual = register.verifyConfirmPasswordErrorMessage();
		String confirmPasswordExpected = "Password confirmation does not match password!";
		Assert.assertEquals(confirmPasswordActual, confirmPasswordExpected);
	}

	@Test(priority = 18, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithoutPrivacyPolicy() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingEmail("testmail@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyLoginButton();
		String privacyPolicyActual = register.verifyPrivacyPolicyErrorMessage();
		String privacyPolicyExpected = "Warning: You must agree to the Privacy Policy!";
		Assert.assertEquals(privacyPolicyActual, privacyPolicyExpected);
	}

	@Test(priority = 19, retryAnalyzer = TNRetryListener.class)
	public void verifyRegisterButtonWithAllDetails() {
		register.verifyRegisterByProvidingFirstName("TestFirstName");
		register.verifyRegisterByProvidingLastName("TestFirstName");
		register.verifyRegisterByProvidingEmail("test" + register.generateUUID() + "@test.com");
		register.verifyRegisterByProvidingTelephone("9876543210");
		register.verifyRegisterByProvidingPassword("tutorialsninja@123");
		register.verifyRegisterByProvidingConfirmPassword("tutorialsninja@123");
		register.verifyPrivacyPolicy();
		register.verifyLoginButton();
		String accountCreatedActual = register.verifySuccessfullyRegisterMessage();
		String accountCreatedExcepeted = "Your Account Has Been Created!";
		Assert.assertEquals(accountCreatedActual, accountCreatedExcepeted);
		register.verifyAccountCreatedContinueButtonNavigation();
	}
}