package day12;
/*
 * < 인터페이스 > 
 * - 클래스 아님
 *  : 객체 생성 X / 레퍼런스 변수로는 선언 가능
 * - 실체가 없음
 * - 규약, 약속
 *  e.g. 모든 포켓몬 클래스들의 이동메소드 move()로 한다...
 *                           공격메소드는 attack()으로 한다..
 *       포켓몬의 최대 크기 1000픽셀로 한다.. 
 * - 상수, 추상메소드, default메소드만 선언 가능
 * - 이 인터페이스를 구현하는 (실체화하는) 클래스를 
 *   '구현 클래스'라고한다.
 * - 구현할 때는 클래스 선언 시 implements를 쓴다
 * - 인터페이스 간의 다중 상속 가능
 * - 하나의 클래스는 여러 개의 인터페이스를 구현할 수 있다  
 */
interface A{}
interface B{}
interface C extends A, B{}

public interface Pokemon {
	
	// String name; (X) 변수 선언이 아니라서 에러.. 
	/*public static final*/double MAX_PIXEL = 1000; 
	double PI = 3.14;
	
	/*public abstract*/ void move(); 
	void attack(Pokemon enemy);
	default void greeting(){
		System.out.println("포켓몬 월드에 오신 것을 환영합니다~"); 
	}
}

class Pikachu implements Pokemon {
	
	@Override
	public void move() {
		System.out.println("피카 피카");
	}
	
	@Override
	public void attack(Pokemon enemy) {
		System.out.println("백만볼트 공격!");
	}
}

class Raichu implements Pokemon {
	@Override
	public void move() {
		System.out.println("라이 라이 ~");
	}
	
	@Override
	public void attack(Pokemon enemy) {
		System.out.println("천만볼트 공격!");
	}
}





