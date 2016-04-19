package ua.com.glybovets.java1_1.lecture5;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class H51Home extends GraphicsProgram {
	
	public void run(){
		
		this.setSize(500, 600);
		sky();
		home();
		ground();
	}

	private void ground() {
		GRect ground = new GRect(0,380,500,220);
		ground.setFilled(true);
		ground.setColor(Color.GRAY);
		add(ground);
	}

	private void home() {
		dymohod();
		walls();
		window1();
		window2();
		door();
	}

	private void walls() {
		GOval oval1 = new GOval(170,250,300,250);
		oval1.setFilled(true);
		oval1.setFillColor(Color.MAGENTA);
		add(oval1);
	}

	private void door() {
		GRect dr = new GRect(370,300,50,80);
		dr.setFilled(true);
		dr.setColor(Color.white);
		add(dr);
		int i=370;
		while (i<420) {
			GLine line1 = new GLine(i,300,i,380);
			add(line1);
			i+=3;
		}
	}

	private void dymohod() {
		GRect dym = new GRect(400,250,30,80);
		dym.setFilled(true);
		dym.setColor(Color.DARK_GRAY);
		add(dym);
	}

	private void window2() {
		GRect wn = new GRect(300,300,40,40);
		wn.setFilled(true);
		wn.setColor(Color.WHITE);
		add(wn);
		
		GLine line1 = new GLine(300,315,340,315);
		add(line1);
		
		GLine line2 = new GLine(320,300,320,315);
		add(line2);
					
	}

	private void window1() {
		GRect wn = new GRect(220,300,50,40);
		wn.setFilled(true);
		wn.setColor(Color.WHITE);
		add(wn);
		
		GLine line1 = new GLine(245,300,245,340);
		add(line1);
	}

	private void sky() {
		sun();
		clouds();
	}

	private void clouds() {
		GOval oval1 = new GOval(70,75,50,30);
		oval1.setFilled(true);
		oval1.setFillColor(Color.BLUE);
		add(oval1);
		
		GOval oval2 = new GOval(200,75,70,30);
		oval2.setFilled(true);
		oval2.setFillColor(Color.BLUE);
		add(oval2);
		
		GOval oval3 = new GOval(400,75,70,30);
		oval3.setFilled(true);
		oval3.setFillColor(Color.BLUE);
		add(oval3);
		
		
	}

	private void sun() {
		GOval oval1 = new GOval(300,75,30,30);
		oval1.setFilled(true);
		oval1.setFillColor(Color.YELLOW);
		add(oval1);
	}
	
}
