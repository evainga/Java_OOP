package de.javabasics;

public class ObjectMethods1 {

	public void hello(final String name) {
		System.out.println("Hallo " + name);
	}

	public static void main(final String[] args) {
		final ObjectMethods1 o = new ObjectMethods1();
		final ObjectMethods1 x = new ObjectMethods1();

		o.hello("Mia");
		x.hello("Ben");
	}
}

// Klassenmethoden: 1
// Objektmethoden: 1
// Klassenfelder: 0
// Objektfelder: 0 (!)
