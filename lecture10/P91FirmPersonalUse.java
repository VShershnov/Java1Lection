package ua.com.glybovets.java1_1.lecture10;

import acm.program.*;

public class P91FirmPersonalUse extends ConsoleProgram {
	public void run(){
		
		P91FirmPersonal Emp1 = new P91FirmPersonal("Андрій",21);
		println(Emp1);
		println("Загальна кількість співробітників - "+Emp1.getNumberOfEmployees());
		
		P91FirmPersonal Emp2 = new P91FirmPersonal("Микола","Корпоративні клієнти", "Менеджер");
		println(Emp2);
		println("Загальна кількість співробітників - "+Emp2.getNumberOfEmployees());
		
		Emp1.setDepartment("Фізичні особи");
		Emp1.addSalesValue(105);
		Emp2.addSalesValue(700);
		Emp2.addSalesValue(100);
		println(Emp1);
		println(Emp2);
	}

	
}
