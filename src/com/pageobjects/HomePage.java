package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.pageobjects.BaseClass;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public HomePage TypeZipCode(String zipCode) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement myzip = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("td-location-search-textfield")));
		myzip.clear();
		myzip.sendKeys(zipCode);
		System.out.println("Type User zipCode");
		Reporter.log("Type User zipCode");
		return this;
	}

	public HomePage ClickGoButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement goButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div[5]/div/div[2]/div[2]/div/div/div/div/div[1]/div/a/span")));
		goButton.click();
		System.out.println("click on go Button");
		Reporter.log("click on go Button");
		return this;
	}

	public HomePage TypeInGlobalSearchTextBox(String zipCode) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement GlobalSearchTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtSearch")));
		GlobalSearchTextBox.clear();
		GlobalSearchTextBox.sendKeys(zipCode);
		System.out.println("Type GlobalSearchTextBox");
		Reporter.log("Type GlobalSearchTextBox");
		return this;
	}

	public HomePage ClickGlobalSearchButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement globalSearchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAsk")));
		globalSearchButton.click();
		System.out.println("click on globalSearchButton");
		Reporter.log("click globalSearchButton");
		return this;
	}

	public HomePage MouseOverBanking() {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement bankingTab = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='td-nav-level2']/ul/li[2]/span")));
		Actions action = new Actions(driver);
		action.moveToElement(bankingTab).build().perform();

		System.out.println("Mouse Over Banking Tab ...");
		Reporter.log("Mouse Over Banking Tab ...");
		return this;
	}

	public HomePage ClickOnCreditCardsLink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement bankingTab = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='td-nav-level2']/ul/li[2]/span")));
		Actions action = new Actions(driver);
		action.moveToElement(bankingTab).build().perform();

		System.out.println("Mouse Over Banking Tab ...");
		Reporter.log("Mouse Over Banking Tab ...");

		WebElement creditCardsLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='td-nav-level2']/ul/li[2]/ul/li/div/div/div[2]/div[2]/ul/li[11]/a")));
		creditCardsLink.click();
		System.out.println("Clicked on credit card  link");
		Reporter.log("Clicked on credit card  link");
		return this;
	}
	// public HomePage ClickOnCreditCardsLink() {
	// WebDriverWait wait = new WebDriverWait(driver, 30);
	// WebElement creditCardsLink =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(
	// By.xpath("//*[@id='td-nav-level2']/ul/li[2]/ul/li/div/div/div[2]/div[2]/ul/li[11]/a")));
	// creditCardsLink.click();
	// System.out.println("Clicked credit Cards Link");
	// Reporter.log("Clicked credit Cards Link");
	// return this;
	// }
	
	public HomePage MouseOverInvestingTab() {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement investingTab = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[2]/div/div[4]/nav/ul/li[3]/span")));
		Actions action = new Actions(driver);
		action.moveToElement(investingTab).build().perform();

		System.out.println("Mouse Over investing Tab ...");
		Reporter.log("Mouse Over investing Tab ...");
		return this;
	}
                         
	public HomePage ClickOnInstitutionalTrustlink() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement institutionalTrustlink = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[2]/div/div[4]/nav/ul/li[3]/ul/li/div/div/div[2]/div[2]/ul/li[8]/a")));
		institutionalTrustlink.click();
		System.out.println("Clicked institutional Trust link");
		Reporter.log("Clicked institutional Trust link");
		return this;
	}
}
