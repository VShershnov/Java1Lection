package ua.com.glybovets.java1_1.lecture10;

import acm.program.*;

public class P91FirmPersonalUse extends ConsoleProgram {
	public void run(){
		
		P91FirmPersonal Emp1 = new P91FirmPersonal("�����",21);
		println(Emp1);
		println("�������� ������� ����������� - "+Emp1.getNumberOfEmployees());
		
		P91FirmPersonal Emp2 = new P91FirmPersonal("������","����������� �볺���", "��������");
		println(Emp2);
		println("�������� ������� ����������� - "+Emp2.getNumberOfEmployees());
		
		Emp1.setDepartment("Գ���� �����");
		Emp1.addSalesValue(105);
		Emp2.addSalesValue(700);
		Emp2.addSalesValue(100);
		println(Emp1);
		println(Emp2);
	}

	
}
