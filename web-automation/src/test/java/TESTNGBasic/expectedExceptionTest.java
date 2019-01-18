package TESTNGBasic;

import org.testng.annotations.Test;

public class expectedExceptionTest {

	@Test(expectedExceptions=NumberFormatException.class)
	public void test1()
	{
		String x="100A";
		System.out.println(Integer.parseInt(x));
		}
}
//expectedExceptions keyword helps to handle any known exception
