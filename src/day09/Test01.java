package day09;
/*
 * < �޼ҵ� �����ε�(overload) > 
 * - �ϳ��� �޼ҵ带 ���� �������� ����� ��
 * - �޼ҵ��� Ư¡��..
 *   �Ű������� ���ڰ��� ������ �ڷ����� �¾ƾ���..
 *   ������ 1�� �ְ� �Ͱ�, ������ 2�� �ְ� �Ͱ�.. 
 *   
 * - �̸��� ����, ��ɵ� ���, 
 *   ��.. �Ű����� ���� or �ڷ����� ���̰� �־����
 *   
 * - �����ڷ����� �������(�޶� ��)
 * - �Ű����� �̸��� �ٸ��ٰ� �ؼ� �����ε� �Ǵ� �� �ƴ�
 * ex. show(String a){} / show(String b){} => error!!
 * 
 */
class A{
	void show(String s){
		System.out.println("���ڰ� : " + s);
	}
	int show(int s){
		System.out.println("���ڰ� : " + s);
		return 0;
	}
	
	int show(boolean s){
		System.out.println("���ڰ� : " + s);
		return 0;
	}
}
public class Test01 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println();
		
		A a = new A();
		a.show("ABC");
		a.show(1);
		a.show(true);
	}
}
