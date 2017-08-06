package day08;

public class Pokemon {
	// �ʵ� ���� 
	String name;
	int level, attack, hp;
	
	// ��� ���� ��� : showData()
	void showData(){
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + level);
		System.out.println("���ݷ� : " + attack);
		System.out.println("ü�� : " + hp);
		//return;
	}
	
	void setData(String n, int l, int a, int h){
		name = n;
		level = l;
		attack = a;
		hp = h;
	}
	
	String getData(){
		return "�̸�:"+name+"\n"
				+"����:" + level +"\n"
				+"���ݷ�:" + attack+"\n"
				+"ü��:" + hp; 
	}
	String getAttackMessage(Pokemon enemy){
		return name+"(��)�� " + enemy.name+"(��)�� ����! -" + attack;
	}
	void reduceEnemy(Pokemon enemy){
		enemy.hp -= attack; // �� ��ü�� ���ݷ¸�ŭ ����� ü���� ����
	}
	String getEnemyMessage(Pokemon enemy){
		return enemy.name+"�� ���� ü�� :" + enemy.hp;
	}
	
	void fight(Pokemon enemy){
		System.out.println(getAttackMessage(enemy));
		reduceEnemy(enemy);
		System.out.println(getEnemyMessage(enemy));
	}
	
	// �޼ҵ�� �ٸ� Ŭ������ ���յ��� ���ƾ� �Ѵ�
	// (�޼ҵ� ���ο� �ٸ� Ŭ������ ���Ǹ�.. Ȱ�뼺 ������) 
	
}




