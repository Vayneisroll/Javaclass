package day11;
/*
 * < ������(polymorphism) >
 * - ��ī�� ������ �Ǿ��ٰ� ���̸��� �Ǿ��ٰ�, Ǫ���� �Ǿ��ٰ�..
 * - ��ü�� ������ ���ϴ� ��
 * - ���۷��� ����ȯ
 * - �θ�Ÿ�� ���۷��� ���� = �ڽ� ��ü�� ���۷���
 *  => �ش� �ڽ�Ÿ��ó�� �ൿ��
 * - ����, �θ�������� �νĵǱ� ������ 
 *   �θ� ������ ���,�޼ҵ�, �������̵�� �޼ҵ������ �νĵ�
 *   �ڽ� ������ ����� ����ϰ� �ʹٸ�, ��������ȯ�� �ؾ� ��
 * - *** �θ�Ÿ����, ��� �ڽ�Ÿ�� ��ü�� ��ȭ�� �� �ִ� 
 * - Upcasting  : �ڽ� ��ü�� �θ�Ÿ������ ����ȯ=> �ڵ�����ȯ
 * 				Pokemon p = new Pikachu(); 
 * 				// Pikachu��ü�� Pokemon���� upcasting 
 * - Downcasting : �θ� Ÿ������ �νĵƴ� �ڽ� ��ü�� �ٽ� �ڽ�Ÿ������ �ǵ����� ��
 *  	Pokemon p = new Pikachu(); 
 *  	Pikachu pika = (Pikachu)p; 
 * 
 * < �������� �뵵 > 
 * 1. �迭�� �پ��� Ÿ���� ��ü�� ������ �� �ִ�.
 *   Pokemon[] ����.. ��ī��, ���̸�, ���α�... �ڽ� ��ü�� ��ΰ� ����ִ�. 
 * 2. ���ڰ����� �پ��� Ÿ���� ��ü�� ���� �� �ִ�
 *   �Ű������� Pokemon�̶��, ���� ��ī��, ���̸�, ���α�.. �� �� �� �ִ�.
 *   
 */
class Pokemon {
	String name;
	int hp;
	void attack(){
		System.out.println("���ϸ� ���� ����!");
	}
	Pokemon(String name, int hp){
		this.name = name;
		this.hp = hp;
	}
}
class Pikachu extends Pokemon{
	
	String master = "����"; 
	
	Pikachu(){
		super("��ī��", 100);
	}
	@Override
	void attack(){
		System.out.println("��ī�� �鸸��Ʈ ����!");
	}
}
class Raichu extends Pokemon{
	Raichu(){
		super("������", 200);
	}
	@Override 
	void attack(){
		System.out.println("������ õ����Ʈ ����!");
	}
}
class Pairi extends Pokemon{
	Pairi(){
		super("���̸�", 150);
	}
	@Override 
	void attack(){
		System.out.println("���̸� �Ҳ� ����!");
	}
}
class Ggobugi extends Pokemon{
	Ggobugi(){
		super("���α�", 150);
	}
	@Override 
	void attack(){
		System.out.println("���α� ������ ����!");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Pokemon p;
		
		// p�� ��ī���
		p = new Pikachu();
		p.attack();
		
		// p�� �������
		p = new Raichu();
		p.attack();
		
		// p�� ���α��
		p = new Ggobugi();
		p.attack();
				
		Pokemon p1 = new Pikachu();
		System.out.println(((Pikachu)p1).master);
		// �θ�Ÿ������ �ڽİ�ü�� ������ ��, 
		// �ڽ��� ��������� �ν��� �ȵż�.. ��������ȯ �ؾ� �� 
		// (Pikachu)p1.master (X) 
		//  => p1.master�� Pikachu�� ����ȯ�ϰڴٴ� ���� ��
		//  => . : �켱���� 1������
		
	}
}





















