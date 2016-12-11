package de.javabasics;

public class ObjectMethodsWithThis {

	public int x;

	public void setX(final int x) {
		this.x = x;
	}

	public static void main(final String[] args) {
		final ObjectMethodsWithThis main = new ObjectMethodsWithThis();
		main.setX(33);
		System.out.println(main.x);
	}
}

// this.x > steht für Zielobjekt >> this > main

// Klassenmethoden: 1
// Objektmethoden: 1
// Klassenfelder: 0
// Objektfelder: 1