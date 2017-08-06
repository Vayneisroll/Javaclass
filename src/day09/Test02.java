package day09;
class Person {
	String name;
	int age;
	String phone;
	
	// 생성자(constructor): 
	// 객체 초기화를 담당하는 특수 메소드 
	//  - 기본생성자의 역할 : 모두 0으로 초기화
	// 형식 : 
//	    메소드랑 똑같지만... 리턴자료형 X / 클래스이름과 똑같아야 함
	
	// 자동으로 추가되는 '기본생성자'
	Person(){} 
	Person(String name, int age, String phone){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	Person(String n){
		this.name = n;
	}
	Person(String n, int a){
		name = n;
		age = a;
	}
	
	void show(){
		System.out.println(this + "의 show() 실행!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Person pp = new Person();
		Person p = new Person("피카츄", 10, "01011112222");
		System.out.println(p.age);
		
		Person ppp = new Person("라이츄"); 
	}
}








