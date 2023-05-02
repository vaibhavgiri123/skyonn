import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNG1 {

	@BeforeClass
	public void names()
	{
		System.out.println(" before class");
	}
	@Test
	public void supriya() {
		System.out.println(" supriya 1");
	}

	@Test
	public void kiran() {
		System.out.println(" kiran 2");
	}

	@Test
	public void vaibhav() {
		System.out.println(" vaibhav 3");
	}

	@AfterClass
	public void name2()
	{
		System.out.println("after class");
	}
	

}
