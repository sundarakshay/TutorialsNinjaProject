package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class UtilitiesTN {

	public static String isTitleDispalyed(WebDriver driver) {
		String applicationTitle = driver.getTitle();
		return applicationTitle;
	}

	public static boolean isElementDispalyed(WebDriver driver, By byLocator) {
		Boolean elementDisplayed = driver.findElement(byLocator).isDisplayed();
		return elementDisplayed;
	}

	public static void buttonClick(WebDriver driver, By byLocator) {
		driver.findElement(byLocator).click();
	}

	public static String ReadDisplayedMessage(WebDriver driver, By byLocator) {
		String extractedMessage = driver.findElement(byLocator).getText();
		return extractedMessage;
	}

	public static void GivingInputToFields(WebDriver driver, By byLocator, String value) {
		driver.findElement(byLocator).sendKeys(value);
	}
	public static void GivingInputToFieldsAndClear(WebDriver driver, By byLocator, String value) {
		driver.findElement(byLocator).clear();
		driver.findElement(byLocator).sendKeys(value);
	}

	public static String ReadDataFromField(WebDriver driver, By byLocator) {
		WebElement inputField = driver.findElement(byLocator);
		String extractedMessage = inputField.getAttribute("value");
		return extractedMessage;
	}

	public static void DropdownSelect(WebDriver driver, By byLocator, String value) {
		WebElement faciltiy = driver.findElement(byLocator);
		Select selectFacility;
		selectFacility = new Select(faciltiy);
		selectFacility.selectByValue(value);
	}

	public static String getPropertyFileDetails(String propertyName) throws IOException {
		String propertyValue;
		Properties prop = new Properties();
		FileInputStream fil = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fil);
		propertyValue = prop.getProperty(propertyName);
		return propertyValue;
	}

	public static String[][] readExcel() throws BiffException, IOException {
		String FilePath = "./src/main/resources/TestDataTN.xls";
		String[][] tabArray = null;
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		tabArray = new String[totalNoOfRows][totalNoOfCols];
		for (int row = 0; row < totalNoOfRows; row++) {
			for (int col = 0; col < totalNoOfCols; col++) {
				tabArray[row][col] = sh.getCell(col, row).getContents();
			}
		}
		return tabArray;
	}

	public String takesScreenshot(String testName, WebDriver driver) {

		File sourceScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destinationScreenshotFile = new File(
				System.getProperty("user.dir") + "\\Screenshots\\" + testName + ".png");
		try {
			FileUtils.copyFile(sourceScreenshotFile, destinationScreenshotFile);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return destinationScreenshotFile.getAbsolutePath();
	}
}
