package com.tnsif.string;

public class builder {
public static void main(String[]args) {
	StringBuilder b=new
			StringBuilder("welcome");
b.append("to java");
System.out.println();
b.insert(2, "hi");
System.out.println();
b.delete(2,5);
System.out.println();
b.reverse();
System.out.println();
}
}

