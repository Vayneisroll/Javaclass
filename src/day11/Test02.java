package day11;
/*
 * < 다형성(polymorphism) >
 * - 피카츄가 라이츄가 되었다가 파이리도 되었다가, 푸린도 되었다가..
 * - 객체의 성질이 변하는 것
 * - 레퍼런스 형변환
 * - 부모타입 레퍼런스 변수 = 자식 객체의 레퍼런스
 *  => 해당 자식타입처럼 행동함
 * - 오직, 부모모양까지만 인식되기 때문에 
 *   부모가 물려준 멤버,메소드, 오버라이드된 메소드까지만 인식됨
 *   자식 고유의 멤버를 사용하고 싶다면, 강제형변환을 해야 함
 * - *** 부모타입은, 모든 자식타입 객체를 소화할 수 있다 
 * - Upcasting  : 자식 객체를 부모타입으로 형변환=> 자동형변환
 * 				Pokemon p = new Pikachu(); 
 * 				// Pikachu객체가 Pokemon으로 upcasting 
 * - Downcasting : 부모 타입으로 인식됐던 자식 객체를 다시 자식타입으로 되돌리는 것
 *  	Pokemon p = new Pikachu(); 
 *  	Pikachu pika = (Pikachu)p; 
 * 
 * < 다형성의 용도 > 
 * 1. 배열에 다양한 타입의 객체를 저장할 수 있다.
 *   Pokemon[] 에는.. 피카츄, 파이리, 꼬부기... 자식 객체들 모두가 들어있다. 
 * 2. 인자값으로 다양한 타입의 객체를 넣을 수 있다
 *   매개변수가 Pokemon이라면, 재료로 피카츄, 파이리, 꼬부기.. 다 들어갈 수 있다.
 *   
 */
class Pokemon {
	String name;
	int hp;
	void attack(){
		System.out.println("포켓몬 공격 개시!");
	}
	Pokemon(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
}
class Pikachu extends Pokemon{
	
	String master = "지우"; 
	
	Pikachu(){
		super("피카츄", 100);
	}
	@Override
	void attack(){
		System.out.println("피카츄 백만볼트 공격!");
	}
}
class Raichu extends Pokemon{
	Raichu(){
		super("라이츄", 200);
	}
	@Override 
	void attack(){
		System.out.println("라이츄 천만볼트 공격!");
	}
}
class Pairi extends Pokemon{
	Pairi(){
		super("파이리", 150);
	}
	@Override 
	void attack(){
		System.out.println("파이리 불꽃 공격!");
	}
}
class Ggobugi extends Pokemon{
	Ggobugi(){
		super("꼬부기", 150);
	}
	@Override 
	void attack(){
		System.out.println("꼬부기 물대포 공격!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Pokemon p;
		
		// p가 피카츄됨
		p = new Pikachu();
		p.attack();
		
		// p가 라이츄됨
		p = new Raichu();
		p.attack();
		
		// p가 꼬부기됨
		p = new Ggobugi();
		p.attack();
				
		Pokemon p1 = new Pikachu();
		System.out.println(((Pikachu)p1).master);
		// 부모타입으로 자식객체에 접근할 때, 
		// 자식의 고유멤버는 인식이 안돼서.. 강제형변환 해야 함 
		// (Pikachu)p1.master (X) 
		//  => p1.master를 Pikachu로 형변환하겠다는 말이 됨
		//  => . : 우선순위 1순위임
		
	}
}





















