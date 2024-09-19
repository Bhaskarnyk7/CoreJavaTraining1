package com.evergent.corejava.service;

import com.evergent.corejava.bean.CollegeBean;
import com.evergent.corejava.DAO.*;
//import com.capg.shadow.dao.BankDAO;

public class CollegeServices {
	static String str="";
	CollegeDAO bankDAO=new CollegeDAO();
	public static  int createAccount(int stdid,String stdname,String stdbranch,int year) {
		CollegeBean k=new CollegeBean();
		k.setStdid(stdid);
		k.setStdname(stdname);
		k.setStdbranch(stdbranch);
		k.setYear(year);
		int re=CollegeDAO.createAcc(k);
		if(re!=0) {
		str="You Created An Account";
		//CollegeDAO.addTran(accountNumber,str);}
		//return re;
		//return 0;
	}
		return re;
  }
//	public static void showstd(int stdid)
//	{
//		 CollegeDAO.showB(stdid);
//	}
}
