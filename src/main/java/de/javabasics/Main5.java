package de.javabasics;

public class Main5 {

	public static void printName(java.util.logging.Logger s) {
		java.lang.System.out.println(s.getName());
	}

	public static void main(String[] args) {
		printName(java.util.logging.Logger.getLogger("abc"));
		printName(java.util.logging.Logger.getLogger("def"));
	}

}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/methoden_objekte_java
// getter (1)
