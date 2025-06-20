package com.sample.javaselenium;

public class TessPage {
	
	public TessPage(WebDriver driver)
	{
		driver= this.driver();
		//TessPage hm = new Homepage(driver);

	}
	
	public TessPage ValidateTees()
	
	{

		List<Webelements> products= CommonElement.TeespageProducts;
		ValidatelistofProducts(products);
		
		return this;
	}
	
public TessPage AddTeesToCart()
	
	{

		List<Webelements>products= CommonElement.TeespageProducts;
		WebElement tees = products.get(0);
		
		click(CommonElement.TeessizeSelect);
		click(CommonElement.TeessizeSelect);
         click(CommonElement.TeescolorSelect);
         click(CommonElement.AddtoCartButton_Tees);
		
		return this;
	}
	

}
