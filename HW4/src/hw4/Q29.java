package hw4;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows" };
		Arrays.sort(os);
		
		for(String i : os) {
			System.out.print(i + ", ");
		}
		
		// binarySearch method returns index of the search key, if it is contained
		// in the array; otherwise, (-(insertion point) - 1). 
		System.out.println(Arrays.binarySearch(os, "Redhat"));
	}

}
