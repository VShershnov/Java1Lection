package ua.com.glybovets.java1_1.lecture10;

public class FirmPersonal {
	
	public FirmPersonal(String fio, int age) {
		
		this.fio = fio;
		department = "";
		position="";
		this.age=age;
		numberOfEmployees++;
	}
	
	public FirmPersonal(String fio, String department, String position){
		this.fio = fio;
		this.department = department;
		this.position = position;
		numberOfEmployees++;
	}
	
	public FirmPersonal(String fio, int age, int salesVolume){
		this.fio = fio;
		this.salesVolume = salesVolume;
		numberOfEmployees++;
	}
	
	public int addSalesValue(int sales){
		salesVolume+=sales;
		bonusVolume=salesVolume*bonusPercent;
		return salesVolume;
	}
	
	@Override
	public String toString() {
		return "FirmPersonal [fio=" + fio + ", department=" + department
				+ ", position=" + position + ", age=" + age + ", salesVolume="
				+ salesVolume + ", bonusVolume=" + bonusVolume + "]";
	}

	public double getBonusVolume() {
		return bonusVolume;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
	}

	public static final double bonusPercent =  0.05;
	
	private static int numberOfEmployees=0;
	
	private String fio;
	private String department;
	private String position;
	private int age;
	private int salesVolume;
	private double bonusVolume;
		
}
