package com.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.pageobjects.BaseClass;
import com.pageobjects.ContactInstitutionalTrustPage;
import com.pageobjects.HomePage;
import com.pageobjects.InstitutionalTrustPage;

public class MyTest2 extends BaseClass {

	@Test
	public void testcase1() throws InterruptedException {

		HomePage HomePG = PageFactory.initElements(driver, HomePage.class);
		InstitutionalTrustPage InstitutionalTrustPG = PageFactory.initElements(driver, InstitutionalTrustPage.class);
		ContactInstitutionalTrustPage ContactInstitutionalTrustPG = PageFactory.initElements(driver,
		ContactInstitutionalTrustPage.class);
		HomePG.MouseOverInvestingTab();
		HomePG.ClickOnInstitutionalTrustlink();
		InstitutionalTrustPG.ClickOnContactButton();
		ContactInstitutionalTrustPG.TypeFullName("Hasan Tarek");
		ContactInstitutionalTrustPG.TypeCity("Queens");
		ContactInstitutionalTrustPG.SelectStateDropDown("MD");
		ContactInstitutionalTrustPG.TypePhoneNumber("(344) 222 1450");
		ContactInstitutionalTrustPG.TypeEmailTextBox("a@b.com");
		ContactInstitutionalTrustPG.SelectPreferredTimeToContact("Evening");
		ContactInstitutionalTrustPG.CheckInstitutionalCustodyCheckBox();
		ContactInstitutionalTrustPG.CheckIRAPlansCheckBox();
		ContactInstitutionalTrustPG.CheckFour01KPlansCheckBox();
//		ClickGlobalHomeLink();
//		GoToPreviousPage();
//		GoToForwordPage();
//		GoToPreviousPage();
		
//		ContactInstitutionalTrustPG.UnCheckFour01KPlansCheckBox();

	}

}
