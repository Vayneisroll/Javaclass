package day04;

import java.util.Scanner;

public class Quiz03 {
/*
 * �� �Է� => ��¥ �� ��� 
 * e.g. 4 => 30�ϱ��� �ֽ��ϴ�!
 *      1 => 31�ϱ��� �ֽ��ϴ�!
 * 1, 3, 5, 7, 8, 10, 12 : 31��
 * 2 : 28��
 * 4, 6, 9, 11 : 30��
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month, date;
		System.out.print("�� : ");
		month = sc.nextInt();
		switch(month){
		case 1: case 3: case 5: 
		case 7: case 8: case 10: case 12:
			date = 31;
			break;
		case 2:
			date = 28;
			break;
		case 4: case 6: case 9: case 11:
			date = 30;
			break;
		default: 
			date = 0; 
			System.out.println("�߸� �Է�..");
		}
		System.out.println(month + "���� " + date +"�ϱ��� �ִ�.");
	}
}










