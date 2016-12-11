package de.javabasics;

public final class Reference {

	public static void m(double x, final java.awt.geom.Point2D.Double p) {
		x = 2;
		p.x = 2;
	}

	public static void main(final java.lang.String[] args) {
		final double x = 0.0; // double, int, void in klein sind bereits im
								// Datenstack und haben keine nennenswerte
								// Referenz
		final java.awt.geom.Point2D.Double p = new java.awt.geom.Point2D.Double(0.0, 0.0);
		m(x, p);
		java.lang.System.out.println(x);
		java.lang.System.out.println(p.x);
	}
}