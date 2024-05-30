package com.exatip.product.test;

public class MyThread extends Thread {

	@Override
	public void run() {

		System.out.println("Inside Runt Method " + Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Test 1 : " + i);
		}
	}
}
