package de.javabasics;

/*
public class Main15 {

    public static void java.awt.geom.Point2D.Double ( final java.awt.geom.Point2D.Double p)
    {     p.x = 14.0;
          p.y = 9.0;
    }
    
    public static void main(String[] args) {
    final java.awt.geom.Point2D.Double a = new java.awt.geom.Point2D.Double ();
    
    final java.awt.geom.Point2D.Double p = pair();
    java.lang.System.out.println(pair (p.x + p.y));
    } 
}
*/

public final class Main15 {

	public static void printSum(final java.awt.geom.Point2D.Double p) {
		java.lang.System.out.println(p.x + p.y);
	}

	public static java.awt.geom.Point2D.Double pair() {
		final java.awt.geom.Point2D.Double a = new java.awt.geom.Point2D.Double(14, 9);
		return a;
	}

	public static void main(final java.lang.String[] args) {
		final java.awt.geom.Point2D.Double a = new java.awt.geom.Point2D.Double();
		a.x = 6.0;
		a.y = 23.0;
		printSum(a);

		final java.awt.geom.Point2D.Double p = pair();
		printSum(p);
	}
}

// Letzte Übung:
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/nichtstatische_felder_java