package refactoring;

public class Main {
	public static void main(String[] args){
		Customer cust = new Customer("Some Guy");
		Movie movieA = new Movie("NewRelease Movie A", Movie.NEW_RELEASE);
		Movie movieB = new Movie("Children Movie B", Movie.CHILDREN);
		Movie movieC = new Movie("Regular Movie C", Movie.REGULAR);
		Movie movieD = new Movie("NewRelease Movie D", Movie.NEW_RELEASE);

		cust.addRental(new Rental(movieA, 2));
		cust.addRental(new Rental(movieB, 4));
		cust.addRental(new Rental(movieC, 3));
		cust.addRental(new Rental(movieD, 2));

		System.out.println(cust.statement());
	}
}
