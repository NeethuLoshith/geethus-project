package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_003_Data;
import com.locators.DPR_ADV_003_Elements;
import com.projectlibrary.DPR_ADV_003;

public class DPR_ADV_003_Test {
	
	DPR_ADV_003 AdvTC003 =new DPR_ADV_003();
	
	@Test
	public void DPR_ADV_003() {
		
		AdvTC003.CheckDetailsicon();
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_003_Elements.ADVERTISER), DPR_ADV_003_Data.EXPECTED);
		
		Keywords.click_element(DPR_ADV_003_Elements.CLOSEBTN);
	}
	

}
