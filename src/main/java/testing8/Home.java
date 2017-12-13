package testing8;

import Core.Base;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Base
{
	@FindBy(id="trigger-overlay")
	   public WebElement search1;
	   @FindBy(className="searchform-s")
	   public WebElement searchtext;
	    @FindBy(xpath="//nav[@class=\"navigation\"]/ul/li[8]/a")
	   public WebElement mainnav;
	    @FindAll({@FindBy(xpath="//a[@class=\"ripple\"][@data-level=\"2\"]")})
	    public List <WebElement> subnav;
	    @FindBy(xpath="//li[@id=\"menu-item-33\"]/a")
	    public WebElement hover1;
	    @FindBy(xpath="//li[@id=\"menu-item-16\"]/a")
	    public WebElement hover2;
	    @FindBy(xpath="//a[contains(text(),\"5\")]")
	    public WebElement star;
	    @FindBy(xpath="//a[@id=\"u_0_2\"]")
	    public WebElement fb;
	    @FindBy(className="wpsc_buy_button")
	    public WebElement cart;
	    @FindBy(xpath="//div[@id=\"header_cart\"]/a")
	    public WebElement item1;
	   // @FindBy("//input[@class=\"quantity\"]")
	   // public WebElement edit1;
	    
	    
	   
	    
//	    @FindBy(Tagname="a")
//	    public List<WebElement> links1;
	    
	   // @FindAll({@FindBy(name="")})
		//public List<WebElement> iconsResultPage; 
	    
	    public Home(WebDriver driver)
	   {
	    super();
	      // System.out.println(super.driver);
	    PageFactory.initElements(driver,this);
	   }
}
