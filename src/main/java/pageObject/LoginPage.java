package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

public WebDriver driver;
By username = By.xpath(".//*[@id='login1']");
By password = By.xpath(".//*[@id='password']");
By go = By.name("proceed");
 public LoginPage(WebDriver driver)
 {
	this.driver= driver;
 }

public WebElement loginMethod()
{
 return driver.findElement(username);

}
 public WebElement password(){
	 return driver.findElement(password);
 }
 public WebElement proceed()
 {
	 return driver.findElement(go);
 }
}
