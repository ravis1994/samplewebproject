package com.sample.javaselenium;

public class Hooks {

system.setproperty("c/app/chromerdriver.exe");
Webdriver driver = new Chromedriver();
driver.manage().window().maximize();
new Homepage(driver).launchURL().ValidateTees().AddTeesToCart();
}
