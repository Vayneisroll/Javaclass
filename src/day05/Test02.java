package day05;

public class Test02 {
	public static void main(String[] args){
		// 1 ~ 10
		int num = 1;
		do{
			System.out.println(num);
			num++;
		} while( num <= 10);
		
		// do-while�� while�� �޸� 
		// ���ǽ��� ���ʿ� �����̾�� 1���� ������ ����
		
		while(num == 0){ // false
			System.out.println("while ����?");
		}
		
		do{
			System.out.println("do - while ����?");
		} while(num==0);
	}
}






