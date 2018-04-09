package fin;

import org.testng.annotations.Test;

public final class A1 {
	
	final int i=20;
	int k=30;
	
	@Test
	public void test1() {
		System.out.println(i);	
		System.out.println(k);
		k=45;
		System.out.println(k);
		//i=55;
	}
	
	 public final void hi() {
		 System.out.println("hi");
	 }
	
	

}
