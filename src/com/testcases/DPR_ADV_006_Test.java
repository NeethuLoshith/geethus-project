package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_006_Data;
import com.locators.DPR_ADV_006_Elements;

public class DPR_ADV_006_Test {
	
	@Test
	
	public void DPR_ADV_006() {
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.items_per_page),DPR_ADV_006_Data.Items_per_page);
		
		Assert.assertEquals(Keywords.get_attribute(DPR_ADV_006_Elements.search, DPR_ADV_006_Data.value),DPR_ADV_006_Data.Filter); 
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Advertiser),DPR_ADV_006_Data.Advertiser);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Brand),DPR_ADV_006_Data.Brand);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Brand_description),DPR_ADV_006_Data.Brand_Description);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Telephone),DPR_ADV_006_Data.Telephone);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Email),DPR_ADV_006_Data.Email);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Campaigns),DPR_ADV_006_Data.Campaigns);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Action),DPR_ADV_006_Data.Action);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Edit),DPR_ADV_006_Data.Edit);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_006_Elements.Delete),DPR_ADV_006_Data.Delete);
		
	}

}
