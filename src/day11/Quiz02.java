package day11;
/*
 * 부모 : Unit 클래스 만들기
 * 	필드 - 이름, 체력, 공격력, alive(boolean) 
 *  메소드 - showData():모든 정보 sysout
 *  		attack(Unit enemy): 상대의 체력을 이 유닛의 공격력만큼 감소
 *  		생성자 : 이름, 체력, 공격력 인자값으로 넣고 객체 생성..
 *                  (alive는 true여야 함)   
 */
class Unit {
	String name;
	int hp, attack;
	boolean alive; 
	
	Unit(String name, int hp, int attack){
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		alive = true;
	}
	void attack(Unit enemy){
		System.out.println(this.name+"의 공격!! -"+this.attack);
		enemy.hp -= this.attack;
		System.out.println("상대 "+ enemy.name+"의 남은 체력:" + enemy.hp);
	}
	
	void showData(){
		System.out.println("======"+this.name+"의 정보======");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + attack);
	}
}
 /*                  
 * 자식 : Tank, Sniper 클래스
 *  1) Tank - 
 *  	이름: "탱크", 체력:1000, 공격:50
 *      attack() 오버라이드
 *      	: 50프로의 확률로 200데미지, 아니면 그냥 평타(공격력)
 */
class Tank extends Unit{
	
	Tank(){
		super("탱크", 1000, 50);
	}
	
	@Override
	void attack(Unit enemy){
		int att = Math.random()>0.5? 200 : attack ;
		System.out.println(this.name+"의 공격!! -"+att);
		enemy.hp -= att;
		System.out.println("상대 "+ enemy.name+"의 남은 체력:" + enemy.hp);
		if(enemy.hp <= 0){
			enemy.alive = false;
		}
	}
}
 /*      
 *  2) Sniper - 
 *  	 이름: "저격수", 체력:800, 공격:250
 *  	attack() 오버라이드 
 *  		: 30프로의 확률로 상대를 즉사, 아니면 그냥 평타
 */

class Sniper extends Unit{
	
	Sniper(){
		super("저격수", 800, 250);
	}
	
	@Override
	void attack(Unit enemy) {
		int att = Math.random()>0.7? enemy.hp : attack ;
		System.out.println(this.name+"의 공격!! -"+ att);
		enemy.hp -= att;
		System.out.println("상대 "+ enemy.name+"의 남은 체력:" + enemy.hp);
		if(enemy.hp <= 0){
			enemy.alive = false;
		}
	}
}

/*  
*  < 메인메소드 >
*   랜덤하게 두 유닛을 생성
*   둘 중 하나가 죽을 때까지 서로 공격
*/
public class Quiz02 {
	public static void main(String[] args) {
		Unit u1, u2; 
		u1 = (Math.random()>0.5) ? new Tank() : new Sniper();
		u2 = (Math.random()>0.5) ? new Tank() : new Sniper();
		
		System.out.println("플레이어1 생성완료!");
		u1.showData();
		
		System.out.println("플레이어2 생성완료!");
		u2.showData();
		
		while(true){
			if(u1.alive){
				System.out.println("플레이어1의 공격!");
				u1.attack(u2);
				if(!u2.alive){
					break;
				}
			}
			if(u2.alive){
				System.out.println("플레이어2의 공격!");
				u2.attack(u1);
				if(!u1.alive){
					break;
				}
			}
		}
		if(u1.alive){
			System.out.println("승리 : 플레이어1");
		}else {
			System.out.println("승리 : 플레이어2");
		}
	}
}













