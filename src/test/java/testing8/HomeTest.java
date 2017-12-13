package testing8;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import com.thoughtworks.selenium.Wait;

import org.testng.ITest;
import org.testng.SuiteRunner;
import org.testng.TestNG;
//import static org.junit.Assert.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.apache.log4j.Logger;
import Core.Base;
import static Core.Base.driver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Config;
import testing8.Home;

//@Listeners(ListenerTest.class)
public class HomeTest extends Base
{
	//private static WebDriver driver;
    // WebDriver driver1;
   // public static mckeinsytest mc;
    // baseclass b1;
    private HomeTest t1;
    private Home t2;
    public WebDriverWait wait;
    Actions action;
    String url4;
    private static final Logger log= Logger.getLogger("devpinoyLogger");
    
    @Test(priority=1)
	 public void test3() throws InterruptedException
	 {

		 driver.get("http://store.demoqa.com/products-page/product-category/ipods/apple-ipod-touch-32gb-5th-generation-black/");
driver.findElement(By.className("wpsc_buy_button")).click();
Thread.sleep(2000);
String type1=driver.findElement(By.className("wpsc_buy_button")).getAttribute("type");
System.out.println(type1);
driver.navigate().refresh();
Thread.sleep(2000);
driver.findElement(By.className("cart_icon")).click();
Thread.sleep(2000);
driver.findElement(By.name("quantity")).clear();
Thread.sleep(2000);
driver.findElement(By.name("quantity")).sendKeys("2");
Thread.sleep(2000);
driver.findElement(By.name("submit")).click();
Thread.sleep(2000);
String amount=driver.findElement(By.className("pricedisplay")).getText();
System.out.println(amount);
driver.findElement(By.className("step2")).click();
WebElement ac3=driver.findElement(By.xpath("//li[@id=\"menu-item-33\"]/a"));
Actions ac1=new Actions(driver);
ac1.moveToElement(driver.findElement(By.xpath("//li[@id=\"menu-item-33\"]/a"))).build().perform();
Thread.sleep(2000);
String val1="Product Category";
if(ac3.getText().equalsIgnoreCase(val1))
{
	System.out.println("move to imacs products");
	ac1.click(driver.findElement(By.xpath("//li[@id=\"menu-item-35\"]/a"))).build().perform();
}


	 }
    
    @Test(priority=2)
    public void GotoHomePage() throws IOException, InterruptedException
    {
        t1=new HomeTest();
        t2=new Home(driver);
        String ccpage=Config.BaseUrl;
     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get(ccpage);
     //ArrayList<String> hand1=new ArrayList(driver.getWindowHandles());
     //System.out.println(hand1);
     //driver.switchTo().window(hand1.get(1));
     driver.manage().window().maximize();
     t1.search(t2.search1);
     t1.searchtext(t2.searchtext,Config.search);
     //t1.switch1();
     t1.hover1(t2.mainnav);
     t1.subhover(t2.subnav);
     //t1.prohover(t2.hover2);
     t1.prohover1(t2.hover1);
    // t1.clickfb(t2.fb);
    // t1.rating(t2.star);
     //t1.cart1(t2.cart);
    // t1.item2(t2.item1);
      
    }
      
       
       public void search(WebElement e1) 
       {
     System.out.println("**********************searching element******************");
     String title1=driver.getTitle();
     System.out.println(title1);
     String actual="QA Automation Tools Tutorial";
     if(title1.equalsIgnoreCase(actual))
     {
         System.out.println(title1+"hiiii");
         if(e1.isDisplayed()==true)
         {
      System.out.println("click on search icon");
      e1.click();
         }
      //Thread.sleep(1000); 
         log.debug("click on search icon");
       }
      else
     {
         System.out.println("**********************Navigated to wrong website******************");
     }
       }
     public void searchtext(WebElement e2,String val1)
     {
         System.out.println("**********************Keyword search******************");
     if(e2.isDisplayed()==true)
     {
      e2.sendKeys(val1);
     }
     log.debug("enter text in searchbox");
     }
      ///switch dismiss
     
