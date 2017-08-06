package day16;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * < Map > 
 * - 키,값 쌍으로 원소를 저장
 * - 키를 통해 값을 찾음 => 검색 빠르게 하려고..
 *  e.g. 피카츄 => 나이, 연락처.. 정보 나옴
 * - 키는 중복 X / 키가 다르면 값은 중복 O
 *  ** TreeMap은 키를 기준으로 자동 정렬
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
		return name + "/" + age + "세/" + phone ; 
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
		// 이름을 통해서 객체정보를 가져오겠다!
		Map<String,Person> m = new TreeMap<String,Person>();
		m.put("피카츄", new Person("피카츄", 10,"010-1111-1111"));
		m.put("라이츄", new Person("라이츄", 20,"010-2222-2222"));
		
		Person p = new Person("푸린", 5, "없음");
		m.put(p.name,p);
		
		p = m.get("피카츄"); 
		System.out.println(p);
		
		Set<String> keys = m.keySet(); // 열쇠함 만들기
		for(String key : keys){
			System.out.println(m.get(key));
		}
		
		if(m.containsKey("피카츄")){
			System.out.println("있습니다");
		}
		else {
			System.out.println("없습니다");
		}
		
		// 키가 있는지? : containsKey(key) 
		// 값이 있는지? : containsValue(value)
		// 삭제 : remove(key)
		// 값꺼내기 : get(key)
		// 원소 개수 : size()
		// 모두 지우기 : clear() 
	}
}












