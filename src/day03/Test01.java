package day03;

public class Test01 {

	public static void main(String[] args) {
//		1. 산술연산자( + - * / % )
//		 1) / : 정수/정수 => 정수 
//		 2) %(나머지 연산자, mod) : 나머지 반환
//		   => 배수 판별, 짝/홀수 판별
		int a = 10;
		System.out.println(a % 3); // 1
		
//		======================================
		
//		2. 대입연산자( = )
//		     복합대입연산자 ( += -= *= /= %= )
//		   => 저장 (왼쪽의 대상에)
		a += 1; // a = a + 1; ( a에 1을 누적하라 )
		System.out.println(a); // 11
		a %= 4; // a = a % 4; 
		System.out.println(a); // 3
		
//		3. 증감연산자( ++ -- ) 
//		++a / a++ : a = a+1
//		--a / a-- : a = a-1
		
//		전위연산(전치연산) : ++a or --a
//		후위연산(후치연산) : a++ or a--
		
//		CPU의 특성상, 연산은 여러 개를 동시에 처리하지 못한다.
//		연산은 한 개씩 수행된다. 
//		 한 개 -> 결과 반환 -> 그 다음 수행 -> 결과 반환
		
//		한 명령문(....;)에 여러 연산(명령)이 있을 경우, 
//		하나씩 처리함.. 
//		  전치 : 가장 먼저 증/감 후 다른 연산을 수행
//		  후치 : 다른 연산을 먼저 수행하고 마지막 증/감
		a++;
		++a;
		System.out.println(a); // 5
		
		System.out.println(--a); // 4
		System.out.println(a--); // 4
		System.out.println(a);	 // 3
		
		/*
		 * 	< 연산자 우선순위 >
		 *  1) () [] .
		 *  2) ++ -- (전치연산) 
		 *  3) * / %
		 *  4) + - 
		 *  5) 후치연산
		 *  6) = += -= ..
		 *  7) , 
		 */
		
//		4. 관계연산자 : < <= > >= == !=
//		같다 : ==
//		다르다 : !=
//		반환값은 boolean타입이다. (true/false)
		boolean b = a >= 10; 
		System.out.println(b); // false
		
//		5. 논리연산자 : && || !
//		 1) &&(논리 AND 연산자) : 양 수식이 모두 참이어야 최종 true
//		 2) ||(논리 OR 연산자) : 둘 중 하나라도 참이면 최종 true
//		 3) ! (논리 NOT 연산자) : 참->거짓 / 거짓->참으로 바꿔서 반환
//		b = 10 >= 20 || 1 != 2 ;
		b = 1 != 2 || 10 >= 20 ;
		System.out.println(b); // true
		
//		6. 조건연산자 : 조건식?참이면 선택 값:거짓이면 선택 값
		int n1 = 10; 
		int n2 = 20;
		int max = n1 > n2 ? n1 : n2; 
		System.out.println("큰 수 : " + max); // 20
		System.out.println("큰 수 : " + (n1 > n2 ? n1 : n2)); // 20
		
//		7. 캐스팅연산자(형변환연산자) : (자료형)
//		 * 형변환? 데이터의 자료형을 일시적으로 변환
//		1) 자동형변환 - 자동으로 해줌(데이터 손실 우려가 없으면 해줌)
		double n3 = 3; // 3 -> 3.0으로 자동 형변환
		int n4 = 'A'; // 'A'-> 65로 자동 형변환 
		
//		2) 강제형변환 - 개발자가 함
//		int n5 = 3.0; // 에러! 데이터 손실을 걱정..
		int n5 = (int)3.9; 
		System.out.println(n5); // 3 (반올림 X) 
		
	}
}









