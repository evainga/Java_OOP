package de.javabasics;

public class Main17 {

	public static void main(String[] args) {

		java.util.TimeZone zone = java.util.TimeZone.getDefault();

		java.lang.System.out.println(zone.getID());
		zone.setID("GMT+00:00");
		java.lang.System.out.println(zone.getID());

	}
}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_veraenderliche_objekte_de