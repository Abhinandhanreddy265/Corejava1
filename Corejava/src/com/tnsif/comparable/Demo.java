package com.tnsif.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Demo {
public static void main(String[]args) {
	List<laptop> laps=new ArrayList<laptop>();
laps.add(new laptop("dell",500000,8));
laps.add(new laptop("apple",80000,9));
laps.add(new laptop("hp",20000,3));

Collections.sort(laps);

for(laptop l:laps) {
	System.out.println(l);
}
}
}