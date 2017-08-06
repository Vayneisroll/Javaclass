package day06;
/*
 * < 클래스 >
 * 1. 메인클래스(메인메소드가 있는 클래스)
 *   => 프로그램의 주축 
 * 
 * 2. 클래스(설계용)
 *   => 객체를 디자인할 때 사용할 용도
 */

// 설계용 클래스 
class Person{
	String name;
	int age;
	String phone;
	void showInfo(){
		System.out.println("이름:" + name);
		System.out.println("나이:" + age);
		System.out.println("연락처:" + phone);
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		Person p1, p2;
//		Person : 레퍼런스 자료형
//		  		 주소의 자료형: 그 주소를 찾아갔을 때 나오는 모양
//		p1, p2 : 레퍼런스 변수  ( 주소 저장할 메모장 )
		
		
		p1=new Person();
//		new Person() : Person모양 객체 생성+그 레퍼런스 반환
//		p1에 그 레퍼런스를 저장
						  
		p2 = new Person();
		
		p1.name = "홍길동";
		p1.age = 40;
		p1.phone = "010-1234-5678";
		
		p2.name = "피카츄";
		p2.age = 10;
		p2.phone = "010-1111-2222";
		
		System.out.println("===p1정보===");
		p1.showInfo();
		System.out.println("===p2정보===");
		p2.showInfo();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}










