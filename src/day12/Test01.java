package day12;
/*
 * < 추상 클래스, 추상 메소드 >
 * 1. 추상 메소드? 바디가 없는 메소드
 *  => abstract 접근제어자 반환자료형 메소드명 (매개변수 자료형);
 *     (바디,{} 대신에 ;으로 마무리) 
 *  => 미완성 메소드
 *  => 자식 클래스가 이 미완성메소드를 반드시 완성해야 한다 
 *     (바디를 작성해야 한다)
 *  => 언제 사용? 자식클래스들이 '어차피' 오버라이드할 운명의 메소드에 사용
 *     부모 입장에서 굳이 바디를 쓸 이유가 없기때문에..
 *     -> 그렇다고 아예 안만들면 다형성 구현이 어렵다.
 *  => 추상 클래스에서만 선언할 수 있음
 * 
 * 2. 추상 클래스 
 *  => 클래스 정의 시 맨 앞에 abstract을 붙이면 
 *  => 추상메소드를 선언할 수 있음, 그 외는 일반 클래스랑 똑같음
 */
abstract class Hero {
	String name;
	int level;
	
	void attack(){
		System.out.println("영웅 출동!");
	}
	
	abstract void move(); // 추상 메소드 선언
						  // Hero의 자식클래스들은 move()를 반드시 완성해야 함
}
class Superman extends Hero {
	
	@Override
	void move() {
		System.out.println("슈퍼맨 날아간다..!!");
	}
}
class Batman extends Hero {
	@Override
	void move() {
		System.out.println("배트맨 이동!!!");
	}
}
class Spiderman extends Hero{
	@Override
	void move() {
		System.out.println("스파이더맨 쓩쓩!!!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Hero[] heros = {new Superman(), new Batman(), new Spiderman()};
		for(Hero h : heros){
			h.move();
		}
		Hero h = new Hero(){ // 익명 클래스 (즉석에서 오버라이드)
			@Override
			void move() {
				System.out.println("나는 h만을 위한 move()");
			}
		}; 
		h.move(); 
	}
}





