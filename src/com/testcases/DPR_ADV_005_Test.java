package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_005_Data;
import com.locators.DPR_ADV_005_Elements;
import com.projectlibrary.DPR_ADV_003;

public class DPR_ADV_005_Test {
	
	DPR_ADV_003 AdvTC003 =new DPR_ADV_003();

	@Test

	public void DPR_ADV_005() throws InterruptedException {
		

		AdvTC003.CheckDetailsicon();
		Thread.sleep(2000);
		
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Name),DPR_ADV_005_Data.Expected_Name);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Address),DPR_ADV_005_Data.Expected_Address);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Email),DPR_ADV_005_Data.Expected_Email);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Telephone),DPR_ADV_005_Data.Expected_Telephone);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Role),DPR_ADV_005_Data.Expected_Role);		
		
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Language_Name),DPR_ADV_005_Data.Expected_LANGUAGES);
		
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.creative_size),DPR_ADV_005_Data.Expected_Creativesize);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.cost),DPR_ADV_005_Data.Expected_Cost);		
		
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Small),DPR_ADV_005_Data.Expected_Small);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Medium),DPR_ADV_005_Data.Expected_Medium);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Large),DPR_ADV_005_Data.Expected_Large);
		
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.vat),DPR_ADV_005_Data.Expected_Vat);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.co_brand),DPR_ADV_005_Data.Expected_Co_Brand);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Currency),DPR_ADV_005_Data.Expected_Currency);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Brand),DPR_ADV_005_Data.Expected_Brand_Type);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.agency_fee),DPR_ADV_005_Data.Expected_Agency_Fee);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.adserver_sytem),DPR_ADV_005_Data.Expected_Ad_Serving_System);
		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_005_Elements.Placement),DPR_ADV_005_Data.Expected_PLACEMENT_NAMING);		
			
		
		Keywords.click_element(DPR_ADV_005_Elements.CLOSEBTN);
		
	}

}
