package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 국, 영, 수 입력 받고 평균이 60.2 이상이면
		// "합격!" / "불합격" 출력
		// 60, 60, 61 => 60.333 으로 합격이 나와야 함!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kr = sc.nextInt();
		System.out.print("영어 : ");
		int en = sc.nextInt(); 
		System.out.print("수학 : ");
		int ma = sc.nextInt(); 
		double avg = (double)(kr+en+ma)/3;
		String msg = (avg>=60.2) ? "합격" : "불합격" ;
		System.out.println("당신은 " + avg + "점으로, " + msg);
	}
}






