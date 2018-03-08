package framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePageTest extends Base {
public Logger log = LogManager.getLogger(Base.class.getName());
	
@BeforeTest
public void navigateTourl() throws IOException{
	driver=initializerDriver();
	log.info("driver is initialized");
 
}

@Test(dataProvider="getdata")

public void basePagenavigation(String username, String password,String text) throws IOException
{
	driver.get(prop.getProperty("url"));
	log.info("navigate to url");
	LandingPage signup = new LandingPage(driver);
	log.info("landing to homepage");
	signup.getsignup().click();
	
	LoginPage login = new LoginPage(driver);
	login.loginMethod().sendKeys(username);
	login.password().sendKeys(password);
     //System.out.println(text);
     log.info("sucessfully logged in");
	login.proceed().click();
}
@DataProvider
public Object[][] getdata()
{
 Object[][] data= new Object[2][3];
 data[0][0]="nonrestrictedMadhavi";
 data[0][1]="Thakur";
 //data[0][2]="Restricted user";
 data[1][0]="restrictedMadhavi";
 data[1][1]="Soham";
 data[1][2]="Non Restricted user";
 return data;
}
@AfterTest
public void driverclose() {
	driver.close();
	driver=null;
}
}