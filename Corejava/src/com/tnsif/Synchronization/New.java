package com.tnsif.Synchronization;

public class New extends Thread{
	Example e;
	New(Example e){
		this.e=e;
	}
	public void main(String[]args) {
		//Example e=New Example();	
		New T1=new New(e);
		New T2=new New(e);
		New T3=new New(e);
		
		T1.start();
		T2.start();
		T3.start();

}
}
