package de.javabasics;

import java.util.TimeZone;

public class SetTimeZone {

	public static void main(String[] args) {

		TimeZone zone = TimeZone.getDefault();

		System.out.println(zone.getID());
		zone.setID("GMT+00:00");
		System.out.println(zone.getID());

	}
}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_veraenderliche_objekte_de