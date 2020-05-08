package hw4;

public class Q43 {

	public static void main(String[] args) {
		
		// Listing is a two-dimensional array, having varied size
		// arrays in the second dimension.
		String[][] listing = new String[][] { { "Book" }, { "Game", "29.99" } };
		
		// listing array has the size 2, first array in the listing array
		// has the size one ( { "Book" } )
		System.out.println(listing.length + " " + listing[0].length);

	}

}
