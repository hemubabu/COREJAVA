package org.java;

import java.util.Scanner;

public class ControlStatements extends Cons{
	
	public ControlStatements() {
		this(12);
		System.out.println("Default constructor");	
	}
	public ControlStatements(int a) {
		this("Hem");
		System.out.println("Integerised constructor");	
	}
	public ControlStatements(String b) {
		try {
		int i = 1/0;
		}
		catch(Exception e) {
			System.out.println("Arthmetic exception");
		}
		System.out.println("String constructor");	
	}
	
	
	
	public static void main(String[]args) {
		ControlStatements C = new ControlStatements();
		
		Cons.Cons1();
		
		
						
			}
			
			
		}



