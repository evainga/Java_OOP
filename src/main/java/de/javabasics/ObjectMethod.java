package de.javabasics;

public class ObjectMethod extends Object {
	private static int a = 1;

	public void hello() {
		System.out.println("Hello, world" + a);
	}

	public String toString() {
		return "a = " + a;
	}

	public static void main(final String[] args) {
		final ObjectMethod o = new ObjectMethod();
		final Object x = new ObjectMethod();
		o.hello();
		((ObjectMethod) x).hello();
		System.out.println(o.toString());

	}
}

// Klassenmethoden: 1
// Objektmethoden: 3
// Klassenfelder: 0
// Objektfelder: 1