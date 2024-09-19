package com.evergent.corejava.ExceptionHandling;
class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String msg) {
		System.out.println("HELLO "+msg);}}
public class ProductImpl{
	int pno=103;
	public void myData() {
		if(pno>100) {
			try {
				System.out.println("before exception print statement");
			throw new ProductNotFoundException("this product is not avilabe");  // Exception
//				System.out.println("one");
//				System.out.println("two");
			}
			catch(Exception e) {
				System.out.println("after exception, coming to catch  statement");
				System.out.println(e);
				System.out.println("after printing exception statement");
			}
		}
		else {
			System.out.println("product there");
		}
	}
	public static void main(String[] args) {
			ProductImpl k=new ProductImpl();
			k.myData();
	
//		catch (Exception e) {
//			
//			System.out.println("catch one");
//			System.out.println(e);
//			System.out.println("catch two");
//		}
	}

}
