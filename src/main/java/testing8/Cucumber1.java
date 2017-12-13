package testing8;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author dell PC
 */
public class Cucumber1 
{
@FindBy(xpath="//nav[@class=\"navigation\"]/ul/li[2]/a")
   public WebElement mainnav1;
   @FindAll({@FindBy(xpath="//a[@class=\"ripple\"][@data-level=\"2\"]")})
   public List<WebElement> subnav1;
   @FindAll({@FindBy(xpath="//a[@class=\"ripple\"][@data-level=\"3\"]")})
   public List<WebElement> subsubnav1;
   @FindAll({@FindBy(xpath="//ul[@class=\"custom-nav\"]/li/a")})
   public List<WebElement> nav1;
    @FindBy(partialLinkText="JUnit Test Runner Class")
    public WebElement nav2;
    @FindBy(css="input[name=\"email\"]")
   public WebElement email1;
     @FindBy(css="input[value=\"Subscribe\"]")
   public WebElement sub1;
     @FindBy(css="input#verifyBox")
     public WebElement cap;
     
     public Cucumber1(WebDriver driver)
     {
         super();
         PageFactory.initElements(driver,this);
     }
}