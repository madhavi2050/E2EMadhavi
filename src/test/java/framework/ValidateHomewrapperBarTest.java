package framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObject.LandingPage;
import resources.Base;

public class ValidateHomewrapperBarTest extends Base {
	private static Logger log = LogManager.getLogger(Base.class.getName());
	
@BeforeTest
 public void navigateTourl() throws IOException{
 driver=initializerDriver();
 driver.get(prop.getProperty("url"));
	 
	}


@Test 
 public void basePageNavigation() throws IOException
 {
 driver = initializerDriver();
 driver.get(prop.getProperty("url"));
 LandingPage l = new LandingPage(driver);
 Assert.assertTrue( l.homewrap().isSelected());
// Assert.assertFalse( l.homewrap().isSelected());
 
}
@AfterTest
public void driverclose() {
	driver.close();
	driver=null;
}

}