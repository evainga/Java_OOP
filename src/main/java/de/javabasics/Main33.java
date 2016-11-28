package de.javabasics;

public class Main33 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public int x;

	public void setX(final int x) {
		this.x = x;
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		final Main33 main = new Main33(); /*
											 * Anlegen eines Objekts der
											 * "Objektklasse Main"
											 */
		main.setX(33);
		System.out.println(main.x);
	}
}

// this.x > Feld oder ... steht für Zielobjekt >> this > main