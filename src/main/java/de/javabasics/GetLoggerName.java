package de.javabasics;

import java.util.logging.Logger;

public class GetLoggerName {

	public static void printName(Logger s) {
		System.out.println(s.getName());
	}

	public static void main(String[] args) {
		printName(Logger.getLogger("abc"));
		printName(Logger.getLogger("def"));
	}

}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/methoden_objekte_java
// getter (1)
