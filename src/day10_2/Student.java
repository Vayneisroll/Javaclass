package day10_2;

public class Student {
	// 필드 : 
	// 이름, 나이, 국어, 영어, 평균, 등급, 합격여부(boolean)
	private String name;
	private int age;
	private int kr, en;
	private double avg;
	private char grade;
	private boolean passed;
	// 메소드 
	// 1. 생성자 
//		- 이름, 나이만 
	public Student(String name, int age){
		setName(name);
		setAge(age);
	}
//		- 이름, 국어, 영어
	public Student(String name, int kr, int en){
		setName(name);
		setKr(kr);
		setEn(en);
	}
//	 	- 이름, 나이, 국어, 영어
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
//		- setAge() : 음수면 1살로 
	public void setAge(int age){
		this.age = (age>=0)? age: 1;
	}
//		- 국어, 영어 : 0 ~ 100 그 외의 값은 0점처리
	public void setKr(int kr){
		this.kr = (kr>=0 && kr<=100)?kr:0;
		setAvg();
	}
	public void setEn(int en){
		this.en = (en>=0 && en<=100)?en:0;
		setAvg();
	}
//		- private setAvg() : 국어, 영어만 가지고 설정
	private void setAvg(){
		avg = (kr+en) /2.0;
		setGrade();
		setPassed();
	}
//		- private setGrade() : 평균만 가지고 설정
	private void setGrade(){
		if(avg>=90) grade ='A';
		else if(avg>=80) grade ='B';
		else if(avg>=70) grade ='C';
		else if(avg>=60) grade ='D';
		else grade ='F';
	}
//	 	- private setPass() : 평균이 85점 이상이면 합격
	private void setPassed(){
		passed = avg>=85;
	}
}



