package day07;

class Pokemon {
	String name;
	int level;
	int hp; 
	void set(){
		int rand = (int)(Math.random()*5); // 0 ~ 4
		switch(rand){
		case 0: name = "��ī��"; break;
		case 1: name = "������"; break;
		case 2: name = "���̸�"; break;
		case 3: name = "���α�"; break;
		case 4: name = "����Ǯ"; break;
		}
		rand = (int)(Math.random()*5) + 1; // 1 ~ 5
		level = rand;
		hp = rand*100;
	}
	void show(){
		System.out.println("===���ϸ� ����===");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + level);
		System.out.println("ü�� : " + hp);
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












