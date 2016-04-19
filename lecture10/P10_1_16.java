package ua.com.glybovets.java1_1.lecture10;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import ua.com.glybovets.java1_1.lecture7.P71FactRecurce;
import ua.com.glybovets.java1_1.lecture9.MyCounter;
	
	/*	�������� ����, �� ���� ������ �������� ������:
1. �����, �� 10 ���� �������� �� ����� ��'� � �������.
2. �����, �� �������� ������� �������� ������ ������ ����� ���������� �����.
3. �����, �� �������� ������� �������� ������ �'��� ����� ���������� �������� �����.
4. �����, �� �������� ���� ������ n ����� ���������� ����� �����. ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������.
5. �����, �� �������� ���� ������ n ������ ���� 1, 3, 5, 7, .... ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������.
6. �����, �� �������� ���� ������ n ������ ���� 1+1/2+1/3+1/4+...
7. �����, �� �������� ������� �������� ����� (�� ������� �� ������).
8. �����, �� �������� �������� ��������� �� ��������� �����.
9. �����, �� �������� ������� ������� ������� y = -2,4�2+5�-3 � �������� �� -2 �� 2 �� ������ 0,5.
10. �����, �� ������ 10 ���������� ����� � �������� �� 1 �� 10, �������� �� ����� �� ����� � �������� �� ������� �����������.
11. �����, �� �������� �� ����� ������� �������, ���������, ����� � �������� �� 100 ��. �� 1 �� �� ������ 100.
12. ����� �������� ����� �������� � �������� ����� � ����� 100. �������� ������� ������� 10 ��������, ������� � ������� ������� ���������� ������� ���� ����� ��� ������� �� ������, ����� �� ����������� ����������� ������������� �������� � ���������� �����������. ������ ������������� �� ��������� ��������: �� 10 ���������� �������� - "������", �� 9 � 8 -"�����", �� 7 � 6 - "���������", �� 6 � ���� - "������".
13. �����, �� �������� ���� � ������� ����������� ����������� ���������� �����, �� ��������� �� ���������.
14. �����, �� ������� ����������� ����� � ������� �� ��������� ����������� ���������� ����� (������� ����������� �� ��������).
15. �����, �� ��������, �� � ���� �����, ������� ������������, �������.
16. �����, �� "������" ����� � �������� �� 1 �� 100 � ������� ������������ ������� ����� �� 7 �����. �� ������� ����� ����'���� ��������� "�����" ��� "�����" �������� ��� ����� ������� ��������� ������������.
	 */

public class P10_1_16 extends ConsoleProgram{
	
	public void run() {
		int i;
		
		println("1. �����, �� 10 ���� �������� �� ����� ��'� � �������");
		String namesoname = readLine("������� ���� ��'� � �������: ");
		printName10Times(namesoname);
		
		println("2. �����, �� �������� ������� �������� ������ ������ ����� ���������� �����");
		readLine("��������� Enter, ���� ������ ����� ");
		kvadratFist10Num();
		
		println("3. �����, �� �������� ������� �������� ������ �'��� ����� ���������� �������� �����");
		readLine("��������� Enter, ���� ������ ����� ");
		kvadratFirst5UnpairNum();
		
		println("4. �����, �� �������� ���� ������ n ����� ���������� ����� �����." +
				"ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������");
		int n4=readInt("������ ����� n: ");
		println("C���� ������ n �����: "+sumFirstN(n4));
		
		println("5. �����, �� �������� ���� ������ n ������ ���� 1, 3, 5, 7, .... " +
				"ʳ������ ������� ����� ������� ��������� �� ��� ������ ��������");
		int n5=readInt("������ ����� n: ");
		println("C���� ������ n ����� ���� 1, 3, 5, 7..: "+sumFirstNUnpair(n5));
		
		println("6. �����, �� �������� ���� ������ n ������ ���� 1+1/2+1/3+1/4+...");
		double n6=readInt("������ ����� n: ");
		println("C���� ������ n ����� ���� 1+1/2+1/3+1/4+...: "+sumFirstNDrob(n6));

		println("7. �����, �� �������� ������� �������� ����� (�� ������� �� ������)");
		readLine("��������� Enter, ���� ������ ����� ");
		for (i=0; i<=10;i++)
			println("2("+i+")="+tabOf2Step(i));
		
		println("8. �����, �� �������� �������� ��������� �� ��������� �����");
		long n8=readInt("������ ����� n: ");
		println(n8+"!="+factorial(n8));
		
		println("9. �����, �� �������� ������� ������� ������� y = -2,4�2+5�-3 � �������� �� -2 �� 2 �� ������ 0,5");
		readLine("��������� Enter, ���� ������ ����� ");
		double x9=-2;
		i=0;
		while (x9>=(-2)&&x9<=2) {
			println("y("+x9+")="+(-2.4*x9*x9+5*x9-3));
			i++;
			x9+=0.5;
		}
		
		println("10. �����, �� ������ 10 ���������� ����� � �������� �� 1 �� 10," +
				" �������� �� ����� �� ����� � �������� �� ������� �����������.");
		readLine("��������� Enter, ���� ������ ����� ");
		random10Avr();
		
		println("11. �����, �� �������� �� ����� ������� �������, " +
				"���������, ����� � �������� �� 100 ��. �� 1 �� �� ������ 100.");
		String tov=readLine("������� ����� ������ ");
		double price=readDouble("�� �������� 1 �� ");
		println("-----------------");
		println(tov);		
		for (i=1; i<10;i++)
			println("������� "+100*i+" �� - "+(price*i/(10)));
		println("������� 1 �� - "+price);
		
		println("12. ����� �������� ����� �������� � �������� ����� � ����� 100." +
				" �������� ������� ������� 10 ��������, " +
				"������� � ������� ������� ���������� ������� ���� ����� ��� ������� �� ������," +
				" ����� �� ����������� ����������� ������������� �������� � ���������� �����������." +
				" ������ ������������� �� ��������� ��������: �� 10 ���������� �������� - ������, " +
						"�� 9 � 8 - �����, �� 7 � 6 - ���������, �� 6 � ���� - ������.");
		println("������ ��������� �������");
		plusMinusTest();
		
		println("13. �����, �� �������� ���� � ������� ����������� ����������� ���������� �����, �� ��������� �� ���������.");
		int n13=-1;
		int i13=0;
		int sum13=0;
		while (n13!=0) {
			n13=readInt("������ ����� ����� 0 ��� 0 ��� ������: ");
			if (n13==0)
				break;
			else{
				sum13+=n13;
				i13++;
			}
		}
		println ("����� �������� ����� - "+sum13);
		println ("������� �������� �������� ����� - "+(sum13/i13));
	
		
		println ("14. �����, �� ������� ����������� ����� " +
				"� ������� �� ��������� ����������� ���������� ����� " +
				"(������� ����������� �� ��������)");
		int n14=1;
		int max14=0;
		while (n14!=0) {
			n14=readInt("������ ����� ����� 0 ��� 0 ��� ������: ");
			if (n14==0)
				break;
			else if (n14>=max14)
					max14=n14;
		}
		println ("����������� � �������� �����: "+max14);

		println ("15. �����, �� ��������, �� � ���� �����, ������� ������������, �������.");
		int n15=readInt("������ ����� n: ");
		int i15=2;
		while (i15<n15){
			if (n15%i15==0){
				println("����� n �� ������");
				break;
			}
			i15++;
			if (i15==n15)
				println("�� ����� ������ �����");
		}
		
		
		println ("16. �����, �� ������ ����� � �������� �� 1 �� 100" +
				" � ������� ������������ ������� ����� �� 7 �����." +
				" �� ������� ����� ����'���� ��������� ����� ��� ����� �������� ��� ����� ������� ��������� ������������.");
		guesNumber();
	}
	
