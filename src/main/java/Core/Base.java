package Core;



//import java.io.File;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;
//import com.sun.jna.platform.FileUtils;

//import testing8.Demo;
import utilities.ConfigBase;

public class Base 
{
	public static WebDriver driver;
	private static final Logger log= Logger.getLogger("devpinoyLogger");
	//Logger log1 = Logger.getLogger("devpinoyLogger");
	 //private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);
	//public static com.gargoylesoftware.htmlunit.WebConsole.Logger log=(com.gargoylesoftware.htmlunit.WebConsole.Logger) Logger.getLogger("devpinoyLogger");
	
	
	   @BeforeClass
	     public static void setUp() 
	     {
		  // DOMConfigurator.configure("src/test/resources/log4j.properties"); 
	      
	      //System.setProperty("webdriver.firefox.driver","D:\\geckodriver.exe");
	      if(ConfigBase.browser!=null)
	      {
	          if(ConfigBase.browser.equalsIgnoreCase("chrome"))
	          {
	        	  System.setProperty("webdriver.chrome.driver","C:\\Users\\1037361\\workspace\\testing8\\src\\test\\resources\\chromedriver.exe");
	             driver  = new ChromeDriver(); 
	            
	            log.debug("browser chrome is opened");
	          }
	          else if(ConfigBase.browser.equalsIgnoreCase("firefox"))
	          {
	        	  System.setProperty("webdriver.firefox.driver","C:\\toolsqatest\\src\\test\\resources\\geckodriver.exe");
	             driver  = new FirefoxDriver();
	          }
	      }
	      else
	       {
	      System.out.println("default browser");
	      driver  = new ChromeDriver();  
	      log.debug("Open Chrome Broweser");
	       } 
	     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     // driver.manage().deleteAllCookies();
	     // driver.manage().window().maximize();
	     // driver.manage().timeouts().setScriptTimeout(60,TimeUnit.SECONDS);
	     // driver.navigate().refresh();
	     }
	   
	 @AfterClass
	 
	public static void tearDownClass() throws InterruptedException 
	 {
	  
	   
	  //  if (scenario.isFailed()) {
	//try 
	//{
	//final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

	//scenario.embed(screenshot,"image/jpg");
	  //  } 
	//catch (Exception e) 
	//{
	//e.printStackTrace();
	//}
	//String scenarioupdated = scenario.getName().toString().replace("","-");
	//String systime = newSimpleDateFormat("YYYY:MM:dd_hh:mm:ss").format(new Date()).toString().replace("","-");
	//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(scrFile, new File("target/screenshots/"+ scenarioupdated + "_" + systime +".jpg"));
	//System.out.println("\n***** SCENARIO" + scenario.getName()+ "is FAILED *****");

	//System.out.println("pageTitle"+driver.getTitle());

	//System.out.println("currenturl" +driver.getCurrentUrl());

	//}
	//else
	    
	//{
	//System.out.println(".....SCENARIO IS PASSED.....");
	//}
		
	//driver.manage().deleteAllCookies();
		 Thread.sleep(2000);
		 //log.debug("cookies deleted");

	//driver.close();
		 log.debug("Browser closed");


}
}
