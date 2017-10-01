package com.jhun.java;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		
		System.out.println("车辆开始行驶:");
		long startTime = System.currentTimeMillis();
		
		try {
			
			
			
			System.out.println("车辆行驶中");
			Thread.sleep(new Random().nextInt(1000));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("车辆结束行驶");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("行驶时间:" + (endTime - startTime));
	}

}
