package org.corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Setconcept {
	public static void main (String[]args) {
		// Set is a value based one and removes duplicates 
		// It does not support index based methods
		List<Integer> li = new ArrayList<> (); //interface -- class calling
		// add - to store the values
		li.add(100);
		li.add(8900);
		li.add(1234);
		li.add(100);
		System.out.println(li);
		// to find the size
		int size = li.size();
		System.out.println(li.size());
		li.add(0,12);
		System.out.println(li);
		 Integer h = li.get(0);
		System.out.println(h);
		// to print whether it is present or not
		//to print all values
		for(int i=0;i<li.size();i++) {
			Integer in = li.get(i);
			System.out.println(in);
			
		}
		int indexof = li.indexOf(100);
		int lastIndexof = li.lastIndexOf(8900);
		System.out.println(indexof);
		System.out.println(lastIndexof);
		// to replace the value
		li.set(0, 15);
		System.out.println(li);
		// to delete all values
		Set<Integer>l2 = new HashSet<>();
		// value based one
		
		// copy the data from one list to another list
		l2.addAll(li);
		System.out.println(l2);
		boolean equals = li.equals(l2);
		System.out.println(equals);
		int size1 = l2.size();
		System.out.println(l2.size());
		// We cannot using get method in set
		// Iterate the set by using Enhanced for loop
		// Stored variable name
		//  Datatype_Ref Variablename:Existing set variable name
		for(Integer x:l2 ) {
			System.out.println(x);
			
			
		}
		
	 	
		
		
		
	}

}
