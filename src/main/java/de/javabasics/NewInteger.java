package de.javabasics;

public class NewInteger {

	public static void main(String[] args) {
		final Integer i = new Integer(2);
		System.out.println(i);
		System.out.println(i.intValue());
	}
}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_exemplarerzeugung_de
/*
 * Erster Teil der Aufgabe public class Main6 { public static void main(String[]
 * args) { java.lang.System.out.println(new java.lang.Integer(2)); } }
 */