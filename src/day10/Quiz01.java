package day10;
/*
 * final : 최후의, 변경할 수 없는
 *  1) 클래스 : 상속할 수 없다
 *  2) 메소드 : 오버라이드 할 수 없다 (오버로드는 가능)
 *  3) 필드(멤버변수) : 값을 변경할 수 없다 (상수로 만들겠다!)
 *  
 *  static final : 사용자 정의 상수
 *   e.g. 프로그램에서 ..
 *     표준대기압, 황금비, 지구의 둘레 등의 절대적인 데이터가 
 *     사용된다면, 이를 static final로 선언
 *   e.g. Math.PI  
 *  => ALL대문자, 띄어쓰기대신 _로 표기 
 *  e.g. MAX_VALUE GOLDEN_RATIO 
 */

class MyMath{
	
	static double pi = 3.14;
	final int a = 100;
	
	
	// 반지름을 인자값으로, 원의 넓이를 리턴하는
	// getCircleArea() 를 static 메소드로 선언하세요
	static double getCircleArea(double radius){
		return radius * radius * pi;
	}
	// 반지름을 인자값으로, 원의 둘레를 리턴하는
	// getCircleCircum() 를 static 메소드로 선언하세요
	static double getCircleCircum(double radius){
		return radius * 2 * 3.14;
	}
	// 밑변, 높이를 인자값으로, 
	// 사각형의 넓이를 리턴하는 
	// getRectangleArea()를 static 메소드로 선언하세요
	static double getRectangleArea(double h, double b){
		return h*b;
	}
}
public class Quiz01 {
	// 위의 MyMath의 메소드들을 선언이 호출+결과 출력
	public static void main(String[] args) {
		System.out.println(MyMath.getCircleArea(10));
		System.out.println(MyMath.getCircleCircum(100));
		System.out.println(MyMath.getRectangleArea(10, 20));
	}
	
}
