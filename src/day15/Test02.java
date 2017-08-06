package day15;
/*
 * < Set >
 * - 순서 X, 중복 원소 X
 * - TreeSet : 자동 정렬의 기능이 있음
 * - HashSet : 저장, 검색 속도가 빠름
 */
import java.util.Set; // 인터페이스
import java.util.TreeSet; // 클래스 
import java.util.HashSet; // 클래스 
import java.util.Iterator; // 인터페이스
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
		 * - 반복 처리자
		 */
		Iterator<Integer> it = s.iterator(); // s책장 안에.. 반복수행자 객체를 생성해줌 
		while(it.hasNext()){// 다음 원소가 있니? 
			System.out.println(it.next()); 
			   // next() 지금 보는 이 원소를 반환하고, 다음 원소로 넘어가
		}
	}
}












