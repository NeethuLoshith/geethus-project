package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Browser;
import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_001_Data;
import com.locators.DPR_ADV_001_Elements;
import com.projectlibrary.DPR_ADV_001;

public class DPR_ADV_001_Test {

	DPR_ADV_001 AdvTC001 = new DPR_ADV_001();

	@Test

	public void DPR_ADV_001() {

		Browser.open_chrome_browser();

		Browser.navigate_to(DPR_ADV_001_Data.URL);

		AdvTC001.CheckAdvertiserLink();
		
		//Compare expected href with actual
		
		Assert.assertEquals(Keywords.get_attribute(DPR_ADV_001_Elements.ADVLINK, DPR_ADV_001_Data.VALUE), DPR_ADV_001_Data.EXPECTED);
		
		
		
	}

	
		


}
