package de.javabasics;

public class Main38 {

	/* Beginn der "Objektklasse Main" mit nicht-statischen Einträgen */

	public int x;

	public void set(int n) {
		x = n;
	}

	public void add(Main38 p) {
		this.x = this.x + p.x;
	} // kan n auch sein x = x + p.x

	public int get() {
		return this.x;
	}

	/* Beginn der "Verzeichnisklasse Main" mit statischen Einträgen */

	public static void main(final String[] args) {
		final Main38 o = new Main38(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		final Main38 x = new Main38(); /*
										 * Anlegen eines Objekts der
										 * "Objektklasse Main"
										 */
		o.set(4);
		x.set(3);
		o.add(x);
		o.add(x);
		System.out.println(o.get());
	}
}