package jan17;

import java.sql.Timestamp;
import java.util.Random;

import org.testng.annotations.Test;

public class RandomNumberTest {
	
	@Test
	public void test1() {
		Random random = new Random();
		int myRandomNum = random.nextInt(100);
		System.out.println(myRandomNum);
	}
	
	@Test
	public void test2() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp);	
		
	}

}
