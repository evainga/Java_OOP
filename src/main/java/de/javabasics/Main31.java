package de.javabasics;

public class Main31 {
	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public void hello(final String name) {
		System.out.println("Hallo " + name);
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		final Main31 o = new Main31(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main31 x = new Main31(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		o.hello("Mia");
		x.hello("Ben");
	}
}