package ua.com.glybovets.java1_1.lecture7;
/*
 * ������ ��� ���� ����� ������� ������
 */


import acm.program.*;

public class P72NSDRecurce extends ConsoleProgram{

	
	public void run(){
		int a = readInt("������ ����� a: ");
		int b = readInt("������ ����� b: ");
		println("��� (a,b) = " + NSD(a,b));
		
	}
			
		public int NSD(int a, int b){
			if (b==0)
				return a;
			if (a%b==0)
				return b;
			return NSD (b,a%b);
		}
}
