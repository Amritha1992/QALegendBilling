package com.QALegendBilling.testscript;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.QALegendBilling.automationcore.Base;
import com.QALegendBilling.constants.ErrorMessages;
import com.QALegendBilling.pages.LoginPage1;
import com.QALegendBilling.pages.ResetPage1;
import com.QALegendBilling.utilities.ExcelUtility;
import com.QALegendBilling.utilities.RandomUtility;

public class ResetTest1 extends Base {
	LoginPage1 login;
	ResetPage1 reset;//object declare
	@Test
	public void tc_003_verifyForgotPassword()
	{
		List<ArrayList<String>> data = ExcelUtility.excelDataReader("ResetPage");
		String expEmailError = data.get(0).get(1);
		login= new LoginPage1(driver);
		reset=login.clickonForgotPassword();
		reset.enterSubEmailID();//enter a random emailid
		reset.clickonPasswordReset();
		String actEmailError = reset.getInvalidEmailError();
		Assert.assertEquals(actEmailError, expEmailError, ErrorMessages.INVALID_EMAIL_ID);
	}

}




