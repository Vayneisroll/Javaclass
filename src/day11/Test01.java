package day11;

/*
 * Person : �̸�, ����, ����ó 
 * Student: �̸�, ����, ����ó, ����, ���
 * Employee: �̸�, ����, ����ó, ����, ����, ȸ��
 * 
 * < ���(inheritance) >
 * : ������ �ִ� Ŭ������ 'Ȯ��'�ؼ� �� Ŭ������ �����ϴ� �۾�
 *  ����Ŭ���� : �θ�Ŭ���� == ����Ŭ���� == ����Ŭ����
 *  Ȯ��Ŭ���� : �ڽ�Ŭ���� == ����Ŭ���� == ����Ŭ����
 *  
 * < ��� ���ǻ��� > 
 * : �ڹٿ����� ���߻���� �Ұ��� ( �� �̻��� �θ� �δ� �� X ) 
 * : �ڽ�Ÿ���� ��ü�� ������ ��, �θ� ����� ��ü�� ���� �����Ǵµ�.. 
 *    => �ڽ� Ÿ���� ������ ȣ�� ��, �θ� Ÿ���� �����ڰ� ���� ȣ��ȴ�. 
 * < super >
 * : this(�� ��ü�� ���۷���)
 *   super(�� ��ü ���� �θ��� ��ü�� ���۷���)
 *   
 *   ** this == super (�ν��� ����)
 *      this��� �ϸ�, �ڽ� Ÿ�� ��ü�� �ν���
 *      super��� �ϸ�, �θ� Ÿ�� ��ü������ �ν���
 */
class Person { 
	String name; int age; String phone; 
	Person(String name){
		this.name = name;
	}
}
class Student extends Person{
	int point;
	char grade;
	Student(){
		super("����"); // �θ�Ÿ��(Person) ������ ȣ��
	}
	// �ڽİ�ü�� ������� ��, ���� ���� �θ�Ÿ�� �����ڰ� ȣ��Ǵµ�,
	// �̶�, �θ�Ŭ������ �⺻�����ڰ� ����, �ٸ� �����ڰ� ������
	// �� �����ڿ� �°� �� super() ������ ȣ��ο� ���� �־���� �Ѵ�.
}
class Employee extends Person{
	String position;
	int salary;
	String corp;
	public Employee() {
		super(null);
	}
}
public class Test01 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "ȫ�浿";
		
	}
}




















