package ua.com.glybovets.java1_1.lecture6;
/*
 * ������ �������� �����
 */


import acm.program.*;

public class FactorialExample extends ConsoleProgram{

	private static final int MAX_NUM = 10;
	
	public void run(){
		for (int i = 0; i<MAX_NUM; i++){
			println(i + "! = " + factorial(i));
		}
	}

	private int factorial(int n) {
		
		int result = 1;
		for (int i = 1; i<=n; i++){
			result *=i;
		}
		return result;
	}
}
