package ua.com.glybovets.java1_1.lecture5;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class P51Graphics extends GraphicsProgram {
	
	public void run(){
		
		this.setSize(500, 600);
		GLabel label = new GLabel("HY it's my new program", 100, 30);
		label.setFont("sansserif-16");
		label.setColor(Color.BLACK);
		add(label);
		
		GRect rect1 = new GRect(155,160,50,50);
		add(rect1);
		
		
		GRect rect2 = new GRect(100,35,162,100);
		rect2.setFilled(true);
		rect2.setColor(Color.RED);
		add(rect2);
		
		GOval oval1 = new GOval(100,35,162,100);
		oval1.setFilled(true);
		oval1.setFillColor(Color.GREEN);
		//oval1.setColor(Color.GREEN);
		add(oval1);
		
		GLine line1 = new GLine(100,31,262,31);
		add(line1);
		
	}
	
}
