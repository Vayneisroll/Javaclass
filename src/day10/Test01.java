package day10;

import day10_2.Person;
import day10_2.*; // day10_2패키지의 '모든' 클래스를 데려오겠다 

public class Test01 {
	public static void main(String[] args) {
		// 외부 패키지에 있는 클래스를 갖다 쓰는 방법 
		// 1. 패키지명.클래스명
		day10_2.Person p = new day10_2.Person();
		
		// 2. import 선언 방법
		Person pp = new Person();
		//pp.name = "피카츄"; 
		
		pp.setName("피카츄");
		pp.setAge(-10);
		pp.setPhone("010-1111-2222");
		
		System.out.println(pp.getName());
		System.out.println(pp.getAge());
		System.out.println(pp.getPhone());
	}
}
/*
 * < 접근제어자(access modifier) > 
 * - 노출 범위를 지정하는 키워드 
 * 1. public : 모두 접근 가능(다 보여주겠다!)
 * 2. protected : 다른 패키지에게는 보여주지 않지만, 
 * 				  자식클래스라면 보여주겠다. 
 * 3.        : default접근제어자
 * 			     같은 패키지 O / 다른 패키지 X
 * 4. private : 클래스 안에서만 접근 가능 
 * 				(나만 볼거야!)
 * - 은닉화 : 정보보호, 필요한 정보만 노출하겠다!
 * - 캡슐화 : 보호막(getter, setter)으로 필드의 무결성 유지
 * 
 * ** 필드(멤버변수)는 무조건 private으로 선언
 * ** 메소드는 무조건 public으로 선언
 * 
 */










