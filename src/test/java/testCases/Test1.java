package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

	@Test(priority=1)
	public void test_login() {
		
		System.out.println("Login Test Passed....");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void test_logout() {
		
		System.out.println("Logout Test Passed....");
		Assert.assertTrue(true);
	}

}
