package day03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// ��, ��, �� �Է� �ް� ����� 60.2 �̻��̸�
		// "�հ�!" / "���հ�" ���
		// 60, 60, 61 => 60.333 ���� �հ��� ���;� ��!
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kr = sc.nextInt();
		System.out.print("���� : ");
		int en = sc.nextInt(); 
		System.out.print("���� : ");
		int ma = sc.nextInt(); 
		double avg = (double)(kr+en+ma)/3;
		String msg = (avg>=60.2) ? "�հ�" : "���հ�" ;
		System.out.println("����� " + avg + "������, " + msg);
	}
}






