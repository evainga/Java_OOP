package de.javabasics;

public final class StatMethDekl {
	public static void main(final java.lang.String[] args) {
		final java.util.logging.Logger l = java.util.logging.Logger.getLogger("abc");
		final java.util.logging.Logger l1 = java.util.logging.Logger.getLogger("def");

		java.lang.System.out.println(l.getName());
		java.lang.System.out.println(l1.getName());
	}
}
