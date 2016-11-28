package de.javabasics;

public class Main36 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public int n;

	public int get() {
		return n;
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static Main36 makeMain(int i) {
		final Main36 main = new Main36();
		main.n = i;
		return main;
	}

	public static void main(final String[] args) {
		final Main36 o = makeMain(
				2); /* Anlegen eines Objekts der "Objektklasse Main" */
		final Main36 x = makeMain(
				3); /* Anlegen eines Objekts der "Objektklasse Main" */
		System.out.println(o.get());
		System.out.println(x.get());
	}
}

// Übungsaufgabe 6
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_methoden_fuer_exemplare_de