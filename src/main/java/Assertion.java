import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test(priority=1)
	public void m1()
	{
		String a="vaibhav";
		String b="anuja";
		SoftAssert soft=new SoftAssert();       
		soft.assertEquals(a,b);                   //java.lang.AssertionError: expected [vaibhav] but found [anuja]
		System.out.println(" soft assertion is passed");
	}
	@Test(priority=2)
	public void m2()
	{
		
		String a="anuja";
		String b="vaibhav";
 Assert.assertEquals(a,b);
 System.out.println("passed");
	
	}
}
