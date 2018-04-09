package poly;

import org.testng.annotations.Test;

public class B extends A {
	
	public String getFullName(String fname, String lname) {
		String fullname = fname+" "+lname;
		return fullname;
	}
	
	public void hello() {
		System.out.println("hello");
	}
	
	
	@Test
	public void test1() {
	   getFullName("nik", "hil");
	   super.getFullName("nik", "hil");  // calling from parent class
	}

}
