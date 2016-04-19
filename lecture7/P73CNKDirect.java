package ua.com.glybovets.java1_1.lecture7;
/*
 * ������ �������� �����
 */


import acm.program.*;

public class P73CNKDirect extends ConsoleProgram{

	private static final int MAX_NUM = 10;
	
	public void run(){
		int n = readInt("������ ����� n: ");
		int k = readInt("������ ����� k: ");
		println("CNK(n,k) = " + CNK(n,k));
	}

	public int CNK(int n, int k){
		return fact(n)/(fact(k)*fact(n-k));
	}
	
	public int fact (int n){
		if (n<=1)
			return 1;
		return n*fact(n-1);
	}
}
