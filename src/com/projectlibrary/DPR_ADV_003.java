package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.locators.DPR_ADV_003_Elements;

public class DPR_ADV_003 {

	public void CheckDetailsicon() {
		
		Keywords.wait_for_xpath(DPR_ADV_003_Elements.DETAILS_icon);
		Keywords.click_element(DPR_ADV_003_Elements.DETAILS_icon);

	}

}
