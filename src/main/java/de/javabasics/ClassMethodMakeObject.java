package de.javabasics;

public class ClassMethodMakeObject {

	public static ClassMethodMakeObject makeObject() {
		final ClassMethodMakeObject object = new ClassMethodMakeObject();
		return object;
	}

	public static void main(final String[] args) {
		final ClassMethodMakeObject o = makeObject();
		final ClassMethodMakeObject x = makeObject();
		System.out.println(o);
		System.out.println(x);
	}
}

// Klassenmethoden: 2
// Objektmethoden: 0
// Klassenfelder: 0
// Objektfelder: 0