package day05;
/*
 * break	:�ڽ��� ���� switch, �ݺ����� �����Ѵ� => �ݺ� ���� 
 * continue :�ڽ��� ���� �ݺ����� �����ִ� ���ӹ����� �ǳʶڴ� => �ݺ� ����
 * return	:�ڽ��� ���� �޼ҵ带 �����϶�
 */
public class Test03 {
	public static void main(String[] args){
		
		System.out.println("break test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) break; // for�� ������
			System.out.println(i);
		}
		System.out.println("continue test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) continue;
			System.out.println(i);
		}
		System.out.println("return test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) return; // �޼ҵ� ������
			System.out.println(i);
		}
	}
}



