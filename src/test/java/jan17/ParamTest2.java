package jan17;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest2 {
	
	@Test
	 @Parameters({ "username", "pwd" })
	public void test2(String username, String pwd) {
		System.out.println(username);
		System.out.println(pwd);		
	}
}
