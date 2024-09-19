package com.evergent.corejava.oops;

public class CalculationsEn {

	
		int a=20;
		int b=10;
		
		public void addition() {   //step4
			System.out.println(a+b);  // B.L    step5
		}
		public void sub() {     //step7
			System.out.println(a-b);  //step8
		}
		public void mul() {  //step10
			System.out.println(a*b);  //step11
		}
		public void div() {  //step13
			System.out.println(a/b);    //step14
		}
		
		
		public static void main(String[] args) {  // step1
			CalculationsEn m= new CalculationsEn();  //step2
			m.addition(); //step3
			m.sub();    //step6
			m.mul();  //step9
			m.div(); //step12
		}   //step15
		

	

}   //step16
