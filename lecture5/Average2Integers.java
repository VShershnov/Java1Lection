package ua.com.glybovets.java1_1.lecture5;
import acm.program.*;

public class Average2Integers extends ConsoleProgram {
	
	public void run(){
		
		println("Ця програма знаходить середнє арифметичне двох чисел");
		int n1 = readInt("Введіть число 1:");
		int n2 = readInt("Введіть число 2:");
		double avg = n1 + n2/2;
		println("Середнє дорівнює " +avg +"!");
		
	}

}
