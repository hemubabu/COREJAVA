package org.corejava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapconcept {
	// It is a pair of combination of key and values
	// Key does not allow duplicates
	// Value allows duplicates
	public static void main (String[]args) {
		Map<String,Integer> mp = new HashMap<>();
		// Put is used to store the values
		mp.put("hemanth",56);
		mp.put("ram", 56);
		mp.put("sekar",45);
		mp.put("hemanth",56);
		System.out.println(mp);
		// to print only key  
		Set<String> k = mp.keySet();
		System.out.println(k);
		// to print only value
		Collection<Integer> v = mp.values();
		System.out.println(v);
		// how to iterate the map by enhanced for loop with entryset
		Set<Entry<String, Integer>> entrySet =mp.entrySet();
		for (Entry<String, Integer> x: entrySet) {
			System.out.println(x);
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
		
		
		
	}

}
