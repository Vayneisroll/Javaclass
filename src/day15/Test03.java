package day15;
import java.util.*; 

public class Test03 {
	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("��ī��",3));
		ts.add(new Person("ȫ�浿",40));
		ts.add(new Person("������",5));
		ts.add(new Person("����",1));
		ts.add(new Person("�ѹ���",12));
		ts.add(new Person("ȫ�浿",3));
		System.out.println(ts);
	}
}
