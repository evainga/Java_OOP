package de.javabasics;

public final class DereferenciateVsReassign {

	public static void m(StringBuilder s) {
		s.replace(0, Integer.MAX_VALUE, "gamma");
		System.out.println(s);
		s = new StringBuilder("delta");
		System.out.println(s);
		s.replace(0, Integer.MAX_VALUE, "epsilon");
		System.out.println(s);

	}

	public static void main(final String[] args) {
		StringBuilder v = new StringBuilder("alpha");
		System.out.println(v);
		m(v);
		System.out.println(v);
	}
}