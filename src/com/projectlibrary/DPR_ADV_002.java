package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.locators.DPR_ADV_001_Elements;

public class DPR_ADV_002 {

	public void VerifyAdvertiserLink() throws InterruptedException {

		Keywords.wait_for_xpath(DPR_ADV_001_Elements.ADVLINK);
		Keywords.click_element(DPR_ADV_001_Elements.ADVLINK);		
		Thread.sleep(2000);
		
	}
}

