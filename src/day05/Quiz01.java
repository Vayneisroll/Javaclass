package day05;

import java.util.Scanner;

public class Quiz01 {
/*
 * 1. ������ 4�� ���
 * 2. ������ 1�� �Է�, �� �� ��ŭ *���
 *   e.g. 5 => *****
 * 3. 30 ~ 100���� ������ : 4615
 *   30 + 31 + 32 + ... + 100 =?
 * 4. ������ ���� 5������ ����, 
 *    ���� ������ ���, 3�� �̻� ���߸� WIN �ƴϸ� LOSE 
 * 5. ������ 2�� ~ 9�� ��� ���
 */
	public static void main(String[] args) {
		// Q1.
		for(int n = 1; n<=9; n++){
			System.out.println("4 X " + n + " = " + 4*n);
		}
		System.out.println();
		
		// Q2. 
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� ��? : ");
		int count = sc.nextInt();
		for(int n = 1; n<=count; n++){
			System.out.print("*");
		}
		System.out.println("\n");
		
		// Q3.
		int sum = 0; // ������ ���� 
		for(int i = 30; i<=100; i++){
			sum+=i;
		}
		System.out.println("������ : " + sum);
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
				System.out.println("����!");
				count2++;
			} else {
				System.out.println("��!");
			}
		}
		System.out.println("�� " + count2 + "�� ����");
		if(count2>=3){
			System.out.println("WIN");
		} else {
			System.out.println("LOSE");
		}
		System.out.println();
		
		for(int dan = 2; dan <= 9; dan++){
			
			System.out.println("==" + dan + "��==");
			
			for(int n = 1; n<=9; n++){
				System.out.println(dan + "X"+n + "="+dan*n);
			}
			
		}
	}
}

















