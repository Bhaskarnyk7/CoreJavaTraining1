package com.evergent.corejava.multithreading;

public class MyThread extends Thread{
	public void run() {
//		System.out.println("thread run method");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyThread t=new MyThread();
		
		t.start();
		
		MyThread t1=new MyThread();
		
		t1.start();
	}
}
