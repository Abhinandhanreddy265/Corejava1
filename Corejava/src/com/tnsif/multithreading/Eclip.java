package com.tnsif.multithreading;

class Eclip implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Eclip"+Thread.currentThread().getId());
	}

}
class Flipkart implements Runnable{

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Flipkart"+Thread.currentThread().getId());
	}
}
 class Mainexample {
	public static void main(String[]args) {
		Eclip e=new Eclip();
		Thread obj=new Thread(e);
		obj.start();
		Flipkart f=new Flipkart();
		Thread obj1=new Thread(f);
		obj1.start();
		System.out.println("mainmethod"+Thread.currentThread().getId());
		
	}
}