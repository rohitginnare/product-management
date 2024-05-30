package com.exatip.product.test;

public class ThreadMain extends MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside MAIN METHOD " + Thread.currentThread().getName());
		MyThread t1 = new MyThread();
		t1.run();
		// t1.start();

//		MyThread t2 = new MyThread();
//		t2.start();
	}

}
