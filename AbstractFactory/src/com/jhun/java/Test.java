package com.jhun.java;

public class Test {

	public static void main(String[] args) {
		Factory factoryOne = new FactoryOne();
		Factory factoryTwo = new FactoryTwo();
		
		
		factoryOne.createA("A");
		factoryOne.createB("B");
		
		factoryTwo.createA("A");
		factoryTwo.createB("B");
	}

}
