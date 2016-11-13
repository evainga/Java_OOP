package de.javabasics;

public class Main14 {

	public static void printSum(final java.awt.geom.Point2D.Double p) {
		java.lang.System.out.println(p.x + p.y);
	}

	public static void main(String[] args) {
		final java.awt.geom.Point2D.Double a = new java.awt.geom.Point2D.Double();
		a.x = 6.0;
		a.y = 23.0;
		printSum(a);
	}
}
