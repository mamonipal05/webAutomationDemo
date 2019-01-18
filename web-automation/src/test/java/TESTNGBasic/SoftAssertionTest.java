package TESTNGBasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	SoftAssert softAssert=new SoftAssert();
	
@Test
public void test1() {
System.out.println("Open Browser");
System.out.println("Enter username");
System.out.println("Enter password");
System.out.println("Click on sign in button");
Assert.assertEquals(true, false,"Login failed due to some error");
System.out.println("Login Successful");
System.out.println("Validate homepage");
softAssert.assertEquals(true, false,"Homepage is not validated");
System.out.println("Enter Contact Details");
softAssert.assertEquals(true, false);
softAssert.assertAll();
}
@Test
public void test2() {
	System.out.println("Logout");
	softAssert.assertEquals(true,false,"Logout failed");
	softAssert.assertAll();
}
}

