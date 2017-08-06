package day11;
/*
 * �θ� : Unit Ŭ���� �����
 * 	�ʵ� - �̸�, ü��, ���ݷ�, alive(boolean) 
 *  �޼ҵ� - showData():��� ���� sysout
 *  		attack(Unit enemy): ����� ü���� �� ������ ���ݷ¸�ŭ ����
 *  		������ : �̸�, ü��, ���ݷ� ���ڰ����� �ְ� ��ü ����..
 *                  (alive�� true���� ��)   
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
		System.out.println(this.name+"�� ����!! -"+this.attack);
		enemy.hp -= this.attack;
		System.out.println("��� "+ enemy.name+"�� ���� ü��:" + enemy.hp);
	}
	
	void showData(){
		System.out.println("======"+this.name+"�� ����======");
		System.out.println("�̸� : " + name);
		System.out.println("ü�� : " + hp);
		System.out.println("���ݷ� : " + attack);
	}
}
 /*                  
 * �ڽ� : Tank, Sniper Ŭ����
 *  1) Tank - 
 *  	�̸�: "��ũ", ü��:1000, ����:50
 *      attack() �������̵�
 *      	: 50������ Ȯ���� 200������, �ƴϸ� �׳� ��Ÿ(���ݷ�)
 */
class Tank extends Unit{
	
	Tank(){
		super("��ũ", 1000, 50);
	}
	
	@Override
	void attack(Unit enemy){
		int att = Math.random()>0.5? 200 : attack ;
		System.out.println(this.name+"�� ����!! -"+att);
		enemy.hp -= att;
		System.out.println("��� "+ enemy.name+"�� ���� ü��:" + enemy.hp);
		if(enemy.hp <= 0){
			enemy.alive = false;
		}
	}
}
 /*      
 *  2) Sniper - 
 *  	 �̸�: "���ݼ�", ü��:800, ����:250
 *  	attack() �������̵� 
 *  		: 30������ Ȯ���� ��븦 ���, �ƴϸ� �׳� ��Ÿ
 */

class Sniper extends Unit{
	
	Sniper(){
		super("���ݼ�", 800, 250);
	}
	
	@Override
	void attack(Unit enemy) {
		int att = Math.random()>0.7? enemy.hp : attack ;
		System.out.println(this.name+"�� ����!! -"+ att);
		enemy.hp -= att;
		System.out.println("��� "+ enemy.name+"�� ���� ü��:" + enemy.hp);
		if(enemy.hp <= 0){
			enemy.alive = false;
		}
	}
}

/*  
*  < ���θ޼ҵ� >
*   �����ϰ� �� ������ ����
*   �� �� �ϳ��� ���� ������ ���� ����
*/
public class Quiz02 {
	public static void main(String[] args) {
		Unit u1, u2; 
		u1 = (Math.random()>0.5) ? new Tank() : new Sniper();
		u2 = (Math.random()>0.5) ? new Tank() : new Sniper();
		
		System.out.println("�÷��̾�1 �����Ϸ�!");
		u1.showData();
		
		System.out.println("�÷��̾�2 �����Ϸ�!");
		u2.showData();
		
		while(true){
			if(u1.alive){
				System.out.println("�÷��̾�1�� ����!");
				u1.attack(u2);
				if(!u2.alive){
					break;
				}
			}
			if(u2.alive){
				System.out.println("�÷��̾�2�� ����!");
				u2.attack(u1);
				if(!u1.alive){
					break;
				}
			}
		}
		if(u1.alive){
			System.out.println("�¸� : �÷��̾�1");
		}else {
			System.out.println("�¸� : �÷��̾�2");
		}
	}
}













