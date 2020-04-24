package hw1;;

// This import is irrelevant
import java.util.*;

import pocket.complex.*;

public class Q40 {

	public static void main(String[] args) {
		
		// As java.lang is automatically imported and it has Math class in it too
		// we should explicitly specify from which package we are using the Math
		// class or it causes ambiguity.
		
		System.out.println(Math.floor(5));
		//System.out.println(java.lang.Math.floor(5));
		
		// or
		//System.out.println(pocket.complex.Math.floor(5));


	}

}