   ///hover///
     public void hover1(WebElement e3)
     {
         System.out.println("**********************Navmenu hover******************");
      //wait = new WebDriverWait(driver, 100);
      //wait.until(ExpectedConditions.elementToBeClickable(e3));
      String val1=e3.getCssValue("z-index");
      System.out.println("Z-index value is:"+val1);
      //List<WebElement> E4=driver.findElements(By.xpath("//ul[@class=\"sub-nav hover-style-click-bg level-arrows-on\"]/li/a"));
       String HoverElement=e3.getText();
       String attr=e3.getAttribute("data-level");
      System.out.println(attr);
      if(HoverElement.equalsIgnoreCase(Config.hover) && attr.equalsIgnoreCase("1"))
      {
       System.out.println("Hover on Element:"+HoverElement);
        System.out.println("welcome");
              action=new Actions(driver);
              action.moveToElement(e3).build().perform();
              action.clickAndHold(e3).build().perform();
              //action.doubleClick(e3).build().perform(); 
      }
      log.debug("hover on main nav demosites");
         }
     public void subhover(List<WebElement> e4)
     {
         System.out.println("**********************submenu click******************");
       //WebElement users; 
       //users = wait.until(ExpectedConditions.visibilityOfAllElements(List<WebElement> e4));
       String val7="http://toolsqa.com/automation-practice-form/";
       String val8="E-Commerce Demo Site";
       int num=e4.size();
       System.out.println(num+"helllo");
       for(int i=0;i<num;i++)
       {
       String url2=e4.get(i).getAttribute("href");
       //System.out.println(e4.get(i).getText());
       if(e4.get(i).getText().equalsIgnoreCase(val8))
       {
         System.out.println("hiii"+e4.get(i).getText());
           action=new Actions(driver);
           action.moveToElement(e4.get(i)).build().perform();
           action.doubleClick(e4.get(i)).build().perform();
           e4.get(i).click();
       }
       }
       log.debug("click on e-commerce demo site");
       }
     public void prohover(WebElement x1)
     {
    	 ArrayList<String> winhand=new ArrayList(driver.getWindowHandles());
    	 driver.switchTo().window(winhand.get(1));
    	 action=new Actions(driver);
    	 action.moveToElement(x1);
    	 
    	 
     }
     public void prohover1(WebElement x2)
     {
    	 ArrayList<String> winhand=new ArrayList(driver.getWindowHandles());
    	 driver.switchTo().window(winhand.get(1));
    	 action.doubleClick(x2);
    	 driver.navigate().to("http://store.demoqa.com/products-page/product-category/ipods/apple-ipod-touch-32gb-5th-generation-black/");
     log.debug("iphone got selected");
     }
     public void rating(WebElement x4)
     {
    	 if(x4.isEnabled())
    	 {
    	 x4.click();
    	 }
     }
     public void clickfb(WebElement x3)
     {
    	 if(x3.isEnabled())
    	 {
    		 x3.click();
    	 }
     }
     public void cart1(WebElement c4)
     {
    	 if(c4.isEnabled())
    	 {
    		 System.out.println("add to cart");
    		 c4.click();
    	 }
    	 log.debug("item added to cart");
     }
     public void item2(WebElement c5)
     {
    	 String val3="http://store.demoqa.com/products-page/checkout/";
    	 if(c5.isEnabled() && c5.getAttribute("href").equalsIgnoreCase(val3))
    	 {
    		 System.out.println("checkout");
    		 c5.click();
    		url4=driver.getCurrentUrl();
    	 }
     }
     public void buy6(WebElement c7)
     {
    	String url8="http://store.demoqa.com/products-page/checkout/";
    	if(url8.equalsIgnoreCase(url4))
    	{
    		c7.clear();
    		//c7.sendKeys(2);
    	}
    	
     }
    
    
 
}