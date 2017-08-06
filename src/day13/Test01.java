package day13;
/*
 * API : �⺻������ �����ϴ� ���� ���� Ŭ����
 * 
 *  ** ���� : ���� => java api 8 => Oracle help Center
 *     https://docs.oracle.com/javase/8/docs/api/
 *  ** �ѱ� : changki.net
 *  
 * < �ֿ� Ŭ���� >
 * 1. java.lang ��Ű�� - �ڵ� ������
 *  : ���� ���Ǵ� �߿��� Ŭ�������� �������
 *  System, String, Integer, Double, Math, Object, ...
 * 
 * 2. java.util ��Ű�� - ����ϸ� ������ Ŭ���� 
 *  Scanner, Date, Calendar, ... 
 *  
 * 3. java.text ��Ű�� - �ؽ�Ʈ ������ �����Ϳ� ���õ� ��Ű��
 *  SimpleDateFormat, DecimalFormat
 *  
 * ==========================================================
 * < Object > 
 *  - �ڹ��� ��� Ŭ������ ��Ʈ Ŭ����
 *  - ��� Ŭ������ ������ Object�� ��ӵǾ�����
 *  - ObjectŸ���� ��� Ŭ������ ��ȭ�� �� �ִ�! (�� ���� �� �ִ�!!)
 *    ** �����ڷ��� �����ʹ� �ȵ�
 */
class Person{
	String name;
	String phone;
	
	public boolean equals(Object another){
		if(another instanceof Person){
			Person ano = (Person)another;
			if(name.equals(ano.name) && phone.equals(ano.phone)){
				return true;
			}
			return false; 
		}
		return false; // �ٸ���
	}
	
	public String toString(){
		return "�̸�:" + name + "/" + phone;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Object o1 = new Person(); 
		Object o2 = "ABC"; 
		Object o3 = 3.14;
		
		Object[] o4 = {"ABC", 'A', 1, new Person(), 3.14, true};
		for(Object o:o4){
			System.out.println(o);
		}
		
		Person p = new Person();
		p.name = "��ī��";
		p.phone = "010";
//		1. boolean equals(Object another) 
//		 - this�� another�� ���� ���۷�����?
		Person p2 = new Person();
		p2.name = "��ī��";
		p2.phone = "010";
		
		System.out.println(p.equals(p2)); //false
		
		String s1 = new String("ABC");
		String s2 = "ABC"; 
		System.out.println(s1.equals(s2)); // true 
//		** String Ŭ������ Object���׼� �������� equals()�� �������̵� ��
//		** Ŭ������ ���� ��, equals()�� �������̵��ϵ��� ����
		
//		2. Class getClass()
//		 => �� ��ü�� Ŭ������ ��üȭ�Ͽ� ��ȯ
//		 => Class.getName() : �� Ŭ���� �̸��� String���� ��ȯ 
		System.out.println(p.getClass());
		String className = p.getClass().getName();
		System.out.println(className);
		
//		3. int hashCode()
//		 => �� ��ü�� �ؽ��ڵ� ���� ����ġ�� �˷���
		System.out.println(p);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
//		4. String toString()
//		 => �� ��ü�� ǥ���ϴ� �Ѹ���!�� ���ڿ��� ��ȯ
		System.out.println(p.toString());
		System.out.println(p);
//		���۷��� ������ ���۷����� �������� �ʰ�, �ڵ����� toString()
//		e.g. ���۷����� ���, ���ڿ� Ÿ������ ������ ��.. 
		String info = p + "\n";
		System.out.println(info);
		System.out.println(p); 
		
		Integer n = new Integer(10); 
		System.out.println(n);
		System.out.println(n.toString());
	}
}










