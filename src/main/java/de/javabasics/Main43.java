package de.javabasics;

public class Main43 {

	int x;
	static int y;

	public static int alpha() {
		return y;
	}

	public static void main(final java.lang.String[] args) {
		System.out.println(Main43.alpha());
		Main43 x = new Main43();
		int y2 = x.y;
	}
}