	private void guesNumber() {
			int numUser=0; //�����, �� ���� ���������� ����������
			int	num16 = rgen.nextInt(1, 100); 
			int counter=0;
			
			println("�������� ������� ����� � �������� �� 1 �� 100");
			println("��������� ������� ���� �� 7 �����");
			
			numUser = readInt("������ ��� ������ �����. ������ 1: ");
			if (numUser==num16)
				println("�� ������� � ������� ����!!!");
			else {
				for (counter=2;counter<9;counter++) {
					if (counter==7){
						println("�� ��������� ������� �����, ��� �� ������� �����");
						break;
					}
						
					if (numUser<num16) 
						println("�������� ����� ������");
					if (numUser>num16) 
						println("�������� ����� �����");
										
					numUser = readInt("������ ��� ������ �����. ������ "+counter+": ");
					
					if (numUser==num16){ 
						println("�� �������. ʳ������ ����� - " + counter);
						break;
					}
				}
				
			}
	}

	private void plusMinusTest() {
		int res;	
		int ans;
		int count=0;
		for (int i = 1; i <= 10; i++) {
			int ri = rgen.nextInt(1,100);
			int rj = rgen.nextInt(1,100-ri);
			if (ri<rj){
				res=ri+rj;
				ans=readInt(ri+" + "+rj+" = ");
			} else{
				res=ri-rj;
				ans=readInt(ri+" - "+rj+" = ");
			}
			if (res==ans)
				count++;
		}
		if (count==10)
			println("��� ��������� - ³�����!!");
		else if (count==9 || count==8)
			println("��� ��������� - �����");
		else if (count==7 || count==6)
			println("��� ��������� - ���������");
		else 
			println("������� ��������� ������� ��������� � ��������� �����");
	}

	private void random10Avr() {
		int avr=0;
		for (int i = 1; i <= 10; i++) {
			int ri = rgen.nextInt(1,100);
			println ("��������� �����"+i+ " - "+ri);
			avr=(avr*(i-1)+ri)/i;
		}
		println ("������� �������� ������������� ����� - "+avr);
	}
	
	/* Private instance variables */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	

	private long factorial(long n8) {
		if (n8<=1)
			return 1;
		return n8*factorial(n8-1);
	}

	private int tabOf2Step(int n7){
			if (n7==0)
				return 1;
			else
				return 2*tabOf2Step(n7-1);
	}

	private double sumFirstNDrob(double n6) {
		if (n6==0)
			return 0;
		return (1/n6)+sumFirstNDrob(n6-1);
	}

	private int sumFirstNUnpair(int n5) {
		if (n5==1)
			return 1;
		return (2*n5-1)+sumFirstNUnpair(n5-1); 
	}

	public int sumFirstN(int n) {
		if (n==1)
			return 1;
		return n+sumFirstN(n-1);
	}

	private void kvadratFirst5UnpairNum() {
		int n=1;
		int i=1;
		while (i<=5) {
			if (n%2==1){
				println(n+" � ������� "+(n*n));
				i++;
			}
			n++;
		}	
	}

	private void kvadratFist10Num() {
		for (int i = 1; i <=10; i++) {
			println(i+" � ������� "+(i*i));
		}		
	}

	private void printName10Times(String namesoname) {
		for (int i = 0; i < 10; i++) {
			println((i+1)+". "+namesoname);
		}		
	}

	
}
