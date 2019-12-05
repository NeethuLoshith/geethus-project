package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_001_Data;
import com.locators.DPR_ADV_001_Elements;

public class DPR_ADV_001 {

	public void CheckAdvertiserLink() {

		Keywords.wait_for_xpath(DPR_ADV_001_Elements.USERNAME);
		Keywords.enter_text(DPR_ADV_001_Elements.USERNAME, DPR_ADV_001_Data.USERNAME);

		Keywords.wait_for_xpath(DPR_ADV_001_Elements.PASSWORD);
		Keywords.enter_text(DPR_ADV_001_Elements.PASSWORD, DPR_ADV_001_Data.PASSWORD);

		Keywords.wait_for_xpath(DPR_ADV_001_Elements.SIGNIN);
		Keywords.click_element(DPR_ADV_001_Elements.SIGNIN);

		Keywords.wait_for_xpath(DPR_ADV_001_Elements.MANAGE);
		Keywords.click_element(DPR_ADV_001_Elements.MANAGE);
		
	}

	

}


