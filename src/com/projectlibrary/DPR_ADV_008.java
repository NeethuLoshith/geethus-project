package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.locators.DPR_ADV_008_Elements;

public class DPR_ADV_008 {

	public void alert()

	{
		Keywords.wait_for_xpath(DPR_ADV_008_Elements.AddAdvButton);		
		Keywords.click_element(DPR_ADV_008_Elements.AddAdvButton);

	}

}
