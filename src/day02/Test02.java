 package day02;

public class Test02 {
	public static void main(String[] args){
		// 변수 선언 : 자료형 변수명; 
		// 변수란? 데이터 1개를 저장하는 그릇 역할의 조그마한 메모리 
		int n1 = 10; // n1 초기화 
//		int n2 = 10.0; (X)
		// int a = b; => b의 값을 a에 저장
		double pi = 3.14; // pi 초기화 
		double area;
		
		
		
//		주의! 초기화되지 않은(쓰레기값이 남아있는) 변수는
//		연산 X / 출력 X 
//		System.out.println(area); (X) 초기화가 밑에 있음..
		
		area = n1 * n1 * pi; // area 초기화 
		
		System.out.println("반지름 "+n1+"인 원의 넓이:"+area);
		
		// n1 값 변경
		n1 = 100;
		System.out.println("반지름 "+n1+"인 원의 넓이:"+area);
//		n1이 변한다고 해서 area 변하는 거 아님!
		
		area = n1 * n1 * pi; // area도 따로 변경해줘야 함
		System.out.println("반지름 "+n1+"인 원의 넓이:"+area);
		
		String str = null;
		System.out.println(str + "ABC"); // null
		
		String str2 = "";// Empty string(빈문자열)
		System.out.println(str2 + "ABC");
	}
}






