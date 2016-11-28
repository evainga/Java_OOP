package de.javabasics;

public class Main32 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public int x;

	public int getX() {
		return x;
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		{
			final Main32 main = new Main32(); /*
												 * Anlegen eines Objekts der
												 * "Objektklasse Main"
												 */
			main.x = 12;
			System.out.println(main.getX());
		}
		{
			final Main32 main = new Main32(); /*
												 * Anlegen eines Objekts der
												 * "Objektklasse Main"
												 */
			main.x = 17;
			System.out.println(main.getX());
		}
	}
}