package day12;
/*
 * < �߻� Ŭ����, �߻� �޼ҵ� >
 * 1. �߻� �޼ҵ�? �ٵ� ���� �޼ҵ�
 *  => abstract ���������� ��ȯ�ڷ��� �޼ҵ�� (�Ű����� �ڷ���);
 *     (�ٵ�,{} ��ſ� ;���� ������) 
 *  => �̿ϼ� �޼ҵ�
 *  => �ڽ� Ŭ������ �� �̿ϼ��޼ҵ带 �ݵ�� �ϼ��ؾ� �Ѵ� 
 *     (�ٵ� �ۼ��ؾ� �Ѵ�)
 *  => ���� ���? �ڽ�Ŭ�������� '������' �������̵��� ����� �޼ҵ忡 ���
 *     �θ� ���忡�� ���� �ٵ� �� ������ ���⶧����..
 *     -> �׷��ٰ� �ƿ� �ȸ���� ������ ������ ��ƴ�.
 *  => �߻� Ŭ���������� ������ �� ����
 * 
 * 2. �߻� Ŭ���� 
 *  => Ŭ���� ���� �� �� �տ� abstract�� ���̸� 
 *  => �߻�޼ҵ带 ������ �� ����, �� �ܴ� �Ϲ� Ŭ������ �Ȱ���
 */
abstract class Hero {
	String name;
	int level;
	
	void attack(){
		System.out.println("���� �⵿!");
	}
	
	abstract void move(); // �߻� �޼ҵ� ����
						  // Hero�� �ڽ�Ŭ�������� move()�� �ݵ�� �ϼ��ؾ� ��
}
class Superman extends Hero {
	
	@Override
	void move() {
		System.out.println("���۸� ���ư���..!!");
	}
}
class Batman extends Hero {
	@Override
	void move() {
		System.out.println("��Ʈ�� �̵�!!!");
	}
}
class Spiderman extends Hero{
	@Override
	void move() {
		System.out.println("�����̴��� ����!!!");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Hero[] heros = {new Superman(), new Batman(), new Spiderman()};
		for(Hero h : heros){
			h.move();
		}
		Hero h = new Hero(){ // �͸� Ŭ���� (�Ｎ���� �������̵�)
			@Override
			void move() {
				System.out.println("���� h���� ���� move()");
			}
		}; 
		h.move(); 
	}
}





