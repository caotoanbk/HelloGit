package com.toan.learnjava;

import java.util.Iterator;

public class HelloMiddleEarth {

	public static void main(String[] args) {
		String[] names = {"Bilbo", "Frodo", "Aragon", "Legolas", "Gandalf", "boromi", "fafd" };
		
//print greetings to the fine in the middle earth
		for (String name : names) {
			System.out.format("Hello, %s!\n", names);
			System.out.println("How are you doing today?");

	}
	}
}
