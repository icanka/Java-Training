package hw1;

// Java compiler does not inhibit importing packages
// which contains classes of the same name.

import java.util.*;
import java.sql.*;

public class Q4 {
	
	/*
	 * Both imported java.util and java.sql packages contain a class named Date.
	 * Line 4 does not use fully qualified name for the class, as in line 5, to
	 * explicitly specify which class is going to be initialized causes ambiguity.
	 */
	
	// private java.util.Date rob = new java.util.Date();
	// private java.sql.Date rob = new java.sql.Date(0);
	// We should explicitly specify the package as in two examples above.
	private Date rob = new Date(); // causes ambiguity, the compiler to throw exception
	
	/*
	 * Using a fully qualified name ( as java.util.Date ) does not throw and
	 * exception because we are explicitly telling to compiler which package the
	 * class of the same name resides in to circumvent a situation where ambiguity
	 * arise.
	 */
	private java.util.Date sharon = new java.util.Date();

	public static void main(String[] args) {}

}
