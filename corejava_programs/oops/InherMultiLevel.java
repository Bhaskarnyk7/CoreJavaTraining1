package com.evergent.corejava.oops;

// multilevel inheritance

class MyPerson{
	public void show() {
		System.out.println("Ram");
	}
}
class PersonDetails extends MyPerson{
	public void personData(){
		System.out.println("Hybd");
	}
}

 class InherMultiLevel extends PersonDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InherMultiLevel k=new InherMultiLevel();
		k.personData();
		k.show();
		
	}

}
