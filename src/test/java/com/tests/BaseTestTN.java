package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.configurations.BaseTN;
import com.pages.CheckoutPageTN;
import com.pages.HomePageTN;
import com.pages.LoginPageTN;
import com.pages.LogoutPageTN;
import com.pages.OrderHistoryPageTN;
import com.pages.ProductReturnPageTN;
import com.pages.RegisterPageTN;
import com.pages.ShoppingCartPageTN;
import com.pages.WishListPageTN;

public class BaseTestTN extends BaseTN {
	LoginPageTN login;
	RegisterPageTN register;
	HomePageTN home;
	WishListPageTN wishList;
	CheckoutPageTN checkout;
	LogoutPageTN logout;
	OrderHistoryPageTN orderhistory;
	ProductReturnPageTN productreturn;
	ShoppingCartPageTN shoppingcart;

	@BeforeMethod
	public void browserInitialise() throws Exception {
		initialiseBrowser();
		login = new LoginPageTN(driver);
		register = new RegisterPageTN(driver);
		home = new HomePageTN(driver);
		wishList = new WishListPageTN(driver);
		checkout = new CheckoutPageTN(driver);
		logout = new LogoutPageTN(driver);
		orderhistory = new OrderHistoryPageTN(driver);
		productreturn = new ProductReturnPageTN(driver);
		shoppingcart = new ShoppingCartPageTN(driver);
	}

	@AfterMethod
	public void browserQuit() {
		driver.quit();
	}
}
