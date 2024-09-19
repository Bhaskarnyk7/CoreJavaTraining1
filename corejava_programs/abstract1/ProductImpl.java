package com.evergent.coerjava.abstract1;

public class ProductImpl extends Product {
	public  void newProduct() {
		System.out.println("new product");
		
	}
	public void show() {
		System.out.println("local show method");
	}
	public static void main(String[] args) {
		// we able to create obj for regular cls which is extended the abstract cls
		ProductImpl p=new ProductImpl();
		p.newProduct();
		p.allProducts();
		p.show();
		
		// we cannot create obj for abstract class,
		//Product m=new Product();         CTE
		
	    // can create reference
		Product k=new ProductImpl();
		k.newProduct();
		k.allProducts();
	
	}

}
