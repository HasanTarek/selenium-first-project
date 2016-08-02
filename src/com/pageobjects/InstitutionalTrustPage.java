package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;
import com.pageobjects.BaseClass;

public class InstitutionalTrustPage extends BaseClass {
	public InstitutionalTrustPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public InstitutionalTrustPage ClickOnContactButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement contactButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[2]/div/div[3]/div[2]/div[4]/div/div[1]/a/span")));
		contactButton.click();
		System.out.println("Clicked Contact Button");
		Reporter.log("Clicked Contact Button");
		return this;
	}
}
