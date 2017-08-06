package day05;
/*
 * break	:자신이 속한 switch, 반복문을 종료한다 => 반복 끝냄 
 * continue :자신이 속한 반복문의 남아있는 종속문장을 건너뛴다 => 반복 유지
 * return	:자신이 속한 메소드를 종료하라
 */
public class Test03 {
	public static void main(String[] args){
		
		System.out.println("break test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) break; // for문 끝내라
			System.out.println(i);
		}
		System.out.println("continue test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) continue;
			System.out.println(i);
		}
		System.out.println("return test..");
		for(int i = 10; i>=1; i--){
			if(i%4==0) return; // 메소드 끝내라
			System.out.println(i);
		}
	}
}



