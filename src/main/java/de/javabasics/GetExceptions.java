package de.javabasics;

public class GetExceptions {

	public static void main(String[] args) {
		final NoSuchMethodException n = new NoSuchMethodException();
		System.out.println(n);
		final RuntimeException r = new RuntimeException(n);
		System.out.println(r);
		System.out.println(r.getCause());
	}
}
