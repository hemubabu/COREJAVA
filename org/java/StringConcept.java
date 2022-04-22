package org.java;
import java.util.Arrays;

public class StringConcept {
	public static void main(String[]args) {
		String s = "My name is Hemanthbabu";
		int length = s.length();// to find the string length
		System.out.println(length);
		System.out.println(s); 
		// to print the string in capital letter
		String up =s.toUpperCase();
		System.out.println(up);
		// to print the string in small letter
		String low = s.toLowerCase();
		System.out.println(low);
		// to print a individual single character
		// index value starts from 0 to n-1;
		char  ch =  s.charAt(0);
		System.out.println(ch);
		// to iterate the string
		for (int i=0;i<s.length();i++) {
			 char ch2 = s.charAt(i);
			 System.out.println(ch2);
		}
		// to find the index number
		int indexof = s.indexOf("e");
		System.out.println(indexof);
		int lastindexof = s.lastIndexOf("a");
		System.out.println(lastindexof);
		// To remove unwanted spaces
		String s1 = "     hemanth babu    ";
		String s3 = s1.trim();
		System.out.println(s3);
		// to check string is empty or not
		boolean empty = s1.isEmpty();
		System.out.println(empty);
		// to check the string character is present or not
		boolean contains = s1.contains("babu");
		System.out.println(contains);
		boolean equals = s3.equals("hemanth babu");
		System.out.println(equals);
		// to replace a word r letter
		String replace = s3.replace("babu","BABU");
		System.out.println(replace);
		// to replace the entire string
		String replaceall =s3.replaceAll(s3, "Prithivi ram");
		System.out.println(replaceall);
		boolean endswith = s.endsWith("Hemanthbabu");
		System.out.println(endswith);
		// to check only the content
		boolean equalsIgnoreCase= s.equalsIgnoreCase("my name is Hemanthbabu");
		System.out.println(equalsIgnoreCase);
		// to print a particular word by using index n+1
		String substring=s.substring(0, 7);
		System.out.println(substring);	
		String s5 = "Welcome to java classes";
		String[]split = s5.split("java");
		System.out.println(split.length);
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
			
		}
		
	}
}
