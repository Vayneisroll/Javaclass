package day04;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// ���� 1�� �Է� ���� ��,
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("���� : ");
		n = sc.nextInt();
		// 1. ¦������ �Ǻ�
		if(n%2==0){
			System.out.println("¦��");
			System.out.println("2�� ���");
		} else {
			System.out.println("Ȧ��");
		}
		// 2. 2��, 3��, 5�ǹ������ �Ǻ�
		// 	e.g. 6 => 2�ǹ�� 3�ǹ��
		if(n%3==0){
			System.out.println("3�� ���");
		}
		if(n%5==0){
			System.out.println("5�� ���");
		}
		
		// ���� 1�� �Է� ���� ��, ���� ���  
		// 90~ A / 80~90 B / 70~80 C / 60~70 D / ~60 F
		int score;
		System.out.println("���� : ");
		score = sc.nextInt();
		if(score >= 90){ System.out.println("A");}
		else if(score >=80){System.out.println("B");}
		else if(score >=70){System.out.println("C");}
		else if(score >=60){System.out.println("D");}
		else{System.out.println("F");}
	}
}












