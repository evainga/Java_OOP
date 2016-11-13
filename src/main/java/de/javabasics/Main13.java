package de.javabasics;

public class Main13 {

	public static void main(String[] args) {
		final java.lang.NoSuchMethodException n = new java.lang.NoSuchMethodException();
		java.lang.System.out.println(n);
		final java.lang.RuntimeException r = new java.lang.RuntimeException(n);
		java.lang.System.out.println(r);
		java.lang.System.out.println(r.getCause());
	}
}
