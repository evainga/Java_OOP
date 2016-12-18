package de.javabasics.cast;

public class SubClass extends SuperClass {
	public String getSubClassName() {
		return getClass().getName();
	}
}
