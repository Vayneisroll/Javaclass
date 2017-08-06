package day13;
/*
 * < 포장클래스(Wrapper classes) > 
 * - 원시자료형 데이터를 객체화할 때 사용되는 8가지
 * - Integer(int) , Short(short) , Byte(byte) , Long(long)
 *   Float(float) , Double(double)
 *   Character(char)
 *   Boolean(boolean)
 */
public class Test02 {
	public static void main(String[] args) {
		Object[] o = {10, 3.14, 'A', true, 10L}; 
		System.out.println(o[1].toString()); // 3.14
		
//		double n = 3.14;
//		System.out.println(n.toString());
		
//		Boxing과 unBoxing 
//		Boxing: 원시자료형 데이터를 객체화
//		unBoxing: 객체로 포장되어있던 원시자료형 데이터를 다시 꺼내는 것
		
		Integer n = 10; // 10-> Integer로 자동 객체화(Auto-boxing)되어 
		                // 그 레퍼런스가 저장됨
		System.out.println(n); // 10, toString()이 실행됨
		System.out.println(n + 1); 
		// 11-> 객체에 들어있던 10이 auto-unboxing되어 +1 연산이 됨 
		
		Integer.parseInt("100"); 
	}
}















