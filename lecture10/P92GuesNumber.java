package ua.com.glybovets.java1_1.lecture10;

import ua.com.glybovets.java1_1.lecture9.MyCounter;
import acm.program.*;
import acm.util.*;


public class P92GuesNumber extends ConsoleProgram{
	
	/* верхня межа діапазону загадуваних чисел */
	private static final int MAXDIAPAZONE = 100;
		
	public void run() {

		int numUser=0;
		int	number = rgen.nextInt(1, MAXDIAPAZONE);
		
		MyCounter counter1 = new MyCounter();
		
		println("Компютер загадав число в діапазоні від 1 до " + MAXDIAPAZONE);
		println("Спробуйте вгадати його.");
		
		numUser = readInt("Вкажіть ваш варіант числа: ");
		if (numUser==number) {
			println("Ви вгадали з першого разу!!!");
		} else {
			while (numUser!=number) {
				if (numUser<number) 
					println("Загадане число быльше");
				if (numUser>number) 
					println("Загадане число менше");
				counter1.nextValue();
				numUser = readInt("Вкажіть ваш варіант числа: ");
			}
			println("Ви вгадали. Кількість спроб - " + counter1.getCounter());
		}
	}
	
	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	
}
