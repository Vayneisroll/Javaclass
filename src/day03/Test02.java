package day03;
/*
 * < ����(������) ���� >
 *  Math.random() 
 * : 0.0 ~ 0.999999999.. �� 1���� �Ǽ��� ��ȯ
 * 
 *  1) ���� �� �̱� 
 *  	- 1 ~ 45 �� 1���� �̰ڴ�!
 *  
 *  2) ���� Ȯ���� ���� �̺�Ʈ �߻�
 *  	- 20% Ȯ���� ġ��Ÿ!
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
//		1 ~ 10 �� 1�� �̱�
		int rand = (int)(Math.random()*10)+1;
		System.out.println(rand);
		
//		2 ~ 9 �� 1�� �̱�
		rand = (int)(Math.random()*8)+2;
		System.out.println(rand);
		
//		(int)(Math.random() * ����) + ���ۼ� 
		
//		"Hello" / "bye" �� ���
		String msg = Math.random() >= 0.5 ? "Hello" : "Bye";
		System.out.println(msg);
	}
}




