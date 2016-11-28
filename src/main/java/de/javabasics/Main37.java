package de.javabasics;

public class Main37 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	String name;

	public void set(final String name) {
		this.name = name;
	}

	public void hello() {
		System.out.println("Hallo " + name);
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		final Main37 o = new Main37(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main37 x = new Main37(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		o.set("Lea");
		x.set("Alf");
		x.hello();
		x.hello();
		o.hello();
		o.set("Tim");
		o.hello();
	}
}

// Übungsaufgabe 7... + siehe Unterschied Main34