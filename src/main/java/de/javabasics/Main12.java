package de.javabasics;

public class Main12 {

	public static void main(String[] args) {
		final java.lang.String object1 = new java.lang.String("a");
		final java.lang.String object2 = new java.lang.String("a");
		java.lang.System.out
				.println(object1.equals(object2)); /* true Vgl. der Texte */
		java.lang.System.out
				.println(object1 == object2); /* false Vgl. der Objekte */
	}
}
