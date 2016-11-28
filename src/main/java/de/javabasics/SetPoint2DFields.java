package de.javabasics;

import java.awt.geom.Point2D;

public class SetPoint2DFields {

	public static void printSum(final Point2D.Double p) {
		System.out.println(p.x + p.y);
	}

	public static void main(String[] args) {
		final Point2D.Double a = new Point2D.Double();
		a.x = 6.0;
		a.y = 23.0;
		printSum(a);
	}
}
