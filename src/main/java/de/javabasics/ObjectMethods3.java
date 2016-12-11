package de.javabasics;

public class ObjectMethods3 {

	public void set(final String x) {
		this.name = x;
	}

	String name;

	public static void hello(final ObjectMethods3 object) {
		System.out.println("Hallo " + object.name);
	}

	public static void main(final String[] args) {
		final ObjectMethods3 o = new ObjectMethods3();
		final ObjectMethods3 x = new ObjectMethods3();
		o.set("Pia");
		x.set("Leo");
		hello(o);
		hello(x);
		o.set("Zoe");
		hello(o);
	}
}

// Klassenmethoden: 2
// Objektmethoden: 1
// Klassenfelder: 0
// Objektfelder: 1