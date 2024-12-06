package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.UtilitiesTN;

public class WishListPageTN {
	WebDriver driver;
	By homePageNavigation = By.xpath("//a[text()='Qafox.com']");
	By wishListPageNavigation = By.xpath("//i[@class='fa fa-heart']");
	By wishListPageMainTitle = By.xpath("//h2[text()='My Wish List']");
	By wishListPageSubTitle = By.xpath("//p[text()='Your wish list is empty.']");
	By iphoneFeatureNavigation = By.xpath("//img[@title='iPhone']");
	By addToWishListIphone = By.xpath("//button[@class='btn btn-default'][1]");
	By addedWishListCloseButton = By.xpath("//button[@class='close']");
	By RemoveAddToWishListButton = By.xpath("//a[@class='btn btn-danger']");
	By RemoveAddToWishListMessage = By.xpath("//p[text()='Your wish list is empty.']");

	public WishListPageTN(WebDriver driver) {
		this.driver = driver;
	}

	public String verifyTitleDisplayed() {
		String titleDisplayed = UtilitiesTN.isTitleDispalyed(driver);
		return titleDisplayed;
	}

	public void verifyHomeNavigation() {
		UtilitiesTN.buttonClick(driver, homePageNavigation);
	}

	public void verifyWishListNavigation() {
		UtilitiesTN.buttonClick(driver, wishListPageNavigation);
	}

	public String verifyWishListMainTitle() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, wishListPageMainTitle);
		return alertMessage;
	}

	public String verifyWishListSubTitle() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, wishListPageSubTitle);
		return alertMessage;
	}

	public void verifyIphoneWishListNavigation() {
		UtilitiesTN.buttonClick(driver, iphoneFeatureNavigation);
	}

	public void verifyAddToWishList() {
		UtilitiesTN.buttonClick(driver, addToWishListIphone);
	}

	public void verifyAddToWishListClose() {
		UtilitiesTN.buttonClick(driver, addedWishListCloseButton);
	}

	public void verifyAddToWishListRemoveButton() {
		UtilitiesTN.buttonClick(driver, RemoveAddToWishListButton);
	}

	public String verifyAddToWishListRemoveMessage() {
		String alertMessage = UtilitiesTN.ReadDisplayedMessage(driver, RemoveAddToWishListMessage);
		return alertMessage;
	}
}
