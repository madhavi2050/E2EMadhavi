package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
 public static WebDriver driver;
 public Properties prop;
	
public WebDriver initializerDriver() throws IOException
{
  prop = new Properties();
 FileInputStream file = new FileInputStream("D:\\selenium automation tool\\workSpace\\E2ESohamadhavi\\src\\main\\java\\resources\\data.properties");
 prop.load(file);
String browsername =prop.getProperty("browser");
if (browsername.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","D:\\selenium automation tool\\driver\\chromedriver.exe" );
	 driver= new ChromeDriver();
		
	
}
else if(browsername.equals("firefox"))
{
System.setProperty("webdriver.gecko.driver", "D:\\selenium automation tool\\driver\\geckodriver.exe");
	
	 driver= new FirefoxDriver();
	

	
}
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.manage().window().maximize();

return driver;
}
 public void screenshot(String result) throws IOException
 {
   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\Users\\MEHA\\"+result+"screenshot1.png"));
  
 }	
 }
