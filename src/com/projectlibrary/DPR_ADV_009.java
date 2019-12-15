package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_009_Data;
import com.locators.DPR_ADV_009_Elements;

public class DPR_ADV_009 {
	
	DPR_ADV_008 TC008 = new DPR_ADV_008();
	
	public void AddnewADV() throws InterruptedException

	{
		Thread.sleep(2000);		
		Keywords.click_element(DPR_ADV_009_Elements.AddAdvButton);		

		Keywords.wait_for_xpath(DPR_ADV_009_Elements.ADV_name);
		Keywords.enter_text(DPR_ADV_009_Elements.ADV_name,DPR_ADV_009_Data.ADV_name);
		
		Keywords.wait_for_xpath(DPR_ADV_009_Elements.Brand_name);
		Keywords.enter_text(DPR_ADV_009_Elements.Brand_name,DPR_ADV_009_Data.Brand_name);
		
		Keywords.wait_for_xpath(DPR_ADV_009_Elements.CoBrand);
		Keywords.enter_text(DPR_ADV_009_Elements.CoBrand,DPR_ADV_009_Data.CoBrand);
		
		Keywords.wait_for_xpath(DPR_ADV_009_Elements.AgencyFee);
		Keywords.enter_text(DPR_ADV_009_Elements.AgencyFee,DPR_ADV_009_Data.AgencyFee);
		
		Keywords.wait_for_xpath(DPR_ADV_009_Elements.VAT);
		Keywords.enter_text(DPR_ADV_009_Elements.VAT,DPR_ADV_009_Data.VAT);
	}


}
