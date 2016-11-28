package de.javabasics;

public class Main30 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public void hello() {
		System.out.println("Hello, world");
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		final Main30 o = new Main30(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main30 x = new Main30(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		o.hello();
		x.hello();
	}
}