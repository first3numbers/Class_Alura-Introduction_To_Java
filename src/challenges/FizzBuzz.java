package challenges;

class FizzBuzz {

	/*
	 * Complete the 'fizzBuzz' function below.
	 *
	 * The function accepts INTEGER n as parameter.
	 */

	public static void main(String[] args) {
		// Write your code here

		int givenNumber = 15;

		for (int counter = 1; counter <= givenNumber; counter++) {

			if (counter % 3 == 0 && counter % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (counter % 3 == 0) {
				System.out.println("Fizz");
			} else if (counter % 5 == 0) {
				System.out.println("Buzz");
			} else if (counter <= givenNumber) {
				System.out.println(counter);
			}
		}

	}

}
