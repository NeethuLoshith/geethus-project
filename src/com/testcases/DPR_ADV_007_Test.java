package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_007_Data;
import com.locators.DPR_ADV_007_Elements;

public class DPR_ADV_007_Test {
	
	@Test
	
	public void DPR_ADV_007() {
		
	Assert.assertEquals(Keywords.get_text(DPR_ADV_007_Elements.ADD_ADV_Button), DPR_ADV_007_Data.Expected);
		
	}

}
