package collectionexamples;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class MapTest {
	
	Map<Integer, String> empDetails = new HashMap<Integer, String>();
	
	
	@Test
	public void test1() {
		empDetails.put(111, "Nikhil");
		empDetails.put(222, "Yogita");
		empDetails.put(333, "Sarika");
		empDetails.put(444, "Priyanka");
		empDetails.put(666, "Syed");
		empDetails.put(777, "Shruthi");
		empDetails.put(888, "Laxmi");
		empDetails.put(999, "Zaheer");
		empDetails.put(1111, "Fayaz");
		
		
		System.out.println(empDetails.get(333));
		
		empDetails.put(333, "Amar");    						//overrides old value
		System.out.println("new value "+empDetails.get(333));  
		
		
		//TODO - iterate the map
	}
}
