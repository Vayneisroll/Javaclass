package day09;
class Person {
	String name;
	int age;
	String phone;
	
	// ������(constructor): 
	// ��ü �ʱ�ȭ�� ����ϴ� Ư�� �޼ҵ� 
	//  - �⺻�������� ���� : ��� 0���� �ʱ�ȭ
	// ���� : 
//	    �޼ҵ�� �Ȱ�����... �����ڷ��� X / Ŭ�����̸��� �Ȱ��ƾ� ��
	
	// �ڵ����� �߰��Ǵ� '�⺻������'
	Person(){} 
	Person(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	Person(String n){
		this.name = n;
	}
	Person(String n, int a){
		name = n;
		age = a;
	}
	
	void show(){
		System.out.println(this + "�� show() ����!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person pp = new Person();
		Person p = new Person("��ī��", 10, "01011112222");
		System.out.println(p.age);
		
		Person ppp = new Person("������"); 
	}
}








