package day04;

public class Test03 {
	public static void main(String[] args) {
		
		// 1 ~ 10
		int n = 1;
		while(n<= 10){
			System.out.println(n);
			n++;
		}
		
//		3�� ���� ������ 1~10 �� 1���� ����
		while(true){
			n = (int)(Math.random() *10 ) + 1;
			System.out.println("���� : " + n);
//			if(n == 3){
//				break; // while�� �����϶�
//			}
		}
	}
}







