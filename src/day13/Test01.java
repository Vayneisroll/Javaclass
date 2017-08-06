package day13;
/*
 * API : 기본적으로 제공하는 여러 편리한 클래스
 * 
 *  ** 원문 : 구글 => java api 8 => Oracle help Center
 *     https://docs.oracle.com/javase/8/docs/api/
 *  ** 한글 : changki.net
 *  
 * < 주요 클래스 >
 * 1. java.lang 패키지 - 자동 임포팅
 *  : 자주 사용되는 중요한 클래스들이 들어있음
 *  System, String, Integer, Double, Math, Object, ...
 * 
 * 2. java.util 패키지 - 사용하면 유용한 클래스 
 *  Scanner, Date, Calendar, ... 
 *  
 * 3. java.text 패키지 - 텍스트 형식의 데이터에 관련된 패키지
 *  SimpleDateFormat, DecimalFormat
 *  
 * ==========================================================
 * < Object > 
 *  - 자바의 모든 클래스의 루트 클래스
 *  - 모든 클래스는 무조건 Object가 상속되어있음
 *  - Object타입은 모든 클래스를 소화할 수 있다! (다 들어올 수 있다!!)
 *    ** 원시자료형 데이터는 안됨
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
		return false; // 다르다
	}
	
	public String toString(){
		return "이름:" + name + "/" + phone;
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
		p.name = "피카츄";
		p.phone = "010";
//		1. boolean equals(Object another) 
//		 - this랑 another랑 같은 레퍼런스니?
		Person p2 = new Person();
		p2.name = "피카츄";
		p2.phone = "010";
		
		System.out.println(p.equals(p2)); //false
		
		String s1 = new String("ABC");
		String s2 = "ABC"; 
		System.out.println(s1.equals(s2)); // true 
//		** String 클래스가 Object한테서 물려받은 equals()를 오버라이드 함
//		** 클래스를 만들 때, equals()를 오버라이드하도록 권장
		
//		2. Class getClass()
//		 => 이 객체의 클래스를 객체화하여 반환
//		 => Class.getName() : 그 클래스 이름을 String으로 반환 
		System.out.println(p.getClass());
		String className = p.getClass().getName();
		System.out.println(className);
		
//		3. int hashCode()
//		 => 이 객체의 해시코드 값을 정수치로 알려줌
		System.out.println(p);
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
		
//		4. String toString()
//		 => 이 객체를 표현하는 한마디!를 문자열로 반환
		System.out.println(p.toString());
		System.out.println(p);
//		레퍼런스 변수는 레퍼런스를 보여주지 않고, 자동으로 toString()
//		e.g. 레퍼런스를 출력, 문자열 타입으로 저장할 때.. 
		String info = p + "\n";
		System.out.println(info);
		System.out.println(p); 
		
		Integer n = new Integer(10); 
		System.out.println(n);
		System.out.println(n.toString());
	}
}










