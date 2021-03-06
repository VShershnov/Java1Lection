package ua.com.glybovets.java1_1.lecture7;
/*
 * ������ �������� ����� ������� ������
 */


import acm.program.*;

public class P71FactRecurce extends ConsoleProgram{

	private static final int MAX_NUM = 10;
	
	public void run(){
		for (int i = 0; i<MAX_NUM; i++){
			println(i + "! = " + factRec(i));
		}
	}

	public int factRec (int n){
		if (n<=1)
			return 1;
		return n*factRec(n-1);
	}
}
