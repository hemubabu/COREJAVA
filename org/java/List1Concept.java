package org.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List1Concept extends Method {
	public void methodName(String b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(87);
		li.add(87);
		li.add(98);
		System.out.println(li);
		Set<Integer> l2 = new LinkedHashSet<>();
		l2.addAll(li);
		System.out.println(l2);
		Map<String, Integer> mp = new HashMap<>();
		mp.put("hemanth",56);
		mp.put("siva", 87);
		mp.put("kishore", 78);
		System.out.println(mp);
		Set<String> k = mp.keySet();
		System.out.println(k);
		Collection<Integer> v = mp.values();
		System.out.println(v);
		Set<Entry<String,Integer>> e = mp.entrySet();
		for (Entry<String,Integer> X : e) {
			System.out.println(X);
		}
		
		List1Concept L = new List1Concept();
		L.methodName("siva");
		

}
}