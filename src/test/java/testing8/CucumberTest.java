package testing8;
import Core.Base;
import static Core.Base.driver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.junit.Test;
import org.testng.annotations.*;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.SuiteRunner;
import org.testng.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import utilities.Config;

//@Listeners(ListenerTest.class)

public class CucumberTest extends Base
{
    //private static WebDriver driver;
    public Actions ac1;
    String url3;
    private CucumberTest s1;
    private Cucumber1 s2;
    private static final Logger log= Logger.getLogger("devpinoyLogger");
    
     @Test
     public void goTosubcategory()
     {
        s1=new CucumberTest();
        s2=new Cucumber1(driver);
      // Logger log = Logger.getLogger(CucumberTest.class.getName());
        s1.mainnav(s2.mainnav1);
        s1.subnav(s2.subnav1);
        s1.subsubnav(s2.subsubnav1);
        s1.navigate(s2.nav1);
        s1.subnavigate(s2.nav2);
        s1.subscribe(s2.email1,Config.mail1);
        s1.subclick(s2.sub1);
       // s1.entery(s2.cap);
        
     }
     
     
     
     public void mainnav(WebElement t1)
     {
         //ArrayList<String> handle1=new ArrayList(driver.getWindowHandles());
        // System.out.println(handle1);
         //driver.switchTo().window(handle1.get(1));
       //driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
       driver.get(Config.BaseUrl);
       driver.manage().window().maximize();
       System.out.println(t1.getText());
      // List<WebElement> E2=driver.findElements(By.xpath("//a[@class=\"ripple\"][@data-level=\"2\"]"));
      // List <WebElement> E3=driver.findElements(By.xpath("//a[@class=\"ripple\"][@data-level=\"3\"]"));
       
       if(t1.getText().equalsIgnoreCase("TUTORIAL"))
       
           System.out.println("welcome");
           ac1=new Actions(driver);
           ac1.moveToElement(t1).build().perform();
           ac1.clickAndHold(t1).build().perform();
           ac1.doubleClick(t1).build().perform();
           //ac1.contextClick(E1);
           
           //WebDriverWait wait = new WebDriverWait(driver, 1000);
          // WebElement users1 = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("foo")));
          // ac1.moveToElement(users1).build().perform();
          // ac1.doubleClick().perform();
           try {
   	        Thread.sleep(2000);
   	    } catch (InterruptedException ex) {
   	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
   	    }
           log.debug("Hover on Tutorial");
     }
     public void subnav(List<WebElement> t2)
     {
          int size1=t2.size();
          System.out.println(size1);
          for(int i=0;i<size1;i++)
          {
              System.out.println(t2.get(i).getText());
              if(t2.get(i).getText().equalsIgnoreCase("Web Automation Tools"))
              {
                  System.out.println("hiii");
                  ac1=new Actions(driver);
                  ac1.moveToElement(t2.get(i)).build().perform();
                  ac1.clickAndHold(t2.get(i)).build().perform();
                  ac1.doubleClick(t2.get(i)).build().perform();
                  t2.get(i).click();
                 // ac1.contextClick(E2.get(i));
              }
          }
          try {
     	        Thread.sleep(2000);
     	    } catch (InterruptedException ex) {
     	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
     	    }
          log.debug("Hover on webAutomation Tools");
     }
     public void subsubnav(List<WebElement> t3)
     {
           
           String val7="http://toolsqa.com/cucumber/cucumber-tutorial/";
           String val8="Cucumber";
           int num=t3.size();
           for(int i=0;i<num;i++)
           {
           String url2=t3.get(i).getAttribute("href");
           System.out.println(t3.get(i).getText());
           if(url2.equalsIgnoreCase(val7) && t3.get(i).getText().equalsIgnoreCase(val8))
           {
             System.out.println("hiii"+t3.get(i).getText());
               ac1=new Actions(driver);
               ac1.moveToElement(t3.get(i)).build().perform();
               ac1.doubleClick(t3.get(i)).build().perform();
               t3.get(i).click();
           }
           }
           try {
      	        Thread.sleep(2000);
      	    } catch (InterruptedException ex) {
      	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
      	    }
           log.debug("Click on cucumber");
     }
          // driver.navigate().to(url2);
          public void navigate(List<WebElement> t4)
          {
           String match1=driver.getCurrentUrl();
           if(match1.equalsIgnoreCase(Config.cucumber1))
           {
              // List<WebElement> list1=driver.findElements(By.xpath("//ul[@class=\"custom-nav\"]/li/a"));
              // WebElement list2=driver.findElement(By.partialLinkText("JUnit Test Runner Class"));
               for(int i=0;i<t4.size();i++)
               {
                 if(t4.get(i).getText().equalsIgnoreCase("Cucumber Basics"))
                 {
                     ac1=new Actions(driver);
                     ac1.moveToElement(t4.get(i)).build().perform();
                    // ac1.doubleClick(t4.get(i)).build().perform();
                     t4.get(i).click();
                 }
               }
           }
           try {
      	        Thread.sleep(2000);
      	    } catch (InterruptedException ex) {
      	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
      	    }
           log.debug("Hover on left Menu Cucumber Basics");
          }
          public void subnavigate(WebElement t5)
          {
              WebDriverWait wait = new WebDriverWait(driver, 1000);
              wait.until(ExpectedConditions.elementToBeClickable(t5));
                     t5.click();
                     url3=driver.getCurrentUrl();
                     System.out.println(url3);
                     try {
                	        Thread.sleep(2000);
                	    } catch (InterruptedException ex) {
                	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
                	    }
                     
                     log.debug("Click on jUnit Test runner");
                     
               }
          public void subscribe(WebElement t6,String val0)
          {
              String bal="http://toolsqa.com/cucumber/junit-test-runner-class/";
               if(t6.isDisplayed()==true && bal.equalsIgnoreCase(url3))
               {
                   t6.sendKeys(Config.mail1);
               }
               try {
          	        Thread.sleep(2000);
          	    } catch (InterruptedException ex) {
          	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
          	    }
               log.debug("Enter E-mailId in subscription textbox");
          }
          public void subclick(WebElement t7)
          {
               if(t7.isEnabled()==true)
               {
                   t7.click();
               }
               try {
          	        Thread.sleep(2000);
          	    } catch (InterruptedException ex) {
          	        Logger.getLogger(FormTest.class.getName()).log(null, ex);
          	    }
               log.debug("Click on subscribe button");
          }
          public void entery(WebElement t8)
          {
        	  if(t8.isDisplayed())
        	  {
        		  System.out.println("pass values");
        		  t8.sendKeys("Test case passed");
          }
        	  log.debug("enter text in textbox");
          }
}
