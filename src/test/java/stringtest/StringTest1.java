package stringtest;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class StringTest1 {
	int a =10;
	int b =15;
	String s = "Amar";
	String ss = "amar";
	
	@Test
	public void test1() {
		//assertTrue(a==b, "integers not equal");	
		//assertTrue(s.equals(ss), "Strings are not same");
		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());
		assertTrue(s==(ss), "Strings are not same");
	}
	
	
	@Test
	public void test2() {
		String name1 = "aaa";
		String name2 = new String ("aaa");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1.equals(name2));
		System.out.println(name1==name2);
		}
	
}
