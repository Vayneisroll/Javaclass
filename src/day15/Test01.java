package day15;
/*
 * < Generic >
 * - �ڷ����� ����
 * - < �ڷ��� > 
 *   => ��� ���Ҹ� Object���� �ν��� �� �ƴ϶�, �� �ڷ������� �ν��϶�
 */
import java.util.ArrayList;
import java.util.Collections;
class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name + "/" + age + "��"; 
	}
	@Override
	public int compareTo(Person o) {
		// ������ ����� ������ '����' ����
		// �ڷ� �а� ������ '���' ����
		// ���� ��ü�� ����ϰ� ������ 0 ����
		if(name.equals(o.name)){
			return o.age-age; 
		}
		return name.compareTo(o.name); 
	}
}
public class Test01 {
	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add( new Person("��ī��", 5) );
		arr.add( new Person("������", 7) );
		arr.add( new Person("Ǫ��", 3) );
		arr.add( new Person("����", 4) );
		arr.add( new Person("�����", 5) );
		System.out.println(arr.toString());
		
		// 3�� ������ Ǫ���� p �޸��忡 ����
//		Person p = (Person)arr.get(2);
//		System.out.println( ((Person)arr.get(0)).name );
		
		Person p = arr.get(2);
		System.out.println( arr.get(0).name );
		
		// Ȯ�� for��
		for(Person tmp:arr){
			System.out.println(tmp.name);
		}
		
		Collections.sort(arr);
		System.out.println(arr);
	}
}













