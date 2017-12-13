package testing8;

import java.awt.AWTException;	
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import org.sikuli.script.*;
//import org.sikuli.script.Screen;
//import org.sikuli.script.FindFailed;

//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Key;
//import org.sikuli.script.Match;
//import org.sikuli.script.Screen;


import utilities.Config;

public class test 
{
	public static WebDriver driver;
	private static final Logger log= Logger.getLogger("devpinoyLogger");
	Robot robot;
	//Logger log1 = Logger.getLogger("devpinoyLogger");
	 //private static org.apache.log4j.Logger log = Logger.getLogger(LogClass.class);
	//public static com.gargoylesoftware.htmlunit.WebConsole.Logger log=(com.gargoylesoftware.htmlunit.WebConsole.Logger) Logger.getLogger("devpinoyLogger");
    
	   @BeforeSuite
	     public static void setUp() 
	     {
		  // DOMConfigurator.configure("src/test/resources/log4j.properties"); 
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\1037361\\workspace\\testing8\\src\\test\\resources\\chromedriver.exe");
	      //System.setProperty("webdriver.firefox.driver","D:\\geckodriver.exe");
	      if(Config.browser!=null)
	      {
	          if(Config.browser.equalsIgnoreCase("chrome"))
	          {
	             driver  = new ChromeDriver(); 
	            
	            log.debug("browser chrome is opened");
	          }
	          else if(Config.browser.equalsIgnoreCase("firefox"))
	          {
	             //driver  = new FirefoxDriver();
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
	   
	 @AfterSuite
	 
	public static void tearDownClass() 
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
		 log.debug("cookies deleted");

	//driver.close();
		 log.debug("Browser closed");

	 }
	 @Test
	 public void test5()
	 {
		 driver.get("http://demo.guru99.com/selenium/drag_drop.html");
		 driver.manage().window().maximize();
		 Actions ac1=new Actions(driver);
		 WebElement to=driver.findElement(By.xpath("//ol[@id=\"bank\"]/li[1]"));
		 WebElement from=driver.findElement(By.xpath("//li[@id=\"credit4\"]/a"));
		 ac1.dragAndDrop(from,to).build().perform();
		 ac1.contextClick(from);
		 
		
		 
		 
	 }
	 @Test(priority=1)
	 public void test3() throws InterruptedException
	 {
		 driver.get("http://toolsqa.com/automation-practice-form/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("photo")).click();
		 //driver.findElement(By.xpath("//a[@href=contains(text(),'array formula calendar.xls')]")).click();
		 
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  // Robot class throws AWT Exception	
		StringSelection filePath = new StringSelection(
				 "C:\\Users\\1037361\\Desktop\\errors.png");

				   Toolkit.getDefaultToolkit().getSystemClipboard()
				    .setContents(filePath, null);

				   //Robot rb = new Robot();
				  Thread.sleep(5000);
				  robot.keyPress(KeyEvent.VK_CONTROL);
				  robot.keyPress(KeyEvent.VK_V);
				  robot.keyRelease(KeyEvent.VK_CONTROL);
				  robot.keyRelease(KeyEvent.VK_V);
				  Thread.sleep(6000);
				  robot.keyPress(KeyEvent.VK_ENTER);
				  robot.keyRelease(KeyEvent.VK_ENTER);
				  Thread.sleep(10000);
		
	 }
	
	
}
