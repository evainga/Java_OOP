package de.javabasics;

public class EqualsAndReferenceComparison {

	public static void main(String[] args) {
		String object1 = new String("abtgc");
		String object2 = new String("abxgc");
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object1.equals(object2));
		System.out.println(object1 == object2);
		int i = object1.length() / 2;
		char charArray[] = object1.toCharArray();
		charArray[i] = 'x';
		System.out.println(charArray);
		object1 = new String(charArray);
		System.out.println(object1.equals(object2));
		System.out.println(object1 == object2);
		object1 = object2;
		System.out.println(object1 == object2);
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());

	}
}
