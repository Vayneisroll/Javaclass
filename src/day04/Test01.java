package day04;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// ���̸� �Է� �ް� 
		int age; 
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		age = sc.nextInt();
		
		// ����/�̼����� �Ǻ�
		if(age >= 20){ 
			System.out.println("����"); 
		} else { // �׷��� ������(���� ¦�� if�� ������ false��)
			System.out.println("�̼�����");
		}
		
		if(age <= 7) System.out.println("�����оƵ�");
		else if(age <= 13) System.out.println("�ʵ��л�");
		else if(age <= 16) System.out.println("���л�");
		else if(age <= 19) System.out.println("����л�");
		else System.out.println("�ش���� ����");
	}
}


