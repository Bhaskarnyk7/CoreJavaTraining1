package com.evergent.corejava.javabeans;
import java.io.Serializable;
class ProductBean implements Serializable{
	private int pno;
	private String pname;
	private double price;
	public ProductBean(int pno,String pname,double price) {
		this.pno=pno;
		this.pname=pname;
		this.price=price;
	}
	public int getpno() {
		return pno;
	}
	public String getpname() {
		return pname;
	}
	public double getprice() {
		return price;
	}
}
public class ProductImpl {
	public static void main(String[] args) {
		ProductBean k=new ProductBean(10, "ram",100.0);
				System.out.println(k.getpname());
				System.out.println(k.getpno());
				System.out.println(k.getprice());
	}
}
