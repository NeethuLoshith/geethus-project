package com.testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.commonlibrary.Browser;
import com.inputdata.DPR_ADV_001_Data;
import com.locators.DPR_ADV_001_Elements;
import com.projectlibrary.DPR_ADV_001;

public class DPR_ADV_001_Test {

	DPR_ADV_001 ADV_TC001 = new DPR_ADV_001();

	@Test

	public void DPR_ADV_001() {

		Browser.open_chrome_browser();

		Browser.navigate_to(DPR_ADV_001_Data.URL);

		ADV_TC001.CheckAdvertiserLink();

		assertTrue(isElementPresent(By.xpath(DPR_ADV_001_Elements.ADVLINK)));
	}

	
	private boolean isElementPresent(By xpath) 
	{		
		return false;
	}

	


}
