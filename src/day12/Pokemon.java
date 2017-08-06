package day12;
/*
 * < �������̽� > 
 * - Ŭ���� �ƴ�
 *  : ��ü ���� X / ���۷��� �����δ� ���� ����
 * - ��ü�� ����
 * - �Ծ�, ���
 *  e.g. ��� ���ϸ� Ŭ�������� �̵��޼ҵ� move()�� �Ѵ�...
 *                           ���ݸ޼ҵ�� attack()���� �Ѵ�..
 *       ���ϸ��� �ִ� ũ�� 1000�ȼ��� �Ѵ�.. 
 * - ���, �߻�޼ҵ�, default�޼ҵ常 ���� ����
 * - �� �������̽��� �����ϴ� (��üȭ�ϴ�) Ŭ������ 
 *   '���� Ŭ����'����Ѵ�.
 * - ������ ���� Ŭ���� ���� �� implements�� ����
 * - �������̽� ���� ���� ��� ����
 * - �ϳ��� Ŭ������ ���� ���� �������̽��� ������ �� �ִ�  
 */
interface A{}
interface B{}
interface C extends A, B{}

public interface Pokemon {
	
	// String name; (X) ���� ������ �ƴ϶� ����.. 
	/*public static final*/double MAX_PIXEL = 1000; 
	double PI = 3.14;
	
	/*public abstract*/ void move(); 
	void attack(Pokemon enemy);
	default void greeting(){
		System.out.println("���ϸ� ���忡 ���� ���� ȯ���մϴ�~"); 
	}
}

class Pikachu implements Pokemon {
	
	@Override
	public void move() {
		System.out.println("��ī ��ī");
	}
	
	@Override
	public void attack(Pokemon enemy) {
		System.out.println("�鸸��Ʈ ����!");
	}
}

class Raichu implements Pokemon {
	@Override
	public void move() {
		System.out.println("���� ���� ~");
	}
	
	@Override
	public void attack(Pokemon enemy) {
		System.out.println("õ����Ʈ ����!");
	}
}





