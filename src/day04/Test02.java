package day04;

public class Test02 {
	public static void main(String[] args) {
		// 1 ~ 5
		int rand = (int)(Math.random() * 5) + 1;
		
		switch(rand){
		case 1: 
			System.out.println("������ ���� ����.. 1�̳�");
			break; // switch���� �����϶�
		case 2:
			System.out.println("��.. ���δ� 2��");
			break;// switch���� �����϶�
		case 3:
			System.out.println("�׷������̱� 3!");
			break;// switch���� �����϶�
		case 4: case 5:
			System.out.println("�� ������? 4 or 5����!!!");
			break;// switch���� �����϶�
		default: 
			System.out.println("case 1 ~ 5�ƴϸ� ������ ����");
		}
	}
}
