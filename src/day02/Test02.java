 package day02;

public class Test02 {
	public static void main(String[] args){
		// ���� ���� : �ڷ��� ������; 
		// ������? ������ 1���� �����ϴ� �׸� ������ ���׸��� �޸� 
		int n1 = 10; // n1 �ʱ�ȭ 
//		int n2 = 10.0; (X)
		// int a = b; => b�� ���� a�� ����
		double pi = 3.14; // pi �ʱ�ȭ 
		double area;
		
		
		
//		����! �ʱ�ȭ���� ����(�����Ⱚ�� �����ִ�) ������
//		���� X / ��� X 
//		System.out.println(area); (X) �ʱ�ȭ�� �ؿ� ����..
		
		area = n1 * n1 * pi; // area �ʱ�ȭ 
		
		System.out.println("������ "+n1+"�� ���� ����:"+area);
		
		// n1 �� ����
		n1 = 100;
		System.out.println("������ "+n1+"�� ���� ����:"+area);
//		n1�� ���Ѵٰ� �ؼ� area ���ϴ� �� �ƴ�!
		
		area = n1 * n1 * pi; // area�� ���� ��������� ��
		System.out.println("������ "+n1+"�� ���� ����:"+area);
		
		String str = null;
		System.out.println(str + "ABC"); // null
		
		String str2 = "";// Empty string(���ڿ�)
		System.out.println(str2 + "ABC");
	}
}






