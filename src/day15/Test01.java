package day15;
/*
 * < Generic >
 * - 자료형을 지정
 * - < 자료형 > 
 *   => 모든 원소를 Object으로 인식할 게 아니라, 이 자료형으로 인식하라
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
		return name + "/" + age + "세"; 
	}
	@Override
	public int compareTo(Person o) {
		// 앞으로 땡기고 싶으면 '음수' 리턴
		// 뒤로 밀고 싶으면 '양수' 리턴
		// 같은 객체로 취급하고 싶으면 0 리턴
		if(name.equals(o.name)){
			return o.age-age; 
		}
		return name.compareTo(o.name); 
	}
}
public class Test01 {
	public static void main(String[] args) {
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add( new Person("피카츄", 5) );
		arr.add( new Person("라이츄", 7) );
		arr.add( new Person("푸린", 3) );
		arr.add( new Person("피츄", 4) );
		arr.add( new Person("토게피", 5) );
		System.out.println(arr.toString());
		
		// 3번 원소인 푸린을 p 메모장에 저장
//		Person p = (Person)arr.get(2);
//		System.out.println( ((Person)arr.get(0)).name );
		
		Person p = arr.get(2);
		System.out.println( arr.get(0).name );
		
		// 확장 for문
		for(Person tmp:arr){
			System.out.println(tmp.name);
		}
		
		Collections.sort(arr);
		System.out.println(arr);
	}
}













