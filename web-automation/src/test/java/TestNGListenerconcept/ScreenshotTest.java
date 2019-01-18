package TestNGListenerconcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTest {

	@BeforeMethod
	public void beforeMethod() {
		
	}
	@Test
	public void takeScreenshot() {
		Assert.assertEquals(true, false);
	}
	@AfterMethod
	public void tearDown() {
		
	}
}
