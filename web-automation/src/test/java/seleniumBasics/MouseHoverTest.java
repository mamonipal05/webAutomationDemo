package seleniumBasics;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverTest {
WebDriver driver;
@Test
public void loginTest() {
	System.setProperty("webdriver.chrome.driver","D:\\Eclipse\\Selenium JARS\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
	action.moveToElement(element).perform();
	driver.findElement(By.linkText("Your Account")).click();
	//java.util.List<WebElement> links=driver.findElements(By.xpath("//div[@id='nav-flyout-yourAccount']//div[@class='nav-template nav-flyout-content nav-tpl-itemList'])"));
	//int count=links.size();
	//System.out.println(count);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollto(0,0)");
}
}
