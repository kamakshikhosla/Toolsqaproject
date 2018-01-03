package testing8;
import Core.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.ITest;
import org.testng.Reporter;
import org.testng.SuiteRunner;
import org.testng.TestNG;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigBase;

//@Listeners(ListenerTest.class)

public class FormTest extends Base
{
	//private static WebDriver driver;
	private FormTest p1;
	private Form p2;
	Robot robot;
	private static final Logger log= Logger.getLogger("devpinoyLogger");
	    
	  
	   
	     @Test(retryAnalyzer =testing8.ListenerTest.class)
	     public void formtest() throws IOException, InterruptedException
	     {
	       System.out.println("************Welcome*****************");
	       Reporter.log("Bravo!! test case passed");
	    	 p1=new FormTest();
	    	 p2=new Form(driver);
	    	 //DOMConfigurator.configure("src/test/resources/log4j.properties");
	    	 //Logger log = Logger.getLogger(FormTest.class.getName());
	    	    driver.get(ConfigBase.formUrl);
	    	    driver.manage().window().maximize();
	    	    p1.fillfirstname(p2.first1,ConfigBase.firstname);
	    	    p1.filllastname(p2.last1,ConfigBase.lastname);
	    	    p1.fillgender(p2.gender1);
	    	    p1.fillexp(p2.exp1);
	    	    p1.filldate(p2.date1,ConfigBase.date);
	    	    p1.fillprofession(p2.prof1);
	    	    p1.download(p2.link1);
	    	    p1.fillcontinent(p2.cons1);
	    	    p1.fillcommands(p2.comm1);
	    	    p1.filltool(p2.tools1);
	    	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    	    js.executeScript("window.scrollBy(0,-600)");	
	    	    p1.addphoto(p2.pic1);
	    	    p1.submitform(p2.sub1);
	    	    p1.imgcheck(p2.img1);
	    	    
	     }
	     
	    
	     public void fillfirstname(WebElement w1,String s1 ) throws  IOException, InterruptedException  
	     {
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    String actual1=driver.getCurrentUrl();
	    if(ConfigBase.formUrl.equalsIgnoreCase(actual1))
	     {
	       System.out.println("************Fill the Automation-practice form*****************");
	      if(w1.isDisplayed()==true)
	      {
	          //w1.clear();
	          w1.sendKeys(s1);
	      }
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException ex) {
	            Logger.getLogger(FormTest.class.getName()).log(null, ex);
	        }
	     }
	    log.debug("firstname is entered");
	     }
	     public void download(WebElement e00)
	     {
	    	 if(e00.isEnabled())
	    	 {
	    	 e00.click();
	    	 }
	    	 log.debug("download button is clicked");
	     }
	     public void filllastname(WebElement w2,String s2)
	     {
	      if(w2.isDisplayed()==true)
	      {
	        // w2.clear();
	         w2.sendKeys(s2);
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("lastname is entered");
	     }
	      public void fillgender(List<WebElement> w3)
	      {
	      boolean val3=false;
	      val3=w3.get(0).isSelected();
	      int size2=w3.size();
	      System.out.println("value Preselected is:"+val3+"out of number of selections"+" "+size2);
	     if(val3==true)
	     {
	         System.out.println("clicking on Female");
	         w3.get(1).click();
	     }
	     else
	     {
	         System.out.println("clicking on Male");
	         w3.get(1).click();
	     }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("gender is selected");
	      }
	      public void fillexp(WebElement w4)
	      {
	      
	      if(w4.isEnabled()==true)
	      {
	          System.out.println("clicking on experience");
	          w4.click();
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("experience is selected");
	      }
	      public void filldate(WebElement w5,String s3)
	      {
	      if(w5.isDisplayed()==true)
	      {
	     // w5.clear();
	      w5.sendKeys(s3);
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("date is entered");
	      }
	      public void fillprofession(List<WebElement> w6)
	      {
	      int size5=w6.size();
	      for(int i=0;i<size5;i++)
	      {
	        String checkval=w6.get(i).getAttribute("value");
	        if(checkval.equalsIgnoreCase("Automation Tester"))
	        {
	            System.out.println("automation tester");
	           w6.get(i).click();
	           break;
	        }
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("profession is slected");
	      }
	      public void filltool(List<WebElement> r1)
	      {
	      int size8=r1.size();
	      String check88="Selenium Webdriver";
	      for(WebElement web1:r1)
	      {
	    	  //System.out.println(web1.getAttribute("value"));
	    	  for(int i=0;i<size8;i++)
	    	  {
	    		//  System.out.println(web1.getAttribute("hii"));
	          if(web1.getAttribute("value").equalsIgnoreCase(check88))
	          {
	        	 // System.out.println("click on selenium");
	              web1.click();
	          }
	    	  }
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("tool is selected");
	      }
	      
	      public void fillcontinent(WebElement r3)
	      {
	      Select drp1=new Select(r3);
	      
	      if(drp1.isMultiple()==false)
	      {
	          //drp1.deselectAll();
	          drp1.selectByVisibleText("Australia");
	      }
	      else
	      {
	          System.out.println("Multiple selections");
	      }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("continent is slected");
	      }
	      public void fillcommands(WebElement r4)
	      {
	       Select drp2=new Select(r4);
	       Boolean val7=drp2.isMultiple();
	       if(val7==true)
	       {
	           drp2.deselectAll();
	           drp2.selectByIndex(4);
	           drp2.selectByVisibleText("Wait Commands");
	       }
	       else
	       {
	        drp2.deselectAll();
	        drp2.selectByIndex(4);   
	       }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    }
	    log.debug("commands filled");
	      }
	      public void addphoto(WebElement w9) throws InterruptedException
	      {
	     if(w9.isEnabled()==true)
	    {
	         w9.click();
	          System.out.println("upload pic");
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
	  		
	    
	     
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	    
	      }
	    }
	     log.debug("pic uploaded");
	      }
	     public void submitform(WebElement w11)
	     {
	     if(w11.isEnabled()==true)
	     {
	     w11.submit(); 
	     }
	    try {
	        Thread.sleep(2000);
	    } catch (InterruptedException ex) {
	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
	        
	    }
	    log.debug("form submitted");
	     }
	     public void imgcheck(WebElement w10)
	     {
	     if(w10.isDisplayed()==true)
	     {
	         System.out.println("image css check");
	         String class1=w10.getAttribute("class").toString();
	         System.out.println("class of logo is:"+class1);
	          Dimension img1=w10.getSize();
	          int h1=img1.getHeight();
	          int h2=img1.getWidth();
	          System.out.println("height of logo:"+h1+"width of logo:"+h2);
	          String size7=w10.getCssValue("sizes");
	          System.out.println("size of image is:"+size7);
	          System.out.println("image source is:"+w10.getAttribute("src"));
	          w10.click();
	     }
	     log.debug("image css is checked");
	     //driver.navigate().back();
	}
}
