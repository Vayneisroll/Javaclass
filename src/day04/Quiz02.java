package day04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 정수 1개 입력 받은 후,
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("정수 : ");
		n = sc.nextInt();
		// 1. 짝수인지 판별
		if(n%2==0){
			System.out.println("짝수");
			System.out.println("2의 배수");
		} else {
			System.out.println("홀수");
		}
		// 2. 2의, 3의, 5의배수인지 판별
		// 	e.g. 6 => 2의배수 3의배수
		if(n%3==0){
			System.out.println("3의 배수");
		}
		if(n%5==0){
			System.out.println("5의 배수");
		}
		
		// 점수 1개 입력 받은 후, 학점 출력  
		// 90~ A / 80~90 B / 70~80 C / 60~70 D / ~60 F
		int score;
		System.out.println("점수 : ");
		score = sc.nextInt();
		if(score >= 90){ System.out.println("A");}
		else if(score >=80){System.out.println("B");}
		else if(score >=70){System.out.println("C");}
		else if(score >=60){System.out.println("D");}
		else{System.out.println("F");}
	}
}












