package org.corejava;

public class String1 {
	public static void main(String[] args) {
		String s = "Welcome to java classes";
		String[]split = s.split("to");
		System.out.println(split.length);
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		char[] cs =s.toCharArray();
		System.out.println(cs.length);
		for(int i=0;i<cs.length;i++) {
			System.out.println(cs[i]);
		}
		
	}
	
		
	

}
