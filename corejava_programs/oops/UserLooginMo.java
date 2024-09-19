package com.evergent.corejava.oops;

// method overloading 
public class UserLooginMo {
	
	public void loginDetails() {
		System.out.println("login details");
	}
	public void loginDetails(String username,String pass) {
		System.out.println("username "+username);
		System.out.println("password "+pass);
	}
	public void loginDetails(String username,String pass, String captcha) {
		System.out.println("user name "+username);
		System.out.println("passowrd "+pass);
		System.out.println("captcha "+captcha);
	}
	public void loginDetails(int mobile,String pass) {
		System.out.println("mobile no "+mobile);
		System.out.println("password "+pass);
	}
	public void show() {
		System.out.println("show method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserLooginMo k=new UserLooginMo();
		k.loginDetails();
		k.loginDetails("ram","abcd123");
		k.loginDetails("ram","abc1234","WeFgt");
		k.loginDetails(879048278,"abcd34");
		k.show();

	}

}
