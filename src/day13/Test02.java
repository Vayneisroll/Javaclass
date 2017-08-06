package day13;
/*
 * < ����Ŭ����(Wrapper classes) > 
 * - �����ڷ��� �����͸� ��üȭ�� �� ���Ǵ� 8����
 * - Integer(int) , Short(short) , Byte(byte) , Long(long)
 *   Float(float) , Double(double)
 *   Character(char)
 *   Boolean(boolean)
 */
public class Test02 {
	public static void main(String[] args) {
		Object[] o = {10, 3.14, 'A', true, 10L}; 
		System.out.println(o[1].toString()); // 3.14
		
//		double n = 3.14;
//		System.out.println(n.toString());
		
//		Boxing�� unBoxing 
//		Boxing: �����ڷ��� �����͸� ��üȭ
//		unBoxing: ��ü�� ����Ǿ��ִ� �����ڷ��� �����͸� �ٽ� ������ ��
		
		Integer n = 10; // 10-> Integer�� �ڵ� ��üȭ(Auto-boxing)�Ǿ� 
		                // �� ���۷����� �����
		System.out.println(n); // 10, toString()�� �����
		System.out.println(n + 1); 
		// 11-> ��ü�� ����ִ� 10�� auto-unboxing�Ǿ� +1 ������ �� 
		
		Integer.parseInt("100"); 
	}
}















