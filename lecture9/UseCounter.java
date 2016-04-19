package ua.com.glybovets.java1_1.lecture9;

import acm.program.*;

public class UseCounter extends ConsoleProgram{

	public void run(){
		
		setFont("Times New Roman-28");
		
		MyCounter counter1 = new MyCounter();
		MyCounter counter2 = new MyCounter(100);
		
		println("Додамо п'ять до counter1");
		countFiveTimes(counter1);
		
		println("Додамо п'ять до counter2");
		countFiveTimes(counter2);
	}

	private void countFiveTimes(MyCounter counter) {
		for (int i=0; i<5; i++)
			println(counter.nextValue());
		
	}
}
