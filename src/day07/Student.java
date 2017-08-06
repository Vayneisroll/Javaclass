package day07;

import java.util.Scanner;

public class Student {
	// 필드 선언 
	// 이름, 점수, 학점
	String name;
	int point;
	char grade;
	
	void showData(){
		System.out.println("===학생 정보===");
		System.out.println("이름:" + name);
		System.out.println("점수:" + point+"점");
		System.out.println("학점:" + grade);
	}
	
	void setData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("점수 : ");
		point = sc.nextInt();
		if(point >= 90) grade = 'A';
		else if(point >= 80) grade = 'B';
		else if(point >= 70) grade = 'C';
		else if(point >= 60) grade = 'D';
		else grade = 'F';
		sc.close();
	}
}








