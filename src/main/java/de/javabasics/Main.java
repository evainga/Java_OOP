package de.javabasics;

public class Main {

	public Main addToX(int m) {
		Main object = new Main();
		object.x = this.x + m;
		return object;

	}

	public int x;

	public static void main(final java.lang.String[] args) {
		Main main = new Main();
		main.x = 10;
		main = main.addToX(12);
		java.lang.System.out.println(main.x);
		main = main.addToX(17);
		java.lang.System.out.println(main.x);
	}
}