package de.javabasics;

import java.util.logging.Logger;

public class Main18 {

	public static void printParentName(Logger logger) {
		System.out.println(logger.getParent().getName());
		logger.info("abc");
	}

	public static void main(String[] args) {
		Logger anton = Logger.getLogger("Anton");
		Logger berta = Logger.getLogger("Berta");
		berta.setParent(anton);
		printParentName(berta);
		System.out.println(anton.getName());
	}
}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_veraenderliche_objekte_de
