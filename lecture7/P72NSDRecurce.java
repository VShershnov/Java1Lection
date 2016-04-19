package ua.com.glybovets.java1_1.lecture7;
/*
 * Рахуємо НСД двох чисел методом рекурсії
 */


import acm.program.*;

public class P72NSDRecurce extends ConsoleProgram{

	
	public void run(){
		int a = readInt("Введіть число a: ");
		int b = readInt("Введіть число b: ");
		println("НСД (a,b) = " + NSD(a,b));
		
	}
			
		public int NSD(int a, int b){
			if (b==0)
				return a;
			if (a%b==0)
				return b;
			return NSD (b,a%b);
		}
}
