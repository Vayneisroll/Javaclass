package day02;

public class Quiz01 {
	
	public static void main(String[] args){
		String name = "��ī��"; // �̸�
		int age = 10; // ����
		String phone = "010-1234-5678"; // ����ó
		double tall = 110.4; // Ű
		String address = "����� ���α� ��������"; // �ּ�
		
		int base = 4; 
		int height = 3; 
		// �غ� 4, ���� 3�� �ﰢ�� ����, �簢�� ����
		double triangleArea = base * height * 0.5;
		float rectangleArea = base * height; 
		// ���� ��� ������ sysout
		
		System.out.println("�̸� : "+ name);
		System.out.println("���� : " + age + "��");
		System.out.println("����ó : " + phone);
		System.out.println("�ּ� : " + address);
		System.out.println("Ű : " + tall + "cm");
		
		System.out.print("�غ� " + base + ", ");
		System.out.print("���� " + height + "�� ");
		System.out.println("�ﰢ���� ���� : " + triangleArea);
		System.out.println("�簢���� ���� : " + rectangleArea);
	}
}









