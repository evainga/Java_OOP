package de.javabasics;

public class ObjectMethodsSetAddGet {

	public int x;

	public void set(int n) {
		x = n;
	}

	public void add(ObjectMethodsSetAddGet x) {
		this.x = this.x + x.x;
	} // kann auch sein x = x + p.x

	public int get() {
		return this.x;
	}

	public static void main(final String[] args) {
		final ObjectMethodsSetAddGet o = new ObjectMethodsSetAddGet();
		final ObjectMethodsSetAddGet x = new ObjectMethodsSetAddGet();
		o.set(4);
		x.set(3);
		o.add(x);
		o.add(x);
		System.out.println(o.get());
	}
}

// Klassenmethoden: 1
// Objektmethoden: 3
// Klassenfelder: 0
// Objektfelder: 1