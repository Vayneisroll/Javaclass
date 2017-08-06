package day08;

public class Pokemon {
	// 필드 선언 
	String name;
	int level, attack, hp;
	
	// 모든 정보 출력 : showData()
	void showData(){
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("공격력 : " + attack);
		System.out.println("체력 : " + hp);
		//return;
	}
	
	void setData(String n, int l, int a, int h){
		name = n;
		level = l;
		attack = a;
		hp = h;
	}
	
	String getData(){
		return "이름:"+name+"\n"
				+"레벨:" + level +"\n"
				+"공격력:" + attack+"\n"
				+"체력:" + hp; 
	}
	String getAttackMessage(Pokemon enemy){
		return name+"(이)가 " + enemy.name+"(을)를 공격! -" + attack;
	}
	void reduceEnemy(Pokemon enemy){
		enemy.hp -= attack; // 이 객체의 공격력만큼 상대의 체력을 감소
	}
	String getEnemyMessage(Pokemon enemy){
		return enemy.name+"의 남은 체력 :" + enemy.hp;
	}
	
	void fight(Pokemon enemy){
		System.out.println(getAttackMessage(enemy));
		reduceEnemy(enemy);
		System.out.println(getEnemyMessage(enemy));
	}
	
	// 메소드는 다른 클래스와 결합도가 낮아야 한다
	// (메소드 내부에 다른 클래스가 사용되면.. 활용성 떨어짐) 
	
}




