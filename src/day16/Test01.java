package day16;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * < Map > 
 * - Ű,�� ������ ���Ҹ� ����
 * - Ű�� ���� ���� ã�� => �˻� ������ �Ϸ���..
 *  e.g. ��ī�� => ����, ����ó.. ���� ����
 * - Ű�� �ߺ� X / Ű�� �ٸ��� ���� �ߺ� O
 *  ** TreeMap�� Ű�� �������� �ڵ� ����
 * 
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	String phone; 
	Person(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String toString(){
		return name + "/" + age + "��/" + phone ; 
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
		// �̸��� ���ؼ� ��ü������ �������ڴ�!
		Map<String,Person> m = new TreeMap<String,Person>();
		m.put("��ī��", new Person("��ī��", 10,"010-1111-1111"));
		m.put("������", new Person("������", 20,"010-2222-2222"));
		
		Person p = new Person("Ǫ��", 5, "����");
		m.put(p.name,p);
		
		p = m.get("��ī��"); 
		System.out.println(p);
		
		Set<String> keys = m.keySet(); // ������ �����
		for(String key : keys){
			System.out.println(m.get(key));
		}
		
		if(m.containsKey("��ī��")){
			System.out.println("�ֽ��ϴ�");
		}
		else {
			System.out.println("�����ϴ�");
		}
		
		// Ű�� �ִ���? : containsKey(key) 
		// ���� �ִ���? : containsValue(value)
		// ���� : remove(key)
		// �������� : get(key)
		// ���� ���� : size()
		// ��� ����� : clear() 
	}
}












