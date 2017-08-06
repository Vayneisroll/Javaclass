package day14;
/*
 * < Collections > 
 * - 대량의 데이터를 저장할 수 있는 책장
 * - 배열의 단점을 극복하고, 다양한 모양의 자료구조를 지원한다.
 *   ** 배열의 단점 
 *    1) 개수 제한이 있다 
 *    2) 중간 데이터를 삭제하거나, 삽입할 때 시간이 걸린다
 * - 저장되는 모든 원소타입의 기본자료형 : Object => 다 저장가능하다
 * - 3가지 계열 (List, Set, Map)
 * 
 * 1. List (인터페이스)
 *  - 구현 클래스 : ArrayList, LinkedList, Vector, Stack
 *  - 특징 : 순서 있음, 중복 원소 저장가능
 * 2. Set (인터페이스)
 *  - 구현 클래스 : TreeSet, HashSet
 *  - 특징 : 순서 없음, 중복 원소 저장 불가
 * 3. Map (인터페이스)
 *  - 구현 클래스 : TreeMap, HashMap, HashTable 
 *  - 특징 : 
 *  	1. 키-값의 쌍으로 원소 저장 
 *  	2. 키를 통해 값(원소)을 찾음 
 *  	3. 검색에 특화되어있음 
 */
import java.util.ArrayList;
import java.util.Date; 

public class Test02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(); // 책장 객체 생성
//		1. 원소 추가 : void add(Object element)
		arr.add(3.14);
		arr.add("ABC");
		arr.add(new Date());
		arr.add('A');
		arr.add(10); 
		System.out.println(arr); // arr.toString()
		
		System.out.println(arr.isEmpty()); // 비어있니-비었으면 true
		System.out.println(arr.size()); // 몇 개니 (int)
		
//		2. 원소 수정 : void set(int index, Object newData)
//		- index번 째 원소를 newData로 대체
		arr.set(2,  "ABCDE");
		System.out.println(arr);
		
//		3. 원소 삽입 : 
		arr.add(0, "피카츄");
		System.out.println(arr);
		
//		4. 원소 보기 : Object get(int index)
		Object o1 = arr.get(2); // "ABC"
		
//		5. 원소 삭제 : remove(int) / remove(Object)
		arr.remove(4); // 4번 원소 삭제
		System.out.println(arr);
		arr.remove("ABC");
		System.out.println(arr);
		arr.remove((Integer)10); 
		System.out.println(arr);
		
//		6. 모두 삭제 : clear()
		arr.clear();
		System.out.println(arr);
	}
}




