package com.evergent.corejava.ExceptionHandling;
class VideoNotFoundException extends Exception{
		public VideoNotFoundException(String msg) {
			// TODO Auto-generated constructor stub
			System.out.println(msg);
		}
}
public class UserDefienedExceptionExam  {
		static String v1="datatypes";
		static String v2="Arrays";
		
		public static void video(String s1) throws VideoNotFoundException{
			if(!(s1.equals(v1) || s1.equals(v2))) {
				throw new VideoNotFoundException("video not found exception");
			}
			else {
				System.out.println("video found u can watch");
			}
		}
	public static void main(String[] args) {
			try {
				UserDefienedExceptionExam k=new UserDefienedExceptionExam();
				k.video("Array");
				
			}
			catch (VideoNotFoundException e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}
}
