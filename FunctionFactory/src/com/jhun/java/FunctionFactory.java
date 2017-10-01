package com.jhun.java;

public class FunctionFactory implements Factory {

	@Override
	public Product createProduct(String type) {
		
		if("A".equals(type)) {
			return new A();
		}
		
		
		if("B".equals(type)) {
			return new B();
		}
		
		
		
		
		
		return null;
	}

}
