package com.evergent.corejava.collections.bhaskar.task3;

import java.util.HashSet;
import java.util.Set;

import com.everegent.corejava.collections.ram.task2.Book;

public class MobileImpl implements MobileInterface {
	Set<Mobile> Mobiles=null;
	public MobileImpl() {
		Mobiles=new HashSet<Mobile>();
	}
	@Override
	public String addMobile(Mobile m) {
		// TODO Auto-generated method stub
		Mobiles.add(m);
		return m.getId();
	}

	@Override
	public void searchById(String id) {
		// TODO Auto-generated method stub
		boolean m=false;
		if(Mobiles.size()>0 && Mobiles!=null){
			for(Mobile mobile:Mobiles){
				if(mobile.getId().equals(id)){
					System.out.println(mobile.getId()+" "+mobile.getMobilename()+" "+mobile.getProcessor());	
					m=true;
					break;	
				}
			}
		}
		if(!m)
			System.out.println("Mobile Not Found ");
		
	}

	@Override
	public void getAllMobiles() {
		// TODO Auto-generated method stub
		if(Mobiles.size()>0){
			for(Mobile mobile:Mobiles){
				System.out.println(mobile.getId()+" "+mobile.getMobilename()+" "+mobile.getProcessor());
			}
				
		}else{
			System.out.println("No Mobiles are available");
		}
		
	}
	
	

}
