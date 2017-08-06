package day04;

public class Test02 {
	public static void main(String[] args) {
		// 1 ~ 5
		int rand = (int)(Math.random() * 5) + 1;
		
		switch(rand){
		case 1: 
			System.out.println("오늘은 운이 없네.. 1이넹");
			break; // switch문을 종료하라
		case 2:
			System.out.println("음.. 별로당 2네");
			break;// switch문을 종료하라
		case 3:
			System.out.println("그럭저럭이군 3!");
			break;// switch문을 종료하라
		case 4: case 5:
			System.out.println("좀 괜찮네? 4 or 5나옴!!!");
			break;// switch문을 종료하라
		default: 
			System.out.println("case 1 ~ 5아니면 무조건 실행");
		}
	}
}
