package com.tnsf.interfacedemo;

public class SBI implements Bank {
	@Override
	public float rateofintrest() {
		//TODO Auto-generated method stud
		return 9.0f;
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		Bank a=new SBI();
		System.out.println("the rate of intrest in SBI is:"+a.rateofintrest());
	}

}
