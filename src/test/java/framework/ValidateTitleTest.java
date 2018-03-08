package framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.Base;

public class ValidateTitleTest extends Base {
private static Logger log = LogManager.getLogger(Base.class.getName());
	
@BeforeTest
public void navigateTourl() throws IOException{
 driver=initializerDriver();
 log.info("browser initialized");
 driver.get(prop.getProperty("url"));
 log.info("navigate to url");
	 
	}


@Test

public void basePagenavigation() throws IOException{


	driver=initializerDriver();
	driver.get(prop.getProperty("url"));
	LandingPage signup = new LandingPage(driver);
	//compare the text from the browser with actual text with printed text
	Assert.assertEquals(signup.getdeal().getText(),"business11");
	log.info("get the text");
   
  
}
@AfterTest
public void driverclose() {
	driver.close();
	driver=null;
}

}