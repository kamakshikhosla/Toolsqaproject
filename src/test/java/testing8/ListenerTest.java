package testing8;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;
import Core.Base;

public class ListenerTest extends Base implements ITestListener,IRetryAnalyzer
{
	int counter = 0;
	int retryLimit = 4;
	private static final Logger log= Logger.getLogger("devpinoyLogger");

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
	System.out.println("Bie");	
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("try again");	
	}

	public void onTestFailure(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    // now copy the  screenshot to desired location using copyFile //method
	   try {
		   //E:\\selenium logs\\"+fileName+"-"+dateFormat.format(date)+".png
		   //C:\\toolsqatest\\screenshots\\error.png+System.currentTimeMillis()+\".png
		FileUtils.copyFile(src, new File("C:\\toolsqatest\\screenshots\\"+System.currentTimeMillis()+".png"));
		System.out.println("\n***** SCENARIO is FAILED *****");
		log.debug(new File("C:\\toolsqatest\\screenshots\\"+System.currentTimeMillis()+".png"));
		Reporter.log("test failed");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("test successfully passed");
		
	}

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}

	

}
