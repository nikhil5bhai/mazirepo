package HomeWork;

public class RandomNum27Jan {
	public static void main(String a[]) {
		// Math.random() number return a random double value between
		// 0 and 1, where 0 is inclusive and 1 is exclusive.
		System.out.println("Random number between 0 and 1 : " + Math.random());
		System.out.println("Random number between 0 and 1 : " + Math.random());

		// Now suppose you need random integer between 0 to 10 // you can do following
		System.out.println("Random integer between 0 and 10 : " + getRandom(10));
		System.out.println("Random integer between 0 and 10 : " + getRandom(10));

		// Now let's get random number between 1 and 10
		System.out.println("Random value between 1 and 10 : " + getRandomInteger(10, 1));
		System.out.println("Random value between 1 and 10 : " + getRandomInteger(10, 1));

		// Now let's find random number between 1 and 100
		System.out.println("Random number between 1 and 100 : " + getRandomInteger(100, 1));
		System.out.println("Random number between 1 and 100 : " + getRandomInteger(100, 1));

		// generate random number between 1000 and 9999
		System.out.println("Random value between 1000 and 9999 : " + getRandomInteger(1000, 10000));
	}

	/*
	 * * Java method to return random integer between 0 and * given number. Pay
	 * attention to brackets while casting * (int) Math.random*max will return
	 * incorrect result.
	 */
	public static int getRandom(int max) {
		return (int) (Math.random() * max);
	}

	/* * returns random integer between minimum and maximum range */
	public static int getRandomInteger(int maximum, int minimum) {
		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}
}
