package day03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
//		console�� �Է� �ޱ� ����..
//		�ɺθ��� ���� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
//		sc���� �Է� ���� �����͸� ������ ��������� ��Ŵ
//		�װ� age�� ����
		int age = sc.nextInt();
		
		System.out.println("����� " + age + "������~!");

//		age�� 20�� �̻��̸� "����" �ƴϸ� "�̼�����"�� msg�� ����
		String msg = (age>=20 ? "����": "�̼�����") ;
		System.out.println("����� " + msg + "�Դϴ�!");
		
	}
}




