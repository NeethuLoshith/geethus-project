package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_004_Data;
import com.locators.DPR_ADV_004_Elements;
import com.projectlibrary.DPR_ADV_003;

public class DPR_ADV_004_Test {

	DPR_ADV_003 AdvTC003 =new DPR_ADV_003();

	@Test

	public void DPR_ADV_004() {

		AdvTC003.CheckDetailsicon();

		//Verify the VAT field		
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.VAT),DPR_ADV_004_Data.EXPECTED_txt1);
		
		//Verify the AGENCYFEE field
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.AGENCYFEE),DPR_ADV_004_Data.EXPECTED_txt2);

		//Verify the LANGUAGES field
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.LANGUAGES),DPR_ADV_004_Data.EXPECTED_txt3);

		//Verify the AGENCY CONTACT field
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.AGENCY_CONTACT),DPR_ADV_004_Data.EXPECTED_txt4);

		//Verify the TECHNICAL COST field
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.TECHNICAL_COST),DPR_ADV_004_Data.EXPECTED_txt5);

		//Verify the PLACEMENT_NAMING
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.PLACEMENT_NAMING),DPR_ADV_004_Data.EXPECTED_txt6);

		//Verify the CAMPAIGN_TYPE_COST
		Assert.assertEquals(Keywords.get_text(DPR_ADV_004_Elements.CAMPAIGN_TYPE_COST),DPR_ADV_004_Data.EXPECTED_txt7);

		Keywords.click_element(DPR_ADV_004_Elements.CLOSEBTN);
	}

}
