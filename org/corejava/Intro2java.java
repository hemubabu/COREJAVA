package org.corejava;

public class Intro2java implements Intro3java {
	public void methodName3(int id) {
		System.out.println(id);
	}
	public void methodName2() {
		System.out.println(2);
	}
	public void methodName4() {
		System.out.println(4);
	}
	public static void main(String[] args) {
		Intro2java I = new Intro2java();
		I.methodName3(3);
		I.methodName4();
		
	}

}
