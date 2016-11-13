package de.javabasics;

public class EinfVonVarX {

	public static void main(String[] args) {
		java.util.logging.Logger v = java.util.logging.Logger.getLogger("abc");
		v.info("def"); // mit Variable

		java.util.logging.Logger.getLogger("abc").info("def"); // ohne Variable
	}
}

// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_referenznamen_de
// letzte Übung
