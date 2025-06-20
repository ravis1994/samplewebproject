package com.sample.javaselenium;

public class BasePage {

	
	public static boolean VerifyIfElementpresent(WebElement element)
	{
		if(element.size()!=0)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public static click(WebElement element)
	{
		Thread.sleep(1000);
		VerifyIfElementpresent(element);
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



