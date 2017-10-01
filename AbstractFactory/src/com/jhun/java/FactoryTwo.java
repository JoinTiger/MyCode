package com.jhun.java;

public class FactoryTwo implements Factory {

	@Override
	public ProductA createA(String type) {
		
		if("A".equals(type)) {
			return new A2();
		}
		
		return null;
	}

	@Override
	public ProductB createB(String type) {
		
		if("B".equals(type)) {
			return new B2();
		}
		
		return null;
	}

}
