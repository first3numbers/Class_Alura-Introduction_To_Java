package challenges;

public class MovieWatchList2 {

	static double movieLength[] = { 1.90, 1.04, 1.25, 2.5, 1.75 };
	static double maximumMovieLength = 3.0;

	static double sum() {

		double sum = 0;
		int nescessaryDays = 0;
		int counter;

		for (counter = 0; counter < movieLength.length; counter++) {

			sum += movieLength[counter];

			if (sum >= maximumMovieLength) {
				nescessaryDays++;
				sum = 0;
				counter--;
			}

			// it is still counting every time a new value is added, and it stops once the
			// sum becomes greater than 3

		}

		System.out.println(nescessaryDays);

		return sum;
	}

	public static void main(String[] args) {
		sum();
	}
}
