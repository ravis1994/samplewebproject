package com.sample.javaselenium;

public class BasePage {

	
	public static click(WebElement element)
	{
		Thread.sleep(1000);
		element.click();
		
	}
	
	public static ValidatelistofProducts(List<WebElement> Products)
	
	{
		//products.get();
		for(WebElement product : products)
		{
			if(product.isDispplayed==true)
			{
				//reportretur
			}
			
		}
	
	}
}



