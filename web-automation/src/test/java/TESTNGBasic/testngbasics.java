package TESTNGBasic;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngbasics {

@BeforeSuite
public void setUp() {
		System.out.println("Set Up System Property");
	}
@BeforeTest
public void launchBrowser() {
		System.out.println("Launch Chrome Browser");
	}
@BeforeClass
public void login() {
		System.out.println("Login to app");
	}
@BeforeMethod
public void enterURL() {
		System.out.println("Enter URL");
	}
/*@Test(priority=1,groups="First")
public void googleTitleTest1() {
	System.out.println("Google Title Test1");
}
@Test(priority=3,groups="First")
public void googleTitleTest2() {
	System.out.println("Google Title Test2");
}*/
/*@Test(priority=2,groups="First")
 * 
 */
/*@Test(enabled=false)
public void googleTitleTest3() {
	System.out.println("Google Title Test3");
	}*/
//@Test(priority=3,groups="Second")



@Test(dependsOnMethods="googleTitleTest5")
public void googleTitleTest6() {
	System.out.println("Google Title Test6");
}
@Test  	
public void googleTitleTest5() {
	int i=8/0;
	System.out.println("Google Title Test5");
}
@Test  	
public void googleTitleTest7() {
	System.out.println("Google Title Test5");
}
/*@Test
public void googleTitleTest4() {
	System.out.println("Google Title Test4");
}*/
@AfterMethod
public void logOut() {
	System.out.println("Logout from app");
}
@AfterClass
public void DeleteCookies() {
	System.out.println("Delete all cookies");
}
@AfterTest
public void closeBrowser() {
		System.out.println("Close Browser");
		SoftAssert st=new SoftAssert();
		st.assertEquals(true, false);
	}
@AfterSuite
public void generateReport() {
		System.out.println("Generate Test Report");
	}
}
