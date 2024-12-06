package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class LogoutPageTN {
	WebDriver driver;
	By myaccountHomePage = By.xpath("//span[text()='My Account']");
	By logout = By.xpath("//a[text()='Logout']");
	By logoutMainTitle = By.xpath("//h1[text()='Account Logout']");

	public LogoutPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyMyAccountClick() {
		UtilitiesTN.buttonClick(driver, myaccountHomePage);
	}

	public void verifyLogoutButtonClick() {
		UtilitiesTN.buttonClick(driver, logout);
	}

	public String verifyLogoutMainTitleMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, logoutMainTitle);
		return alertMessage;
	}
}
