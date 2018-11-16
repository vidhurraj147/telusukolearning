package com.telusuko.learning.abstractclass;

public class AbDemo {

	public static void main(String[] args) {
		/*Iphone iphone = new Iphone();
		show(iphone);
		
		Samsung samsung = new Samsung();
		show(samsung);*/
		
		Phone Iphone = new Iphone();
		showConfig(Iphone);
		
		Phone samsung = new Samsung();
		showConfig(samsung);
	}

	private static void showConfig(Phone phone) {
		phone.showConfig();
	}

//	private static void show(Samsung samsung) {
//		samsung.showConfig();
//	}
//
//	private static void show(Iphone obj) {
//		obj.showConfig();
//	}

}
