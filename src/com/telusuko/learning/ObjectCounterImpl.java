package com.telusuko.learning;

public class ObjectCounterImpl {
	public static void main(String[] args) {
		ObjectCounter oc = new ObjectCounter();
		oc.counterIs();
		ObjectCounter oc1 = new ObjectCounter();
		oc.counterIs();
		ObjectCounter oc2 = new ObjectCounter();
		oc.counterIs();
		ObjectCounter oc3 = new ObjectCounter();
		oc.counterIs();
		ObjectCounter oc4 = new ObjectCounter();
		oc.counterIs();
		ObjectCounter oc5 = new ObjectCounter();
		oc5.counterIs();
	}

}
