package de.javabasics;

public class Main35 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static Main35 makeMain() {
		return new Main35();
	}

	public static void main(final String[] args) {
		final Main35 o = makeMain(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main35 x = makeMain(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		System.out.println(o);
		System.out.println(x);
	}
}