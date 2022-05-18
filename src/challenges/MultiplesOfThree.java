package challenges;

public class MultiplesOfThree {
	// the goal of this logic challenge is to print only numbers that are
	// multipliable by 3 in a range from 0 to 100 using the for method

	public static void main(String[] args) {

		int number = 0;

		for (int counter = 0; counter <= 100; counter++) {

			number++;

			// % is a operator called module, it basically checks if a number is divisable
			// with another one you specify

			if (number % 3 == 0) {
				System.out.println(number);
			}

		}

	}

}
