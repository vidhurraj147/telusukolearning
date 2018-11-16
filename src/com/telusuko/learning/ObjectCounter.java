package com.telusuko.learning;

public class ObjectCounter {
	public static int i;
	public ObjectCounter() {
		i++;
	}
	public void counterIs() {
		System.out.println("NUMBER OF OBJECTS ARE "+i);
	}
}
