package ua.com.glybovets.java1_1.lecture4;
/*
 * Files: Add2Integers.java
 * програма зчитує два числа
 * і повертає їх сумму
 */


import acm.program.*;

public class Add2Integers extends ConsoleProgram {

	/**
	 * @param args
	 */
	public void run() {
		this.setSize(300, 400);
		println("This program adds two numbers.");
		int n1 = readInt("enter n1: ");
		int n2 = readInt("enter n2: ");
		int total = n1+n2;
		println("total is "+ total + ".");

	}

}
