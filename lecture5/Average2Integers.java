package ua.com.glybovets.java1_1.lecture5;
import acm.program.*;

public class Average2Integers extends ConsoleProgram {
	
	public void run(){
		
		println("�� �������� ��������� ������ ����������� ���� �����");
		int n1 = readInt("������ ����� 1:");
		int n2 = readInt("������ ����� 2:");
		double avg = n1 + n2/2;
		println("������ ������� " +avg +"!");
		
	}

}
