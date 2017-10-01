package com.factory.java;

public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();
		
		factory.getInstance("A");
		factory.getInstance("B");
		
	}

}
