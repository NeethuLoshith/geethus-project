package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Keywords;
import com.inputdata.DPR_ADV_002_Data;
import com.projectlibrary.DPR_ADV_002;

public class DPR_ADV_002_Test {

	DPR_ADV_002 AdvTC002 = new DPR_ADV_002();
	
	@Test
	
	public void DPR_ADV_002() throws InterruptedException {
		
		AdvTC002.VerifyAdvertiserLink();		
						
		Assert.assertEquals(Keywords.get_currentURL(), DPR_ADV_002_Data.EXPECTEDURL);
		
		Thread.sleep(2000);
	}
}
