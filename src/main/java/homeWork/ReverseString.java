package homeWork;

public class ReverseString {
	
	public static void main(String[] args) {
		String text = "SanFrancisco";
		
		System.out.println(text.substring(2, 4));
		for (int i=text.length()-1; i>=0; i--) {
			System.out.print(text.charAt(i));
			
		}
	}

}
