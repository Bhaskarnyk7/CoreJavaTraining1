package com.evergent.corejava.ExceptionHandling;
import javax.swing.DefaultRowSorter;

class NotEligibleForVoter extends Exception{
	public NotEligibleForVoter() {
		// TODO Auto-generated constructor stub
		System.out.println("not eligiuble for vote");
	}
}
public class Voter {
		int age=17;
		
		public void vote()throws NotEligibleForVoter {
			if(age<18) {
				throw new NotEligibleForVoter();
			}
			else {
				System.out.println("eligible for vote");
			}
		}
		public static void main(String[] args) {
			try {
			Voter k=new Voter();
			k.vote();
			}
			catch (NotEligibleForVoter e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}	
}



