package com.jhun.java;

public class FactoryOne implements Factory {

	@Override
	public ProductA createA(String type) {
		
		if("A".equals(type)) {
			return  new A1();
		}
		
		return null;
	}

	@Override
	public ProductB createB(String type) {
		
		if("B".equals(type)) {
			return new B1();
		}
		
		return null;
	}

}
