package day06;
/*
 * < Ŭ���� >
 * 1. ����Ŭ����(���θ޼ҵ尡 �ִ� Ŭ����)
 *   => ���α׷��� ���� 
 * 
 * 2. Ŭ����(�����)
 *   => ��ü�� �������� �� ����� �뵵
 */

// ����� Ŭ���� 
class Person{
	String name;
	int age;
	String phone;
	void showInfo(){
		System.out.println("�̸�:" + name);
		System.out.println("����:" + age);
		System.out.println("����ó:" + phone);
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		Person p1, p2;
//		Person : ���۷��� �ڷ���
//		  		 �ּ��� �ڷ���: �� �ּҸ� ã�ư��� �� ������ ���
//		p1, p2 : ���۷��� ����  ( �ּ� ������ �޸��� )
		
		
		p1=new Person();
//		new Person() : Person��� ��ü ����+�� ���۷��� ��ȯ
//		p1�� �� ���۷����� ����
						  
		p2 = new Person();
		
		p1.name = "ȫ�浿";
		p1.age = 40;
		p1.phone = "010-1234-5678";
		
		p2.name = "��ī��";
		p2.age = 10;
		p2.phone = "010-1111-2222";
		
		System.out.println("===p1����===");
		p1.showInfo();
		System.out.println("===p2����===");
		p2.showInfo();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}










