package day04;

import java.util.Scanner;

public class Quiz04 {
/*
 * ������ 2~9�� �����ϰ� 1������ ����, 
 * 5�� ���� ������ ��� �ݺ��ϴ� ���α׷�
 */
	public static void main(String[] args) {
		int n1, n2;
		int count = 0; // ���� �� �����
		int answer; // �� �Է¿�
		
		Scanner sc = new Scanner(System.in);
		
		while(count!=5){
			n1 = (int)(Math.random()*8)+2; // 2 ~ 9
			n2 = (int)(Math.random()*9)+1; // 1 ~ 9
			System.out.println(n1 +"X"+n2+"=?");
			answer = sc.nextInt();
			if(answer==n1*n2){
				System.out.println("����!");
				count++;
			} else {
				System.out.println("��!");
			}
		}
		
		sc.close();
	}
}







