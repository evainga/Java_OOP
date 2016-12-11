package de.javabasics;

public class ObjectMethods2 {

	public int x;

	public int getX() {
		return x;
	}

	public static void main(final String[] args) {
		{
			final ObjectMethods2 main = new ObjectMethods2();
			main.x = 12;
			System.out.println(main.getX());
		}
		{
			final ObjectMethods2 main = new ObjectMethods2();
			main.x = 17;
			System.out.println(main.getX());
		}
	}
}

// Klassenmethoden: 1
// Objektmethoden: 1
// Klassenfelder: 0
// Objektfelder: 1