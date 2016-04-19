package ua.com.glybovets.java1_1.lecture9;

public class MyCounter {
	
	public MyCounter(int startValue){
		counter = startValue;
	}
	
	public MyCounter(){
		counter = 1;
	}
	
	public int nextValue(){
		int temp = counter;
		counter++;
		return (temp);
	}
	
	public int getCounter() {
		return counter;
	}

	private int counter;

}
