package com.jhun.java;

import java.util.Random;

public class Car implements Moveable {

	@Override
	public void move() {
		
		System.out.println("������ʼ��ʻ:");
		long startTime = System.currentTimeMillis();
		
		try {
			
			
			
			System.out.println("������ʻ��");
			Thread.sleep(new Random().nextInt(1000));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("����������ʻ");
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("��ʻʱ��:" + (endTime - startTime));
	}

}
