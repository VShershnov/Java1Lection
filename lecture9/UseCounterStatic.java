package ua.com.glybovets.java1_1.lecture9;

import acm.program.*;

public class UseCounterStatic extends ConsoleProgram{

	public void run(){
		
		setFont("Times New Roman-28");
		
		MyCounterStatic counter1 = new MyCounterStatic();
		MyCounterStatic counter2 = new MyCounterStatic(100);
		
		println("Додамо п'ять до counter1");
		countFiveTimes(counter1);
		
		println("Додамо п'ять до counter2");
		countFiveTimes(counter2);
	}

	private void countFiveTimes(MyCounterStatic counter) {
		for (int i=0; i<5; i++)
			println(counter.nextValue());
		
	}
}
