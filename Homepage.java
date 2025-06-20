package com.sample.javaselenium;

public class Homepage extends BasePage {
	public static webdriver driver;
	
	public Homepage(Webdriver driver)
	{
		driver= this.driver();
		Homepage hm = new Homepage(driver);
	}
	public TessPage launchURL()
	{
		/*System.setProperty("","c/app/chromedriver.exe");
		webdriver driver = new chromeDriver();*/
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximise();
		driver.manage().implicitwait.
		click(Homepagewomanlink);
		click(HomepageTopslink);
		click(HomepageTeeslink);
		return new TessPage(driver);
)
		
	}

}
