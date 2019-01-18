package TestNGListenerconcept;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class Base {
public static WebDriver driver;
public static void initialization() {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium JARS\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://google.com");
}
public void failed() {
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFile(srcFile,new File("/web-automation/src/test/java/TestNGListenerconcept/ScreenShots"));
}
}
