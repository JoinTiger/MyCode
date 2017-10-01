package com.factory.java;

public class Factory {
	public static Product getInstance(String type) {
		
		if("A".equals(type)) {
			return new A();
		}
		
		
		if("B".equals(type)) {
			return new B();
		}
		
		return null;
		
	}
}
