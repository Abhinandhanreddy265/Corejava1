package com.tnsif.Synchronization;

public class Example {
static synchronized
void display(){
	Thread g=Thread.currentThread();
	for(int i=0;i<3;i++) {
		try {
			Thread.sleep(2000);
			System.out.println(g.getName()+"+");
		}
		catch(Exception e) {
			
		}
		}
	}
}
