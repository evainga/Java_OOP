package de.javabasics;

public class EinfVonVar3 {

	public static void main(String[] args) {
		java.lang.Object v = java.lang.Thread.currentThread();
		java.lang.System.out.println(v);
	}
}

// Weil nur println verwendet wird, reicht oben der Typ Object, sonst
// java.lang.Thread
// http://userpage.fu-berlin.de/~ram/pub/pub_jf47ht81Ht/java_referenznamen_de