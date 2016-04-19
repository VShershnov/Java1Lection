package ua.com.glybovets.java1_1.lecture9;

public class MyCounterStatic {
	
	public MyCounterStatic(int startValue){
		counter = startValue;
	}
	
	public MyCounterStatic(){
		counter = 1;
	}
	
	public int nextValue(){
		int temp = counter;
		counter++;
		return (temp);
	}
	
	private static int counter;

}
