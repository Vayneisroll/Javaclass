package day14;
/*
 * < Collections > 
 * - �뷮�� �����͸� ������ �� �ִ� å��
 * - �迭�� ������ �غ��ϰ�, �پ��� ����� �ڷᱸ���� �����Ѵ�.
 *   ** �迭�� ���� 
 *    1) ���� ������ �ִ� 
 *    2) �߰� �����͸� �����ϰų�, ������ �� �ð��� �ɸ���
 * - ����Ǵ� ��� ����Ÿ���� �⺻�ڷ��� : Object => �� ���尡���ϴ�
 * - 3���� �迭 (List, Set, Map)
 * 
 * 1. List (�������̽�)
 *  - ���� Ŭ���� : ArrayList, LinkedList, Vector, Stack
 *  - Ư¡ : ���� ����, �ߺ� ���� ���尡��
 * 2. Set (�������̽�)
 *  - ���� Ŭ���� : TreeSet, HashSet
 *  - Ư¡ : ���� ����, �ߺ� ���� ���� �Ұ�
 * 3. Map (�������̽�)
 *  - ���� Ŭ���� : TreeMap, HashMap, HashTable 
 *  - Ư¡ : 
 *  	1. Ű-���� ������ ���� ���� 
 *  	2. Ű�� ���� ��(����)�� ã�� 
 *  	3. �˻��� Ưȭ�Ǿ����� 
 */
import java.util.ArrayList;
import java.util.Date; 

public class Test02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); // å�� ��ü ����
//		1. ���� �߰� : void add(Object element)
		arr.add(3.14);
		arr.add("ABC");
		arr.add(new Date());
		arr.add('A');
		arr.add(10); 
		System.out.println(arr); // arr.toString()
		
		System.out.println(arr.isEmpty()); // ����ִ�-������� true
		System.out.println(arr.size()); // �� ���� (int)
		
//		2. ���� ���� : void set(int index, Object newData)
//		- index�� ° ���Ҹ� newData�� ��ü
		arr.set(2,  "ABCDE");
		System.out.println(arr);
		
//		3. ���� ���� : 
		arr.add(0, "��ī��");
		System.out.println(arr);
		
//		4. ���� ���� : Object get(int index)
		Object o1 = arr.get(2); // "ABC"
		
//		5. ���� ���� : remove(int) / remove(Object)
		arr.remove(4); // 4�� ���� ����
		System.out.println(arr);
		arr.remove("ABC");
		System.out.println(arr);
		arr.remove((Integer)10); 
		System.out.println(arr);
		
//		6. ��� ���� : clear()
		arr.clear();
		System.out.println(arr);
	}
}




