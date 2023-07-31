package com.velocity.gith.branchtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Branch {

	public static void main(String[] args) {
		//This is ArrayList Cheak
		
		ArrayList<Integer> arr = new ArrayList();
		arr.add(9);
		arr.add(10);
		arr.add(11);
		arr.add(12);
		ArrayList<Integer> arr2 = new ArrayList();
		arr2.add(13);
		 arr.addAll(arr2);
		 
		Iterator<Integer> itrl = arr.iterator();
		while(itrl.hasNext()){
			
			System.out.println(itrl.next());
		}
	}

}
