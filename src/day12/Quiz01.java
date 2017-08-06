package day12;

import javax.swing.JOptionPane;

/*
 * 부모클래스 : Shape
 */
abstract class Shape{
	abstract double getArea();
}
 /* 
 * 자식클래스 : 
 * 1) Circle 
 * 	필드 : radius
 *  메소드 : 
 *  	1) 생성자 : 반지름 넣고 생성
 *  	2) getArea() : 필드로 가지고 있는 반지름을 사용하여 가진 원의 넓이 return
 */
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}
}
 /*  
 * 2) Rectangle
 *  필드 : base, height;
 *  메소드 : 
 *  	1) 생성자 : 밑변, 높이 넣고 생성 
 *  	2) getArea() : base, height 필드로 사각형 넓이 구해서 return
 */
class Rectangle extends Shape{
	double base, height;
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		return base * height;
	}
}
 /*  
 * 3) Triangle
 * 	필드 : base, height;
 * 		1) 생성자 : 밑변, 높이 넣고 생성 
 *  	2) getArea() : base, height 필드로 삼각형 넓이 구해서 return
 */
class Triangle extends Shape{
	double base, height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	@Override
	double getArea() {
		return base * height * 0.5;
	}
}
 /* 
 * 
 * 메인 클래스 : Quiz01
 *  메뉴 : 
 *  	1. 원의 넓이 -> 반지름을 입력 받고, 넓이 알려줌 
 *   	2. 사각형의 넓이  -> 밑변, 높이 입력 받고, 넓이 알려줌
 *   	3. 삼각형의 넓이  -> 밑변, 높이 입력 받고, 넓이 알려줌
 *   	4. 종료
 */


public class Quiz01 {
	public static void main(String[] args) {
		Shape sh = null;
		String message = "1. 원의 넓이 \n"
						+ "2. 사각형 넓이 \n"
						+ "3. 삼각형 넓이\n"
						+ "4. 종료하기";
		String select;
		while(true){
			select = JOptionPane.showInputDialog(message);
			if(select.equals("1")){
				String sRadius = JOptionPane.showInputDialog("반지름");
				double radius = Double.parseDouble(sRadius);
				sh = new Circle(radius);
				JOptionPane.showMessageDialog(null, "원의 넓이 : " + sh.getArea());
			} else if(select.equals("2")){
				double base, height;
				String sData;
				sData = JOptionPane.showInputDialog("밑변");
				base = Double.parseDouble(sData);
				sData = JOptionPane.showInputDialog("높이");
				height = Double.parseDouble(sData);
				
				sh = new Rectangle(base, height);
				JOptionPane.showMessageDialog(null, "사각형의 넓이 : " + sh.getArea());
			} else if(select.equals("3")){
				double base, height;
				String sData;
				sData = JOptionPane.showInputDialog("밑변");
				base = Double.parseDouble(sData);
				sData = JOptionPane.showInputDialog("높이");
				height = Double.parseDouble(sData);
				
				sh = new Triangle(base, height);
				JOptionPane.showMessageDialog(null, "사각형의 넓이 : " + sh.getArea());
			} else if(select.equals("4")){
				return;
			}
		}
	}
}





