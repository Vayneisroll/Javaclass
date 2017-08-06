package day07;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Student s1, s2, s3; //메모장 3장
		s1 = new Student();
		s2 = new Student();
		s3 = new Student();
		
		//s1 세팅
		s1.setData();
		
		//s2 세팅
		s2.setData();
		
		//s3 세팅
		s3.setData();
		
		s1.showData();
		s2.showData();
		s3.showData();
	}
}






