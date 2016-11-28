package de.javabasics;

public class Main34 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public void set(final String name) {
		this.name = name;
	}

	String name;

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */
	public static void hello(final Main34 main) {
		System.out.println("Hallo " + main.name);
	}

	public static void main(final String[] args) {
		final Main34 o = new Main34(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main34 x = new Main34(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		o.set("Pia");
		x.set("Leo");
		hello(o);
		hello(x);
		o.set("Zoe");
		hello(o);
	}
}