package temp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DpTest2 {
	
	@DataProvider (name= "loginData")
	public Object[][] credentials(){
		Object[][] cred= {{"username1", "pwd1"}, {"username2", "pwd2"}, {"username3", "pwd3"}};
		return cred;
	}
	
	@Test (dataProvider = "loginData")
	public void loginTest(String a, String b) {
		System.out.println(a+ " "  +b);
		
	}

}
