package com.velocity.gith;

import java.util.ArrayList;
import java.util.List;
public class Demo {
public static void main(String[] args) {
	//ArrayList al = new ArrayList(); //Tight Coupling (Not Prefferd In Industries)  
	List al = new ArrayList(); //lose coupling (Used in Industries)
	al.add(50);//Use add method to add Element
	al.add("Pune");
	al.add(null);
	al.add(null);
	al.add(50);
	al.remove(0);
	System.out.println(al +" ArrayL " + al);
	
}
}