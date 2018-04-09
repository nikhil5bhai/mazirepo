package temp;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataTest {

	int[] numbers = { 60, 30, 20, 60, 5 };

	// @Test
	// public void test1() {
	// for (int i = 0; i < numbers.length; i++) {
	// System.out.println("Numbers of i " + numbers[i]);
	// assertTrue(numbers[i] > 25, "One/More number is greater than 25");
	// }
	// }

	@DataProvider(name = "numData")
	public Object[][] numbersData() {
		Object[][] data = { { 10 }, { 20 }, { 60 }, { 10 }, { 30 } };
		return data;
	}

	@Test(dataProvider = "numData")
	public void test(int number) {
		System.out.println("Number is " + number);
		assertTrue(number > 25, "Number is less than 25");

	}

}
