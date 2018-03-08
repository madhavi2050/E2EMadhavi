package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By signin = By.xpath(".//*[@id='signin_info']/a[1]");
	By deal = By.xpath(".//*[@id='hm_top_navlink_div']/a[2]/div");
	By homewrapper =By.xpath(".//*[@id='homewrapper']/div[7]");
	public LandingPage(WebDriver driver) {
	this.driver = driver;
	}
	public WebElement getsignup()
	{
		return driver.findElement(signin);
	}
	public WebElement getdeal()
	{
     return driver.findElement(deal);
	}
     public WebElement homewrap()
     {
    	return driver.findElement(homewrapper) ;
     }
}
