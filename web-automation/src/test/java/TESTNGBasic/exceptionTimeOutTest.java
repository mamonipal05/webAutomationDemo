package TESTNGBasic;

import org.testng.annotations.Test;

public class exceptionTimeOutTest {
	@Test(invocationCount=10,invocationTimeOut=1000)
	public void tc() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
}
//it will fail because 10 iteration will not be completed in 1 sec.