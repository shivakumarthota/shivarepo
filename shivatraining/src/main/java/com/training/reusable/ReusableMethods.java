package com.training.reusable;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableMethods {
	public static void waitForElement(String type, String locator, int timelimit, WebDriver driver) {
		System.out.println("waiting for the elemant" + locator);
		WebElement ele =null;
		WebDriverWait wait = new WebDriverWait(driver, timelimit);
		
		if (type.equals("name")) {
		ele = wait.until(ExpectedConditions. visibilityOfElementLocated(By.name(locator)));
	
		}
		if (type.equals("id")) {
			ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		}
		if (type.equals("xpath")) {
			ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		}
		if (type.equals("Linktext")) {
			ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
		}
	}
	
	public static void clickButtonusingLinkTest(String type, String locator, WebDriver driver) {
     System.out.println("clicking on the " + locator + "clicking ");
		waitForElement(type, locator, 10, driver);
		
		if (type.equals("linktext")) {
			WebElement RegisterButton = driver.findElement(By.linkText(locator));
			RegisterButton.click();
		}
		if (type.equals("xpath")) {
			WebElement RegisterButton = driver.findElement(By.xpath(locator));
			RegisterButton.click();
		}
		if (type.equals("id")) {
			WebElement RegisterButton = driver.findElement(By.id(locator));
			RegisterButton.click();
		}
		if (type.equals("name")) {
			WebElement RegisterButton = driver.findElement(By.name(locator));
			RegisterButton.click();
		}
	}

	public static void enterValue(String type, String locator, String data, WebDriver driver) {

		 System.out.println("enteringValue " + locator + "with " + data);
		 waitForElement(type, locator, 10, driver);
		if (type.equals("linktext")) {
			WebElement InputElement = driver.findElement(By.linkText(locator));
			InputElement.sendKeys(data);
		}
		if (type.equals("xpath")) {
			WebElement InputElement = driver.findElement(By.xpath(locator));
			InputElement.sendKeys(data);
		}
		if (type.equals("id")) {
			WebElement InputElement = driver.findElement(By.id(locator));
			InputElement.sendKeys(data);
		}
		if (type.equals("name")) {
			WebElement InputElement = driver.findElement(By.name(locator));
			InputElement.sendKeys(data);
		}
	}

	public static void countryDropDown(String type, String locator, int data, WebDriver driver) {
		WebElement country = null;
		System.out.println("selecting dropdown " + locator + "with " + data);
		waitForElement(type, locator, 15, driver);

		if (type.equals("linktext"))
			
			country = driver.findElement(By.linkText(locator));

		if (type.equals("xpath"))
			country = driver.findElement(By.xpath(locator));

		if (type.equals("id"))
			country = driver.findElement(By.id(locator));

		if (type.equals("name"))
			country = driver.findElement(By.name(locator));
		
		
		Select countryDropdown = new Select(country);
		countryDropdown.selectByIndex(data);

	}

}



