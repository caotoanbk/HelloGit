package com.toan.learnjava;

public class HelloMiddleEarth {

	public static void main(String[] args) {
		String[] names = {"Bilbo", "Frodo", "Aragon", "Legolas", "Gandalf", "boromi", "fafd" };
		
		//print greetings
		for (int i = 0; i < names.length; i++) {
			System.out.format("Hello, %s!\n", names[i]);
			System.out.println("How are you doing today?");
		}
	}

}
