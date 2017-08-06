package day04;

public class Test03 {
	public static void main(String[] args) {
		
		// 1 ~ 10
		int n = 1;
		while(n<= 10){
			System.out.println(n);
			n++;
		}
		
//		3이 나올 때까지 1~10 중 1개를 뽑음
		while(true){
			n = (int)(Math.random() *10 ) + 1;
			System.out.println("랜덤 : " + n);
//			if(n == 3){
//				break; // while을 종료하라
//			}
		}
	}
}







