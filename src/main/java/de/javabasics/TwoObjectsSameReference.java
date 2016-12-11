package de.javabasics;

public final class TwoObjectsSameReference {

	public double x;
	public double y;

	public static void main(final java.lang.String[] args) {
		final TwoObjectsSameReference a = new TwoObjectsSameReference();

		final TwoObjectsSameReference b = a;
		a.x = 1.0;
		a.y = 4.0;
		b.x = 2.0;
		java.lang.System.out.println(a.x);
		java.lang.System.out.println(b.y);
	}
}