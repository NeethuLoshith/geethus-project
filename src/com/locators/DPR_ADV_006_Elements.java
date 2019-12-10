package com.locators;

public class DPR_ADV_006_Elements {
	
	//Advertiser listing page with items per page, search field elements
	
	public static String items_per_page = "//div[@class='mat-paginator-page-size-label']";
	
	public static String search = "//input[@placeholder='Filter']";
	
	//Advertiser listing table elements
	
	public static String Advertiser = "//button[contains(text(),'Advertiser')]";
	
	public static String Brand = "//button[@aria-label='Change sorting for age']";
	
	public static String Brand_description = "//button[contains(text(),'Brand Description')]";
	
	public static String Telephone = "//button[contains(text(),'Telephone')]";
	
	public static String Email = "//button[contains(text(),'Email')]";

	public static String Campaigns = "//button[contains(text(),'Campaigns')]";
	
	public static String Action = "//button[contains(text(),'Action')]";
	
	//Edit and delete button elements
	
	public static String Edit = "//mat-row[1]//mat-cell[7]//mat-icon[2]";
	
	public static String Delete = "//mat-row[1]//mat-cell[7]//mat-icon[3]";
	
		
}
