package day09;

public class Student {
	// 필드 : 이름, 국어, 영어, 평균, 등급
	String name;
	int kr, en;
	double avg;
	char grade;
	// 메소드 :
	/*
	 * 1. 생성자 
	 *   - 기본생성자 
	 *   - 이름만
	 *   - 이름, 국어, 영어만 (평균, 등급 자동 저장)
	 */
	Student(){
	}
	Student(String name){
		this.name = name;
	}
	Student(String name, int kr, int en){
		this(name);
		setKr(kr);
		setEn(en);
	}
	 /*   
	 * 2. 모든 정보를 sysout으로 보여주는 showData()
	 */
	 void showData(){
		 System.out.println("이름 : " + name);
		 System.out.println("국어 : " + kr + "점");
		 System.out.println("영어 : " + en + "점");
		 System.out.println("평균 : " + avg + "점");
		 System.out.println("등급 : " + grade);
	 }
	 /* 
	 * 3. 평균 구하는 setAvg()
	 */
	 void setAvg(){
		 avg = (kr+en)/2.0;
		 setGrade();
	 }
	 /* 
	 * 4. 등급 구하는 setGrade() : ABCDF
	 */
	 void setGrade(){
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
	 }
	 /* 
	 * 5. 기타 메소드 만들고 싶으면 더 만드셔도 됩니다.. 
	 */
	 void setKr(int kr){
		 if(kr < 0 || kr > 100){
			 kr = 0;
		 } else{
			 this.kr = kr;
		 }
		 setAvg();
	 }
	 void setEn(int en){
		 if(en < 0 || en > 100){
			 en = 0;
		 } else{
			 this.en = en;
		 }
		 setAvg();
	 }
}




