package day07;

class Pokemon {
	String name;
	int level;
	int hp; 
	void set(){
		int rand = (int)(Math.random()*5); // 0 ~ 4
		switch(rand){
		case 0: name = "피카츄"; break;
		case 1: name = "라이츄"; break;
		case 2: name = "파이리"; break;
		case 3: name = "꼬부기"; break;
		case 4: name = "버터풀"; break;
		}
		rand = (int)(Math.random()*5) + 1; // 1 ~ 5
		level = rand;
		hp = rand*100;
	}
	void show(){
		System.out.println("===포켓몬 정보===");
		System.out.println("이름 : " + name);
		System.out.println("레벨 : " + level);
		System.out.println("체력 : " + hp);
	}
}
public class Quiz02 {
	public static void main(String[] args) {
		Pokemon[] p = {
				new Pokemon(),
				new Pokemon(),
				new Pokemon(),
				new Pokemon()
				};
		
		for(int i = 0; i<p.length; i++){
			p[i].set();
			p[i].show();
		}
	}
}












