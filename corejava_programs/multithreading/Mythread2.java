package com.evergent.corejava.multithreading;

public class Mythread2 implements Runnable {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Mythread2 t1=new Mythread2();
		Thread t2=new Thread(t1);
		t2.start();
		
	}
}
