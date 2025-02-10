package com.tnsf.interfacedemo;

public class RBI implements Bank {
	@Override
	public float rateofintrest() {
		//TODO Auto-generated method stub
		return 5.0f;
		
	}
public static void main(String[]args) {
	//TODO Auto-generated method stub
	Bank a=new RBI();
	System.out.println("theb rate of intrest in RBI is:"+a.rateofintrest());
}
}
