package day10_2;

public class Student {
	// �ʵ� : 
	// �̸�, ����, ����, ����, ���, ���, �հݿ���(boolean)
	private String name;
	private int age;
	private int kr, en;
	private double avg;
	private char grade;
	private boolean passed;
	// �޼ҵ� 
	// 1. ������ 
//		- �̸�, ���̸� 
	public Student(String name, int age){
		setName(name);
		setAge(age);
	}
//		- �̸�, ����, ����
	public Student(String name, int kr, int en){
		setName(name);
		setKr(kr);
		setEn(en);
	}
//	 	- �̸�, ����, ����, ����
	public Student(String name, int age, int kr, int en){
		this(name, kr, en); 
		setAge(age);
	}
	// 2. getters
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public int getKr(){
		return kr;
	}
	public int getEn(){
		return en;
	}
	public double getAvg(){
		return avg;
	}
	public char getGrade(){
		return grade;
	}
	public boolean isPassed(){
		return passed;
	}
	// 3. setters
//	 	- setName()
	public void setName(String name){
		this.name = name;
	}
//		- setAge() : ������ 1��� 
	public void setAge(int age){
		this.age = (age>=0)? age: 1;
	}
//		- ����, ���� : 0 ~ 100 �� ���� ���� 0��ó��
	public void setKr(int kr){
		this.kr = (kr>=0 && kr<=100)?kr:0;
		setAvg();
	}
	public void setEn(int en){
		this.en = (en>=0 && en<=100)?en:0;
		setAvg();
	}
//		- private setAvg() : ����, ��� ������ ����
	private void setAvg(){
		avg = (kr+en) /2.0;
		setGrade();
		setPassed();
	}
//		- private setGrade() : ��ո� ������ ����
	private void setGrade(){
		if(avg>=90) grade ='A';
		else if(avg>=80) grade ='B';
		else if(avg>=70) grade ='C';
		else if(avg>=60) grade ='D';
		else grade ='F';
	}
//	 	- private setPass() : ����� 85�� �̻��̸� �հ�
	private void setPassed(){
		passed = avg>=85;
	}
}



