package de.javabasics;

public final class PrintToString {

	public static void printToString(final java.lang.Object o) {
		java.lang.System.out.println(o.toString());
	}

	public static void main(final java.lang.String[] args) {
		printToString(java.lang.System.out);
	}
}