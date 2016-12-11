package de.javabasics;

public class ObjectMethods4 {

	String x;

	public void set(final String name) {
		this.x = name;
	}

	public void hello() {
		System.out.println("Hallo " + x);
	}

	public static void main(final String[] args) {
		final ObjectMethods4 o = new ObjectMethods4();
		final ObjectMethods4 x = new ObjectMethods4();
		o.set("Lea");
		x.set("Alf");
		x.hello();
		x.hello();
		o.hello();
		o.set("Tim");
		o.hello();
	}
}

// Übungsaufgabe 7... + siehe Unterschied ObjectMethods3

// Klassenmethoden: 1
// Objektmethoden: 2
// Klassenfelder: 0
// Objektfelder: 1