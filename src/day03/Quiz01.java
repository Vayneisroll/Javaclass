package day03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
//		console에 입력 받기 위해..
//		심부름꾼 생성 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		
//		sc에게 입력 받은 데이터를 정수로 가져오라고 시킴
//		그걸 age에 저장
		int age = sc.nextInt();
		
		System.out.println("당신은 " + age + "세군요~!");

//		age가 20살 이상이면 "성인" 아니면 "미성년자"를 msg에 저장
		String msg = (age>=20 ? "성인": "미성년자") ;
		System.out.println("당신은 " + msg + "입니다!");
		
	}
}




