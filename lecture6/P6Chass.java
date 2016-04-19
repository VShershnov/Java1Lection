package ua.com.glybovets.java1_1.lecture6;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class P6Chass extends GraphicsProgram {

	private static final int DESKSIZE = 8; //кількість клітинок сторони квадрату дошки
	private static final int LENTH = 500; // дожина поля
	private static final int HIGHT = 600; //висота поля
	
	public void run(){
		this.setSize(LENTH, HIGHT);
		int deskLen=0;
		int deskHigh=0;
		for (int i=0; i<DESKSIZE; i++) {
			deskLen=0;
			for (int j = 0; j < DESKSIZE; j++) {
				GRect rect2 = new GRect(0+LENTH/DESKSIZE*j,0+LENTH/DESKSIZE*i,LENTH/DESKSIZE,LENTH/DESKSIZE);
				rect2.setFilled(true);
				if (i%2==0) {
					if (j%2==0) {
						rect2.setColor(Color.WHITE);
					} else {
						rect2.setColor(Color.BLACK);
					}
				} else {
					if (j%2==0) {
						rect2.setColor(Color.BLACK);
					} else {
						rect2.setColor(Color.WHITE);
					}
				}
				add(rect2);
				deskLen+=LENTH/DESKSIZE;
			}
			deskHigh+=LENTH/DESKSIZE;
		}
		GRect rect1 = new GRect(0,0,deskLen,deskHigh);
		add(rect1);
	}
}
