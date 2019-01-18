package TESTNGBasic;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentReportDemo {
@Test
	public void loginTest() throws IOException {
	System.out.println("Login to amazon");
	ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Myreport2.html");
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(reporter);
	ExtentTest logger=extent.createTest("LoginTest");
	logger.log(Status.INFO,"Login TO Amazon");
	logger.log(Status.PASS, "Title verified");
	extent.flush();
	ExtentTest logger2=extent.createTest("LogOff Test");
	logger2.log(Status.FAIL,"LogOff To Amazon");

	logger.pass("passed successfully",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Mamoni/Desktop/horse.jpg").build());
	
	logger2.fail("failed because of some issues",MediaEntityBuilder.createScreenCaptureFromPath("/Users/Mamoni/Desktop/panda.jpg").build());
	//logger2.addScreenCaptureFromPath("C/Users/Mamoni/Desktop/horse.jpg");
	extent.flush();			
	}

}
