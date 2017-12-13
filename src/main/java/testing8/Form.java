package testing8;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form
{
	@FindBy(name="firstname")
	   public WebElement first1;
	   @FindBy(name="lastname")
	   public WebElement last1;
	   @FindAll({@FindBy(name="sex")})
	   public List<WebElement> gender1;
	    @FindBy(id="exp-2")
	   public WebElement exp1;
	    @FindBy(id="datepicker")
	    public WebElement date1;
	    @FindAll({@FindBy(name="tool")})
	   public List<WebElement> tools1;
	     @FindBy(name="continents")
	   public WebElement cons1;
	      @FindAll({@FindBy(name="profession")})
	   public List<WebElement> prof1;
	      @FindBy(name="selenium_commands")
	   public WebElement comm1;
	        @FindBy(name="photo")
	   public WebElement pic1;
	         @FindBy(id="submit")
	   public WebElement sub1;
	      @FindBy(xpath="//img[@class=\" preload-me\"]")
	   public WebElement img1;
	    //a[contains(text(),"Selenium Automation Hybrid Framework")]
	      @FindBy(xpath="//a[contains(text(),\"Selenium Automation Hybrid Framework\")]")
	      public WebElement link1;
	     
	    
	    //@FindAll({@FindBy(name="")})
		//public List<WebElement> iconsResultPage;  
	    public Form(WebDriver driver)
	    {
	     super();  
	     PageFactory.initElements(driver,this);
	    }
}
