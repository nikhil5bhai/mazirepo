package collectionexamples;

import org.testng.annotations.Test;

public class StringTest {
	
	
	String name1 = "OOO";
	String name2 = "OOO";
	String name3 = new String("OOO");
	
	@Test
	public void test1() {
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name3.hashCode());
		
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3));
		
	}
	
	@Test
	public void stringBufferTest() {
		StringBuffer stringbuffer = new StringBuffer("nikhil");
		stringbuffer.append("yogita");
		stringbuffer.append("sarika");
		stringbuffer.append("priyanka");
		stringbuffer.append("syed");
		stringbuffer.append("shruthi");
		stringbuffer.append("laxmi");
		stringbuffer.append("zaheer");
		stringbuffer.append("fayaz");
		stringbuffer.append("amar");		
	
		System.out.println(stringbuffer);
		
		String data = stringbuffer.toString();
		System.out.println(data);		
	}

}
