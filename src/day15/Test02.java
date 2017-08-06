package day15;
/*
 * < Set >
 * - ���� X, �ߺ� ���� X
 * - TreeSet : �ڵ� ������ ����� ����
 * - HashSet : ����, �˻� �ӵ��� ����
 */
import java.util.Set; // �������̽�
import java.util.TreeSet; // Ŭ���� 
import java.util.HashSet; // Ŭ���� 
import java.util.Iterator; // �������̽�
public class Test02 {
	public static void main(String[] args) {
		Set<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(5);
		s.add(13);
		s.add(100);
		s.add(22);
		s.add(88);
		s.add(4);
		System.out.println(s);
		
		/*
		 * < Iterator > 
		 * - �ݺ� ó����
		 */
		Iterator<Integer> it = s.iterator(); // så�� �ȿ�.. �ݺ������� ��ü�� �������� 
		while(it.hasNext()){// ���� ���Ұ� �ִ�? 
			System.out.println(it.next()); 
			   // next() ���� ���� �� ���Ҹ� ��ȯ�ϰ�, ���� ���ҷ� �Ѿ
		}
	}
}












