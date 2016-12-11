package de.javabasics;

public class ObjectAndClassMethods {

	public int n;

	public int get() {
		return n;
	}

	public static ObjectAndClassMethods makeMain(int i) {
		final ObjectAndClassMethods main = new ObjectAndClassMethods();
		main.n = i;
		return main;
	}

	public static void main(final String[] args) {
		final ObjectAndClassMethods o = makeMain(2);
		final ObjectAndClassMethods x = makeMain(3);
		System.out.println(o.get());
		System.out.println(x.get());
	}
}

// Übungsaufgabe 6
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_methoden_fuer_exemplare_de

// Klassenmethoden: 2
// Objektmethoden: 1
// Klassenfelder: 0
// Objektfelder: 1