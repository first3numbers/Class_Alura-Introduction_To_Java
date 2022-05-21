package challenges;

public class MovieWatchList {

	static double movieLength[] = { 1.90, 1.04, 1.25, 2.5, 1.75 };
	static double maximumMovieLength = 3.0;

	public static void main(String[] args) {

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

			System.out.println(sum);

		}

		System.out.println("Você precisaria de " + nescessaryDays + " dias para assistir todos estes filmes.");

	}

}
