package day07;

import java.util.Scanner;

public class Student {
	// �ʵ� ���� 
	// �̸�, ����, ����
	String name;
	int point;
	char grade;
	
	void showData(){
		System.out.println("===�л� ����===");
		System.out.println("�̸�:" + name);
		System.out.println("����:" + point+"��");
		System.out.println("����:" + grade);
	}
	
	void setData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = sc.next();
		System.out.println("���� : ");
		point = sc.nextInt();
		if(point >= 90) grade = 'A';
		else if(point >= 80) grade = 'B';
		else if(point >= 70) grade = 'C';
		else if(point >= 60) grade = 'D';
		else grade = 'F';
		sc.close();
	}
}








