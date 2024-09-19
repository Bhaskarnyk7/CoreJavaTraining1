package com.evergent.corejava.oops;

class BigData{
	public void show() {
		System.out.println("show1")
	}
}


public class MetdOverrd extends BigData{
	public void show() {
		System.out.println("show2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetdOverrd k=new MetdOverrd();
		k.show();
	}

}
