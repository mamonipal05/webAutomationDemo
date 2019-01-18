package TESTNGBasic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportScreenshot {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;

@BeforeMethod
public void setUp() {
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Myreport3.html");
	new ExtentReports();
	extent.attachReporter(reporter);
	extent.createTest("LoginTest");
}
@AfterMethod
public void tearDown(ITestResult result) throws IOException {
	if (result.getStatus()==ITestResult.FAILURE)
	{
		//String temp=Utility.captureScreenshot(driver);
		//logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	
	}
	extent.flush();
	driver.quit();
}
public void loginTest() throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Selenium JARS\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.google.com");
	System.out.println("Title is :"+driver.getTitle());
	Assert.assertTrue(driver.getTitle().contains("Mamoni"));
	
	
	
	
	/*System.out.println("Login to amazon");
	
	logger.log(Status.INFO,"Login TO Amazon");
	logger.log(Status.PASS, "Title verified");
	extent.flush();
	ExtentTest logger2=extent.createTest("LogOff Test");
	logger2.log(Status.FAIL,"LogOff To Amazon");
	logger.pass("passed successfully",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Mamoni/Desktop/horse.jpg").build());
	
	logger2.fail("failed because of some issues",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Mamoni/Desktop/panda.jpg").build());
	//logger2.addScreenCaptureFromPath("C/Users/Mamoni/Desktop/horse.jpg");
	extent.flush();	*/
	
}
}
