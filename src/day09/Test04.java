package day09;
/*
 * static : 정적인, 고정된 
 *  1) 무조건 만들어진다 => 객체 생성 안해도 된다
 *  2) 1개만 만들어진다 => 같은 타입의 객체가 1개를 공유한다
 * => 메소드, 멤버변수 (멤버)에 선언 
 */

import javax.swing.JOptionPane;

class Circle {
	static double getArea(double r){
		return r * r * 3.14; // Math.PI
	}
}
public class Test04 {
	public static void main(String[] args) {
		
		// 메소드를 사용하려면 반드시 객체 생성을 해야했다. 
		System.out.println(Math.random());
		JOptionPane.showInputDialog("asd");
		
		// 선언될 때 앞에 static이 붙은 메소드/멤버변수는 
		// 객체생성을 하지 않아도 사용가능
		// (이미 시작할 때 미리 만들어졌기때문)
		System.out.println(Circle.getArea(10));
		// static 멤버 호출 : 클래스명.멤버명
		Circle c = new Circle();
		System.out.println(c.getArea(10));
	}
}




