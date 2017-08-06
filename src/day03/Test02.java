package day03;
/*
 * < 난수(랜덤수) 생성 >
 *  Math.random() 
 * : 0.0 ~ 0.999999999.. 중 1개의 실수를 반환
 * 
 *  1) 랜덤 수 뽑기 
 *  	- 1 ~ 45 중 1개를 뽑겠다!
 *  
 *  2) 일정 확률에 따른 이벤트 발생
 *  	- 20% 확률로 치명타!
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
//		1 ~ 10 중 1개 뽑기
		int rand = (int)(Math.random()*10)+1;
		System.out.println(rand);
		
//		2 ~ 9 중 1개 뽑기
		rand = (int)(Math.random()*8)+2;
		System.out.println(rand);
		
//		(int)(Math.random() * 개수) + 시작수 
		
//		"Hello" / "bye" 를 출력
		String msg = Math.random() >= 0.5 ? "Hello" : "Bye";
		System.out.println(msg);
	}
}




