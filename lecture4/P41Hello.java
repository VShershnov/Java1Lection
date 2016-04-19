package ua.com.glybovets.java1_1.lecture4;
/*
 * Files: HelloProgram2.java
 */


import java.awt.Color;

import acm.graphics.*;
import acm.program.*;


public class P41Hello extends GraphicsProgram {

	public void run(){
		this.setSize(400, 200);
		GLabel label = new GLabel("Hello, world",100,75);
		label.setFont("SansSerif-36");
		label.setColor(Color.RED);
		add(label);
	}
}
