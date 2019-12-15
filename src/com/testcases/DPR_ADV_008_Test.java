package com.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_008_Data;
import com.locators.DPR_ADV_008_Elements;
import com.projectlibrary.DPR_ADV_008;

public class DPR_ADV_008_Test {
	
	DPR_ADV_008 TC008 = new DPR_ADV_008();
	
	@Test
	
	public void DPR_ADV_008()
	
	{
		TC008.alert();	
		
		//System.out.println(Keywords.get_attribute(DPR_ADV_008_Elements.Advertiser, DPR_ADV_008_Data.Expected_value));
		
		
		//Verify Add new advertiser pop up and titles
				
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Advertiser),DPR_ADV_008_Data.Expected_text1);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Contact),DPR_ADV_008_Data.Expected_text2);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Language),DPR_ADV_008_Data.Expected_text3);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Agency_Contact),DPR_ADV_008_Data.Expected_text4);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Cost),DPR_ADV_008_Data.Expected_text5);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Placement_naming),DPR_ADV_008_Data.Expected_text6);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_008_Elements.Next),DPR_ADV_008_Data.Expected_text7);
		
		Keywords.Refresh();
		
	}

}
