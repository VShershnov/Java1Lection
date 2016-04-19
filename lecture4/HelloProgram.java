package ua.com.glybovets.java1_1.lecture4;
/*
 * Files: HelloProgram.java
 * ÷€ програма просто виводить "Hello, world" на екран
 * ÷е перша програма
 */



import acm.graphics.*;
import acm.program.*;

public class HelloProgram extends GraphicsProgram {
	public void run(){
		this.setSize(300, 400);
		add( new GLabel("Hello, world", 100, 75));
	}
}
