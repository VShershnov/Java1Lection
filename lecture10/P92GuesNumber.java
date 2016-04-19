package ua.com.glybovets.java1_1.lecture10;

import ua.com.glybovets.java1_1.lecture9.MyCounter;
import acm.program.*;
import acm.util.*;


public class P92GuesNumber extends ConsoleProgram{
	
	/* ������ ���� �������� ����������� ����� */
	private static final int MAXDIAPAZONE = 100;
		
	public void run() {

		int numUser=0;
		int	number = rgen.nextInt(1, MAXDIAPAZONE);
		
		MyCounter counter1 = new MyCounter();
		
		println("�������� ������� ����� � ������� �� 1 �� " + MAXDIAPAZONE);
		println("��������� ������� ����.");
		
		numUser = readInt("������ ��� ������ �����: ");
		if (numUser==number) {
			println("�� ������� � ������� ����!!!");
		} else {
			while (numUser!=number) {
				if (numUser<number) 
					println("�������� ����� ������");
				if (numUser>number) 
					println("�������� ����� �����");
				counter1.nextValue();
				numUser = readInt("������ ��� ������ �����: ");
			}
			println("�� �������. ʳ������ ����� - " + counter1.getCounter());
		}
	}
	
	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	
}
