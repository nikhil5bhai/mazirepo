package HomeWork;


import org.testng.annotations.Test;

public class FindDuplicates27Jan {
	String[] arr1 = new String[] { "aaa", "bbb", "aaa", "xxx", "yyy", "ggg", "yyy", "bbb", "bbb" };

	@Test
	public void test1() {
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i].equals(arr1[j])) {
					System.out.println(arr1[i] + " is a duplicate element");
				}
			}

		}

	}
}
