package com.evergent.coerjava.abstract1;

public class Product3Impl extends Product3{
	
	public Product3Impl() {
		// TODO Auto-generated constructor stub
		System.out.println("ProductImpl constructor");
	}
	public void newProduct() {
		System.out.println("new product");
	}
	public static void main(String[] args) {
		Product3Impl p=new Product3Impl();
		p.newProduct();
	}

}
