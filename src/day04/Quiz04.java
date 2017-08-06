package day04;

import java.util.Scanner;

public class Quiz04 {
/*
 * 구구단 2~9단 랜덤하게 1문제를 내고, 
 * 5번 맞출 때까지 계속 반복하는 프로그램
 */
	public static void main(String[] args) {
		int n1, n2;
		int count = 0; // 정답 수 세기용
		int answer; // 답 입력용
		
		Scanner sc = new Scanner(System.in);
		
		while(count!=5){
			n1 = (int)(Math.random()*8)+2; // 2 ~ 9
			n2 = (int)(Math.random()*9)+1; // 1 ~ 9
			System.out.println(n1 +"X"+n2+"=?");
			answer = sc.nextInt();
			if(answer==n1*n2){
				System.out.println("정답!");
				count++;
			} else {
				System.out.println("땡!");
			}
		}
		
		sc.close();
	}
}







