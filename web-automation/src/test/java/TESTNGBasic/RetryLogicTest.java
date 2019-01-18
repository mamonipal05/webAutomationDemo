package TESTNGBasic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicTest {
@Test
//@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)
	public void test1() {
	Assert.assertEquals(true,false);
}
@Test
//@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)
public void test2() {
Assert.assertEquals(true,false);
}
@Test
//@Test(retryAnalyzer=analyzer.RetryAnalyzer.class)
public void test3() {
Assert.assertEquals(true,true);
}
}
			
