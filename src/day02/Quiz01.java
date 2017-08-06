package day02;

public class Quiz01 {
	
	public static void main(String[] args){
		String name = "피카츄"; // 이름
		int age = 10; // 나이
		String phone = "010-1234-5678"; // 연락처
		double tall = 110.4; // 키
		String address = "서울시 구로구 가리봉동"; // 주소
		
		int base = 4; 
		int height = 3; 
		// 밑변 4, 높이 3인 삼각형 넓이, 사각형 넓이
		double triangleArea = base * height * 0.5;
		float rectangleArea = base * height; 
		// 위의 모든 변수를 sysout
		
		System.out.println("이름 : "+ name);
		System.out.println("나이 : " + age + "세");
		System.out.println("연락처 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("키 : " + tall + "cm");
		
		System.out.print("밑변 " + base + ", ");
		System.out.print("높이 " + height + "인 ");
		System.out.println("삼각형의 넓이 : " + triangleArea);
		System.out.println("사각형의 넓이 : " + rectangleArea);
	}
}









