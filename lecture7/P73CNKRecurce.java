package ua.com.glybovets.java1_1.lecture7;
/*
 * ������ ��� ���� ����� ������� ������
 */


import acm.program.*;

public class P73CNKRecurce extends ConsoleProgram{

	
	public void run(){
		int n = readInt("������ ����� n: ");
		int k = readInt("������ ����� k: ");
		println("CNK(n,k) = " + CNK(n,k));
		
	}
			
		public int CNK(int n, int k){
			if (n<=1 || k==0 || n==k)
				return 1;
			return CNK(n-1,k-1)+CNK(n-1,k);
		}
}
