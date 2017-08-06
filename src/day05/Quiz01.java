package day05;

import java.util.Scanner;

public class Quiz01 {
/*
 * 1. 구구단 4단 출력
 * 2. 정수를 1개 입력, 그 수 만큼 *출력
 *   e.g. 5 => *****
 * 3. 30 ~ 100까지 누적합 : 4615
 *   30 + 31 + 32 + ... + 100 =?
 * 4. 구구단 문제 5문제를 내고, 
 *    정답 개수를 출력, 3개 이상 맞추면 WIN 아니면 LOSE 
 * 5. 구구단 2단 ~ 9단 모두 출력
 */
	public static void main(String[] args) {
		// Q1.
		for(int n = 1; n<=9; n++){
			System.out.println("4 X " + n + " = " + 4*n);
		}
		System.out.println();
		
		// Q2. 
		Scanner sc = new Scanner(System.in);
		System.out.print("별 몇 개? : ");
		int count = sc.nextInt();
		for(int n = 1; n<=count; n++){
			System.out.print("*");
		}
		System.out.println("\n");
		
		// Q3.
		int sum = 0; // 누적용 변수 
		for(int i = 30; i<=100; i++){
			sum+=i;
		}
		System.out.println("누적합 : " + sum);
		System.out.println();
		
		// Q4.
		int n1, n2;
		int count2 = 0;
		int answer;
		for(int i = 1; i<=5; i++){
			n1 = (int)(Math.random()*8)+2; // 2 ~ 9
			n2 = (int)(Math.random()*9)+1; // 1 ~ 9
			System.out.println(n1 +"X"+n2+"=?");
			answer = sc.nextInt();
			if(answer==n1*n2){
				System.out.println("정답!");
				count2++;
			} else {
				System.out.println("땡!");
			}
		}
		System.out.println("총 " + count2 + "개 정답");
		if(count2>=3){
			System.out.println("WIN");
		} else {
			System.out.println("LOSE");
		}
		System.out.println();
		
		for(int dan = 2; dan <= 9; dan++){
			
			System.out.println("==" + dan + "단==");
			
			for(int n = 1; n<=9; n++){
				System.out.println(dan + "X"+n + "="+dan*n);
			}
			
		}
	}
}

















